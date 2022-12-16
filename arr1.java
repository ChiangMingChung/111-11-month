public class arr1{
	public static void main(String[] args){
		int[] myArr = {7,5,4,9,8,1,2};
		int[] flag_arr = new int[myArr.length];
		int flag_count =1;
		int flag_min = 10;
		
		
		int max =0;
		int min =10;
		int sum = 0;
		float avg;
		int med = 0;
		for(int i=0;i<myArr.length;i++){
			if(myArr[i]>max)
				max = myArr[i];
			if(myArr[i]<min)
				min = myArr[i];
			sum += myArr[i];
			
			for (int j=0; j<myArr.length;j++){
				if(myArr[j]<flag_min)
					flag_min = myArr[j];
			}
				if(flag_arr[j] == 0 ){
		           flag_min = myArr[j];
				   flag_min = myArr[j];
				   flag_arr[j] = flag_count;
				   flag_count++;
				}
				if(flag_count ==4)
					med = myArr[j];
			}
		}
		avg = (float)sum /myArr.length;
			
		System.out.println("max"+max);
		System.out.println("min"+min);
		System.out.println("avg"+avg);
		System.out.println("med"+med);
	}
}