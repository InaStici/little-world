package exercises;

public class TabularOutput_4_22 {

	public static void main(String[] args) {

		System.out.println("N" + "\t" + "10*N" + "\t" + "100*N" + "\t" + "1000*N");

		for (int i = 0; i <= 5; i++) {
			int N = i;
			int NN = 10 * i;
			int NNN = 100 * i;
			int NNNN = 1000 * i;

			System.out.println(N + "\t" + NN + "\t" + NNN + "\t" + NNNN);

		}
	}
}
