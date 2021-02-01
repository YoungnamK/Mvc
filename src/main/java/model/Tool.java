package model;

public class Tool {
	private String english;	//영문명
	private String korea;	//한글명
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
	@Override
	public String toString() {
		return "Tool [english=" + english + ", korea=" + korea + "]";
	}
	public Tool(String english, String korea) {
		super();
		this.english = english;
		this.korea = korea;
	}
	
	public Tool() {
		// TODO Auto-generated constructor stub
	}
}
