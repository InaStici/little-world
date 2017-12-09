package exercises;
import java.util.Scanner;
public class DecimalToBinary_Eqv_4_31 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a binary number:");
        int binary = input.nextInt();
        
        int decimal=0;
        int p=0;
        
        while(binary != 0)
        {
            decimal+=((binary%10)*Math.pow(2,p));
            binary = binary/10;
            p++;
        }
        
        System.out.println(decimal);
		

	}

}
