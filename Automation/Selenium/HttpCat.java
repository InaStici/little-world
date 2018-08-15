package com.kprikorn.practice3;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpCat {

	private static Pattern ptn = Pattern.compile("(<span>)(\\d{3})");

	public static void main(String[] args) {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			String host = "https://http.cat/";
			HttpGet httpget = new HttpGet(host);
			httpget.addHeader("accept", "application/json");
			System.out.println("Executing request " + httpget.getRequestLine());

			// Create a custom response handler
			ResponseHandler<String> responseHandler = new ResponseHandler<String>() {

				@Override
				public String handleResponse(final HttpResponse response) throws ClientProtocolException, IOException {
					int status = response.getStatusLine().getStatusCode();
					if (status >= 200 && status < 300) {
						HttpEntity entity = response.getEntity();
						return entity != null ? EntityUtils.toString(entity) : null;
					} else {
						throw new ClientProtocolException("Unexpected response status: " + status);
					}
				}

			};
			String responseBody = "";
			try {
				responseBody = httpclient.execute(httpget, responseHandler);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
			// getting a list of valid HTTP codes from response

			Matcher mtch = ptn.matcher(responseBody);
			List<String> httpcodes = new ArrayList<String>();
			while (mtch.find()) {
				// System.out.println(mtch.group(2));
				httpcodes.add(mtch.group(2));
			}

			// for (int i = 0; i < httpcodes.size(); i++) {
			// System.out.println(httpcodes.get(i));
			// }

			// making requests to get the images

			try {
				for (int i = 0; i < httpcodes.size(); i++) {

					HttpGet httpgetimage = new HttpGet(host + httpcodes.get(i));

					httpget.addHeader("accept", "application/json");
					String responseImage = httpclient.execute(httpgetimage, responseHandler);
					// System.out.println(responseImage);

					// writing to files

					URL input = new URL(host + httpcodes.get(i));
					BufferedImage image = ImageIO.read(input);
					ImageIO.write(image, "jpg", new File("cats/cat" + httpcodes.get(i) + ".jpg"));
					System.out.println("saving image for" + httpcodes.get(i));

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}

			// System.out.println(responseBody);
		} finally {
			try {
				httpclient.close();
				System.out.println("done");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
