package Animal;

public class Animal {
	private String type;
	private int foot;

	public Animal() {
		setType("Animal");
		setFoot(0);
	}

	public void printInfo() {
		System.out.println("[" + this.getType() + "]");
		System.out.println("Numbers of foot = " + this.getFoot());
	}

	public int getFoot() {
		return foot;
	}

	public void setFoot(int foot) {
		this.foot = foot;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
