package bean;

public class School {
	private String cd;
	private String name;
	
	//デフォルトコンストラクタ
	public School() {
		
	}
	
	//cd(学校コード)
	public String getCd() {
		return cd;
	}
	
	public void setCd(String cd) {
		this.cd = cd;
	}
	
	//name(学校名)
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
