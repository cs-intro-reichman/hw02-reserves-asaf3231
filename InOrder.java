/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		
		int index = (int)(Math.random() * 10 + 1) ;
		int x = index ; 
		System.out.print(index + " ");

		do { 
			index = x ; 
			x = (int)(Math.random() * 10 + 1) ;
			if( x >= index){
				System.out.print(x + " "); 
			}else { break ;}
		}
		while (x >= index);
		//// Write your code here
	}
}
