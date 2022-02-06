package loopexample;

public class Star {

	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i+3; j++) {
				if(i+j<=4) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
