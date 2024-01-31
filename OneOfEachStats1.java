/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		int boy = 0; 
		int girl = 0;
		int sum = 0;
		int counting = 0 ; 
		int F2 = 0;
		int F3 = 0;
		int F4 = 0;
		

		for (int j = 0 ; j < T ; j ++){
			boy = 0;
			girl =0;
			counting= 0;
			while ( boy == 0 || girl == 0 ){ 
				double chance = Math.random(); 
				if(chance > 0.5) {
					boy++;
					
				}
				else{
					girl++;
				}
				counting +=1 ;
				 
				}
			sum += counting;

				if( counting == 2 ){
				F2 ++ ; 
				}
				else if( counting == 3 ){
				F3 ++ ; 
				}
				else{
				F4 ++ ; 
				}
				counting = 0 ; 
				 ; 
			}	
		System.out.println();
		System.out.println((double)sum/T + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + F2);
		System.out.println("Number of families with 3 children: "  + F3 );
		System.out.println("Number of families with 4 or more children:" + F4);
		
		if (F2 == Math.max( Math.max(F2,F3),F4)){ System.out.println("The most common number of children is 2.");}
		if (F3 == Math.max( Math.max(F2,F3),F4)){ System.out.println("The most common number of children is 3." );} 
		else{ System.out.println("The most common number of children is 4 or more.");}

		//// Put your code here
	}
}
