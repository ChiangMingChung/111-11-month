public class test1{
public static void main(String[] args){
 for (int i = -4; i <= 4;i++){
	  for (int k =-5; k<= 5; k++) {
		   if (i +k <= -5 || i - k >= 5)
				System.out.print("*");
			else if ( i +k > 4 || i - k < -4)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println("");
		
		
		}
	}
}