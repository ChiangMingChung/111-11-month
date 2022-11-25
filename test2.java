import java.util.Scanner;
public class test2{
	public static void main(String[] agrs){
	Scanner input = new Scanner(System.in);
	System.out.print("far:");
	int km = input.nextInt();
	if(km <=7){
		System.out.println("85");
	}
	else if(km > 7){
		System.out.printf("%d",(km-7)*5+85);
	}
}
}