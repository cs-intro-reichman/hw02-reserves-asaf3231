
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int boy = 0; 
		int girl = 0;
		int sum = 0  ;
		System.out.println("java OneOfEach");
		
		while ( boy == 0 || girl == 0 ){ 
			double chance = Math.random(); 
			if(chance > 0.5) {
				boy++;
				System.out.print("b ");
			}
			else{
				 girl++;
				 System.out.print("g ");
				}
			sum += 1 ; 
		}	
		System.out.println();
		System.out.println("You made it... and you now have " + sum + " children.");

		//// Put your code here
	}
}
