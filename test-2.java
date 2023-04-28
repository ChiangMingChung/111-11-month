public class test-2{
	public static void main(String[] args){
	arr[0] = new Student();
	arr[1] = new Student();
	arr[2] = new Student();
	arr[0].id = "10";
	arr[1].id = "12";
	arr[2].id = "13";

		for(Student element : arr1){
			element.id = "100";
			System.out.println(element.id);
		}
	
		System.out.println("================");
	
		for (Student element :arr1){
		System.out.println(element.id);
		}
	}
}

class Student{