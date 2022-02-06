package loopexample;

public class Star_2 {

	public static void main(String[] args) {
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=7; j++) {
				if(i<4) {
					if(i+j<=4||j-i>=4) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
				else {
					if(i-j>=4||i+j>=12) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
				
			}
			System.out.println();
		}
	}
}
