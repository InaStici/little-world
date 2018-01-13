package exercises;

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing_6_29 {

	private enum Coin {
		HEADS, TAILS
	};

	static int heads = 0;
	static int tails = 0;
	// static int face;
	static Coin coinStatus;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of tosses:");
		int nrOfTosses = sc.nextInt();

		while (nrOfTosses <= 0) {
			System.out.println("Enter number of tosses:");
			nrOfTosses = sc.nextInt();
		}
		
		for (int toss = 1; toss <= nrOfTosses; toss++) {

			flip();
		}

		System.out.println("Face\tFrequency");
		System.out.printf("Heads\t%d%nTails\t%d%n", heads, tails);

	}

	public static void flip() {
		SecureRandom rand = new SecureRandom();

		int face = rand.nextInt(2);
		switch (face) {
		case 0:
			coinStatus = Coin.HEADS;
			// System.out.print(coinStatus);
			++heads;
			break;
		case 1:
			coinStatus = Coin.TAILS;
			// System.out.print(coinStatus);
			++tails;
			break;
		}
	}

}
