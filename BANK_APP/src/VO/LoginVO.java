package VO;

public class LoginVO {
	private String id;
	private String pwd;
	private String name;
	private String userno;

	public LoginVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginVO(String id, String pwd, String name, String userno) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.userno = userno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserno() {
		return userno;
	}

	public void setUserno(String userno) {
		this.userno = userno;
	}

	@Override
	public String toString() {
		return "LoginVO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", userno=" + userno + "]";
	}

}
