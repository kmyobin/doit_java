package bookshelf;

public class BookShelf extends Shelf implements Queue{ // Shelf class 상속받고 Queue 인터페이스 사용

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}
	
}
