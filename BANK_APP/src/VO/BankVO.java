package VO;

import java.util.Date;

public class BankVO {
	
	private String userno; //주민번호
	private String name;   //이름 1
	private String accid;  //계좌번호4
	private int bcode;     //은행코드2
	private  String bname; //은행이름3
	private String bstatus;//입출금상태6
	private int acctotal;  //잔액5
	private String accpw;
	private Date accdate;  //계좌개설일7
	private String accname;//별칭

	public BankVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankVO(String userno, String name, String accid, int bcode, String bname, String bstatus, int acctotal,
			 String accpw,Date accdate,String accname) {
	
		this.userno = userno;
		this.name = name;
		this.accid = accid;
		this.bcode = bcode;
		this.bname = bname;
		this.bstatus = bstatus;
		this.acctotal = acctotal;
		this.accpw = accpw;
		this.accdate = accdate;
		this.accname = accname;
	}
	public String getUserno() {
		return userno;
	}
	public void setUserno(String userno) {
		this.userno = userno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccid() {
		return accid;
	}
	public void setAccid(String accid) {
		this.accid = accid;
	}
	public int getBcode() {
		return bcode;
	}
	public void setBcode(int bcode) {
		this.bcode = bcode;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBstatus() {
		return bstatus;
	}
	public void setBstatus(String bstatus) {
		this.bstatus = bstatus;
	}
	public int getAcctotal() {
		return acctotal;
	}
	public void setAcctotal(int acctotal) {
		this.acctotal = acctotal;
	}
	public String getAccpw() {
		return accpw;
	}
	public void setAccpw(String accpw) {
		this.accpw = accpw;
	}
	public Date getAccdate() {
		return accdate;
	}
	public void setAccdate(Date accdate) {
		this.accdate = accdate;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	@Override
	public String toString() {
		return "BankVO [userno=" + userno + ", name=" + name + ", accid=" + accid + ", bcode=" + bcode + ", bname="
				+ bname + ", bstatus=" + bstatus + ", acctotal=" + acctotal + ", accpw=" + accpw+ ", accdate=" + accdate + ", accname="
				+ accname + "]";
	}





}
