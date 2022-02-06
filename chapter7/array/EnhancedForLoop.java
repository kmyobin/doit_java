package array;

public class EnhancedForLoop {

	public static void main(String[] args) {
		String[] strArray= {"Java", "Android", "C", "JavaScript", "Python"};
		
		// for(변수:배열)
		for(String lang:strArray) { // strArray에 있는 시작부터 끝까지 실행
			System.out.println(lang); // 변수에는 배열의 각 요소 대임됨
		}

	}

}
