/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
//// Put your code here
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		for (int i = 1 ; i <= n ; i++){
			int j = 1; 
			for( ; j <= n  ; j++){
				if(i%2 == 1){
					System.out.print("* "); 
				}
				else{
					System.out.print(" *");
				}
			}  System.out.println(" ");
		} 
		
	}
}
