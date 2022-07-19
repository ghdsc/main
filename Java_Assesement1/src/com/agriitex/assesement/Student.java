package com.agriitex.assesement;

public class Student {
	public Student(int sid, String sname, int sage, int smarks, char sgender) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.smarks = smarks;
		this.sgender = sgender;
	}

	int sid;
	String sname;
	int sage;

	public Student() {
		super();
	}

	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}

	int smarks;
	char sgender;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public int getSmarks() {
		return smarks;
	}

	public void setSmarks(double smarks) {
		this.smarks = (int) smarks;
	}

	public char getSgender() {
		return sgender;
	}

	public void setSgender(char sgender) {
		this.sgender = sgender;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", smarks=" + smarks + ", sgender="
				+ sgender + "]";
	}

}
