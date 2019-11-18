package model;

import javax.persistence.Id;

public class User {

	@Id
	private String uid;
	private String password;
	private String name;
	private String eid;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	
	@Override
	public String toString() {
		return "User [uid=" + uid + ", password=" + password + ", name=" + name + ", eid=" + eid + "]";
	}
}
