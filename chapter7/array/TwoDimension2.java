package array;

public class TwoDimension2 {

	public static void main(String[] args) {
		int[][] arr=new int[2][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]); // 0으로 자동 초기화
			}
			System.out.println();
		}
		System.out.println(arr.length);
		System.out.println(arr[0].length);

	}

}
