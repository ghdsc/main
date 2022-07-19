package com.agriitex.assesement;

public class Studentmodelclass {
	int sid;
	String sname;
	int sage;
	double smarks;
	char sgender;
	
	public static void main(String[] args) {
		

}

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

	public double getSmarks() {
		return smarks;
	}

	public void setSmarks(double smarks) {
		this.smarks = smarks;
	}

	public char getSgender() {
		return sgender;
	}

	public void setSgender(char sgender) {
		this.sgender = sgender;
	}

	@Override
	public String toString() {
		return "Studentmodelclass [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", smarks=" + smarks
				+ ", sgender=" + sgender + ", getSid()=" + getSid() + ", getSname()=" + getSname() + ", getSage()="
				+ getSage() + ", getSmarks()=" + getSmarks() + ", getSgender()=" + getSgender() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
