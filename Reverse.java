/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//// Put your code here
		String str = args[0];
		String res = "";
		for(int i = 0  ; i < str.length();i ++){
			char chr = str.charAt(str.length() -(i+1) );
			res += chr;
			
		}
		System.out.println(res);
		char middle = str.charAt(str.length() /2  );
		System.out.println( "The middle character is  " + middle);
	} 
}
