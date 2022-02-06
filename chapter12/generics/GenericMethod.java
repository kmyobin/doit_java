package generics;

public class GenericMethod {
	public static <T,V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) { // makeRectangle 함수(제네릭 클래스가 아니라도 내부에 제네릭 메서드를 구현할 수 있음)
		double left=((Number)p1.getX()).doubleValue();
		double right=((Number)p2.getX()).doubleValue();
		double top=((Number)p1.getY()).doubleValue();
		double bottom=((Number)p2.getY()).doubleValue();
		
		double width=right-left;
		double height=bottom-top;
		
		return width*height;
	}
	
	public static void main(String[] args) {
		Point<Integer, Double> p1=new Point<>(0,0.0);
		Point<Integer, Double> p2=new Point<>(10, 10.0);
		
		double rect=GenericMethod.<Integer, Double>makeRectangle(p1,p2); // <Integer, Double> 생략 가능
		System.out.println("두 점으로 만들어진 사각형의 넓이는 "+rect+"입니다.");
	}
}
