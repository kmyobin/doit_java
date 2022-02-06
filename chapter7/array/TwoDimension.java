package array;

public class TwoDimension {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3}, {4,5,6}};
		
		for(int i=0; i<arr.length; i++) { // 행의 길이
			for(int j=0; j<arr[i].length; j++) { // 열의 길이
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
