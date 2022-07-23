/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	   // to convert string into lowercase
	   String name= "SHRUTI";
		System.out.println(name.toLowerCase());
		// replacement of" " with "_"
		String h = "h e l l o";
		System.out.println(h.replace(" ", "_"));
		//assign name
		String letter = "dear <name> , thanks a lot!";
		letter= letter.replace("<name>","shruti");
		System.out.println(letter);
		String myletter = "Dear shruti,\n\t how you doing? believe in yourself.\n\t take care!";
		System.out.println(myletter);
	}
}
