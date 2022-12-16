public class arr{
	public static void main(String[] args){
		int[] myArr = {7,5,4,8,1,2};
		int lon= myArr.length;
		for(int y=0;y<myArr.length/2;y++){
			int rr=0;
			rr = myArr[lon-1];
			myArr[lon-1]=myArr[y];
			myArr[y]=rr;
			lon-=1;
		}
			
			
		for (int i=0; i<myArr.length;i++){
			System.out.println(myArr[i]);
		}
	}
}