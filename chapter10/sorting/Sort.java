package sorting;

public interface Sort {
	void ascending(int[] arr); // 오름차순 정렬
	void descending(int[] arr); // 내림차순 정렬
	default void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
	}
}
