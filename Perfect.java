/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int input = Integer.parseInt(args[0]);
		int sum =  1;
		String save = "1"; 
		for( int i = 2 ; i< input ;  i++){
			int checking = input%i; 
			 
			if( checking == 0 ){ 
				save +=  " + " + i;
				sum += i ; 
				 
			} 	
		}
		if ( sum == input ){
			System.out.println( input + " is a perfect number since = " + save ); 
		}else{
			System.out.println(input + " is not a perfect number");
		}
		//// Put your code here
	}
}
