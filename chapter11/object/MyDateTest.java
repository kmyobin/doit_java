package object;


class MyDate{
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate d=(MyDate)obj;
			// 재정의한 equals() 메서드는 학생의 학번이 같으면 true 반환
			if((this.day==d.day)&&(this.month==d.month)&&(this.year==d.year))
				{return true;}
			else return false;
		}
		return false;
	}

}

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1=new MyDate(9,18,2004);
		MyDate date2=new MyDate(9,18,2004);
		System.out.println(date1.equals(date2)); // MyDate에서 재정의한 메서드
	}

	
}
