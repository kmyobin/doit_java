package bookshelf; // 책을 넣은 순서대로 꺼내어 볼 수 있도록
import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf; // 자료를 순서대로 저장할 ArrayList
	
	public Shelf() {shelf=new ArrayList<String>();} // 디폴트 생성자로 Shelf 클래스를 생성하면 ArrayList도 생성됨
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
