package stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		TravelCustomer customerLee=new TravelCustomer("이순신", 40,100);
		TravelCustomer customerKim=new TravelCustomer("김유신",20,100);
		TravelCustomer customerHong=new TravelCustomer("홍길동",13,50); // 고객 생성
		
		List<TravelCustomer> customerList=new ArrayList<>();
		
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong); // ArrayList에 고객 추가
		
		System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		// 스트림 생성 / 고객의 이름 가져옴 / 출력
		
		int total=customerList.stream().mapToInt(c->c.getPrice()).sum();
		// 스트림 생성 / 가격 가져와서 정수로 변환 / 더함
		System.out.println("총 여행 비용은 : "+total+"입니다.");
		
		System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
		customerList.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		// 스트림 생성 // 20세 이상만 추출 후 / 이름 가져오고 / 정렬 // 출력
	}

}
