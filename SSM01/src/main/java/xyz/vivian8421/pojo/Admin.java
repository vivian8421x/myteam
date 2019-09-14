package xyz.vivian8421.pojo;

public class Admin {
	private Integer AdminID;
	private String  AdminName;
	private String  AdminPwd;
	private int  AdminType;
	private String  LastLoginTime;

	public Integer getAdminID() {
		return AdminID;
	}
	public void setAdminID(Integer adminID) {
		AdminID = adminID;
	}
	public String getAdminName() {
		return AdminName;
	}
	public void setAdminName(String adminName) {
		AdminName = adminName;
	}
	public String getAdminPwd() {
		return AdminPwd;
	}
	public void setAdminPwd(String adminPwd) {
		AdminPwd = adminPwd;
	}
	public int getAdminType() {
		return AdminType;
	}
	public void setAdminType(int adminType) {
		AdminType = adminType;
	}
	public String getLastLoginTime() {
		return LastLoginTime;
	}
	public void setLastLoginTime(String lastLoginTime) {
		LastLoginTime = lastLoginTime;
	}
	@Override
	public String toString() {
		return "Admin [AdminID=" + AdminID + ", AdminName=" + AdminName + ", AdminPwd=" + AdminPwd + ", AdminType="
				+ AdminType + ", LastLoginTime=" + LastLoginTime + "]";
	}
	

}
