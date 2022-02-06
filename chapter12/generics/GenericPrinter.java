package generics;

public class GenericPrinter<T extends Material> { // extends 예약어로 사용할 수 있는 자료형에 제한을 둠(Material로 지정한 거 아니면 오류가 뜬다는 소리)
	private T material;
	
	public void setMaterial(T material) {
		this.material=material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting(); // 상위 클래스 Material의 메서드 호출
	}
}
