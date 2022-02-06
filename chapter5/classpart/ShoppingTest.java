package classpart;

public class ShoppingTest {

	public static void main(String[] args) {
		Shopping shopping=new Shopping();
		shopping.setInum("201803120001");
		shopping.setId("abc123");
		shopping.setDate(2018, 03, 12);
		shopping.setName("홍길순");
		shopping.setPnum("PD0345-12");
		shopping.setAddress("서울시 영등포구 여의도동 20번지");
		
		System.out.println("주문 번호: "+shopping.getInum());
		System.out.println("주문자 아이디: "+shopping.getId());
		System.out.println("주문 날짜: "+shopping.getYear()+"년 "+shopping.getMonth()+"월 "+shopping.getDay()+"일");
		System.out.println("주문자 이름: "+shopping.getName());
		System.out.println("주문 상품 번호: "+shopping.getPnum());
		System.out.println("배송 주소: "+shopping.getAddress());

	}

}
