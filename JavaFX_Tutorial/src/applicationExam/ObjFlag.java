package applicationExam;

public class ObjFlag {
	private String li;
	private String flagfile;

	public ObjFlag(String li, String flagfile) {
		this.li = li;
		this.flagfile = flagfile;
		
	}
	
	public String getLi() {
		return this.li;
	}
	public void setLi(String s) {
		this.li = s;
	}
	
	public String getFlag() {
		return this.flagfile;
	}
	
	public void exit() {
		System.exit(0);
	}
	

}
