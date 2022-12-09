public class test3{
	public static void main(String[] agrs){
		int[] arr = {10,9,8,7,6,5,4,3,2,1,0};
		int count = 0;
		int temp;
		for (int x=0; x<arr.length; x++){
			 for(int y=0;y>arr.length;y++){
				 if (arr[y]>arr[y+1]){
					 temp = arr[y];
					 arr[x] = arr[y+1];
					 arr[y+1] = temp;
				 }
				count++;
			 }
		}
		
		
		for (int x=0;x<arr.length;x++){
			System.out.println(">>" + arr[x]);
		}
			System.out.printf("%d",count);
	}
	
	public static void add(int x) {
		System.out.println("===>" + x);
	}
}