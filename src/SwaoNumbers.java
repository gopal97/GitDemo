
public class SwaoNumbers {

	public static void main(String[] args) {
		int num1=10, num2=20;
		
		System.out.println(num1+" "+num2);
		swap(num1,num2);
		System.out.println(num1+" "+num2);

	}
	
	public static void swap(int a, int b) {
		
		int temp = a;
		a=b;
		b=temp;
	}

}
