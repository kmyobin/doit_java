package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {
	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length>=s2.getBytes().length)return s1;
		else return s2; // 두 문자열 길이 비교
	}
}

public class ReduceTest {

	public static void main(String[] args) {
		String[] greetings= {"안녕하세요~~~", "hello", "Good morning", "반갑습니다^^"};
		// 람다식 직접 구현
		System.out.println(Arrays.stream(greetings).reduce("", (s1,s2)->{ 
			if(s1.getBytes().length>=s2.getBytes().length) {
				return s1;
			}
			else return s2;
		}));
		
		// BinaryOperator를 구현한 클래스 사용
		String str=Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str); 
	}

}
