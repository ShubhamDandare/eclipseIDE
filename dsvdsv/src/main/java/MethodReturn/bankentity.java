package MethodReturn;

public class bankentity{
	private String bankname;
	private int bankid;
	private String bankemail;
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public int getBankid() {
		return bankid;
	}
	public void setBankid(int bankid) {
		this.bankid = bankid;
	}
	public String getBankemail() {
		return bankemail;
	}
	public void setBankemail(String bankemail) {
		this.bankemail = bankemail;
	}
	@Override
	public String toString() {
		return "bankentity [bankname=" + bankname + ", bankid=" + bankid + ", bankemail=" + bankemail + "]";
	}
	public bankentity() {
		super();
		// TODO Auto-generated constructor stub
	}



}