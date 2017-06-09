package entity;

public class User {
	private int id;
	private String account;
	private String pwd;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public User(int id, String account, String pwd) {
		super();
		this.id = id;
		this.account = account;
		this.pwd = pwd;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
