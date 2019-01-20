package Animal;

public class Cat extends Animal {
	private int tail;

	public Cat() {
		super.setType("Cat");
		setFoot(4);
		setTail(1);
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Numbers of tail = " + this.getTail());
	}

	public int getTail() {
		return tail;
	}

	public void setTail(int tail) {
		this.tail = tail;
	}
}
