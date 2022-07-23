import java.util.Scanner;
public class Calculator
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    float arithmetic;
    System.out.println("Enter num1 : ");
    float num1 = sc.nextFloat();
    System.out.println("Enter num2 : ");
    float num2 = sc.nextFloat();
    System.out.println("choose operator '+' ,'-','*','/'  : ");
    char operator = sc.next().charAt(0);
    switch(operator){
        // addition
        case '+' : 
            arithmetic = num1+num2;
            System.out.println("the sum of num1 and num2 is " + arithmetic );
            break;
        // subtraction 
        case '-' : 
            arithmetic = num1-num2;
            System.out.println("the subtraction of num1 by  num2 is " + arithmetic );
            break;
        //multiplication 
            case '*' : 
            arithmetic = num1*num2;
            System.out.println("the multiplication of num1 and num2 is " + arithmetic );
            break;
        // division
            case '/' : 
             arithmetic = num1/num2;
            System.out.println("the division of of num1 by num2 " + arithmetic );
            break;
            default : System.out.println("unknown operator");
    }
  }
}