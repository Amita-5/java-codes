/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int year = sc.nextInt();
	    System.out.println("the year is " + year);
	    if (year%400==0 || year%100!=0){
	        System.out.println(year +" is leap year");
	    }
		else{
		    System.out.println(year +" is not leap year");
		}
	}
}
