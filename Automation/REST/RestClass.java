package seleniumPractice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class RestClass {
	public static String responseBody;

	public static void main(String[] args) {

		// reading dates from file
		String filename = "C:\\Users\\Inna\\eclipse-workspace\\mvnTest\\src\\main\\java\\file1.txt";
		List<String> list = new ArrayList<>();

		try (Stream<String> stream = Files.lines(Paths.get(filename))) {

			list = stream.collect(Collectors.toList());

		} catch (IOException e) {

		}

		list.forEach(System.out::println);

		// sending a GET request to bnm.md

		CloseableHttpClient httpclient = HttpClients.createDefault();

		try {
			for (int i = 0; i < list.size(); i++) {
				String host = "https://bnm.md/en/official_exchange_rates?get_xml=1&date=" + list.get(i);
				HttpGet httpget = new HttpGet(host);
				System.out.println("executing request:" + httpget.getRequestLine());
				ResponseHandler<String> responseHandler = new ResponseHandler<String>() {

					@Override
					public String handleResponse(final HttpResponse response)
							throws ClientProtocolException, IOException {
						int status = response.getStatusLine().getStatusCode();
						if (status >= 200 && status < 300) {
							HttpEntity entity = response.getEntity();
							return entity != null ? EntityUtils.toString(entity) : null;
						} else {
							throw new ClientProtocolException("Unexpected reposnse status:" + status);
						}

					}
				};
				responseBody = "";
				try {
					responseBody = httpclient.execute(httpget, responseHandler);
				} catch (IOException e) {
				}
				System.out.println(responseBody);

				//////////////////////////////
				try {
					FileOutputStream fileOut = new FileOutputStream("responseBNM" + list.get(i));
					ObjectOutputStream out = new ObjectOutputStream(fileOut);
					out.writeObject(responseBody);
					out.close();
					fileOut.close();
					System.out.printf("Serialized data is saved in responseBNM.ser");
				} catch (IOException o) {
					o.printStackTrace();
				}
				////////////////////////////

				// serialization xml > object

			}
		} finally {
			try {
				httpclient.close();
			} catch (IOException e) {
			}
		}

	}

}
