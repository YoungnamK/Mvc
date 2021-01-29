package model;

public class Hobby {
	private String english;
	private String korea;

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public String getKorea() {
		return korea;
	}

	public void setKorea(String korea) {
		this.korea = korea;
	}

	public Hobby(String english, String korea) {
		super();
		this.english = english;
		this.korea = korea;
	}

	public Hobby() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Hobby [english=" + english + ", korea=" + korea + "]";
	}
	
	
}
