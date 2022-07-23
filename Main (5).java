/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner eligible = new Scanner(System.in);
	    int age = eligible.nextInt();
		System.out.println("the age is "+ age);
		if(age>= 18){
		    System.out.println("eligible for vote");
		}
		else{
		    System.out.println("not eligible for vote");
		}
	}
}
