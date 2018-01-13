package exercises;

public class SquareAndCube {

	public static void main(String[] args) {
		
		//String[] str = {"square","cube"};
		int[] numbers = {0,1,2,3,4,5,6,7,8,9,10};
		int i;
		int number;
		int square;
		int cube;
				
		System.out.println("number" +"\t"+ "square" +"\t"+ "cube");
		
		for (i = 0; i <= 10; i++) {
			number = i;
			square = i * i;
			cube = i * i * i;
			
			System.out.println(number + "\t" + square + "\t" + cube);
			//System.out.println(cube);
		}		
		
	}

}
