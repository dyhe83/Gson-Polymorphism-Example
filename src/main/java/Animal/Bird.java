package Animal;

public class Bird extends Animal {
	private int eye;

	public Bird() {
		super.setType("Bird");
		super.setFoot(2);
		setEye(2);
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Numbers of eye  = " + this.getEye());
	}

	public int getEye() {
		return eye;
	}

	public void setEye(int eye) {
		this.eye = eye;
	}
}
