
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int a =7;
		int b = ++a * 7;
	    char c = 'y';
		System.out.println(b);
		System.out.println(++c);
		float z= 7/4.0f*9/2.0f;
		System.out.println(z);
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		System.out.println(k>10);
	}
}
