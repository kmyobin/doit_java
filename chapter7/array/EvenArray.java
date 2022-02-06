package array;

public class EvenArray {
	public static void main(String[] args) {
		int[] arr=new int[5];
		
		int index=0; int sum=0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				arr[index]=i; sum+=arr[index];
				index++;
			}
		}
		
		System.out.println(sum);
	}
}
