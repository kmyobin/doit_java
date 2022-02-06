package array;

public class AloneTwoDimesion {

	public static void main(String[] args) {
		char[][] arr= new char[13][2];
		
		int k=97;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=(char)k;
				k++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
