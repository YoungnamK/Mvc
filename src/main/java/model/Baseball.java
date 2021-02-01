package model;

public class Baseball {
	private String name;
	private String mascot;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMascot() {
		return mascot;
	}
	public void setMascot(String mascot) {
		this.mascot = mascot;
	}
	@Override
	public String toString() {
		return "Baseball [name=" + name + ", mascot=" + mascot + "]";
	}
	public Baseball(String name, String mascot) {
		super();
		this.name = name;
		this.mascot = mascot;
	}
	
	public Baseball() {
		// TODO Auto-generated constructor stub
	}
}
