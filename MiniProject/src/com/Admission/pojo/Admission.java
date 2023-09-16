package com.Admission.pojo;

public class Admission {
	private int StudentId;
	private String studentName;
	private String studentQualify;
	private String studentContactno;
	private String studentCourses;
	private String studentEmails;
	private String studentFees;
	public Admission(int studentId, String studentName, String studentQualify, String studentContactno,
			String studentCourses, String studentEmails, String studentFees) {
		super();
		StudentId = studentId;
		this.studentName = studentName;
		this.studentQualify = studentQualify;
		this.studentContactno = studentContactno;
		this.studentCourses = studentCourses;
		this.studentEmails = studentEmails;
		this.studentFees = studentFees;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentQualify() {
		return studentQualify;
	}
	public void setStudentQualify(String studentQualify) {
		this.studentQualify = studentQualify;
	}
	public String getStudentContactno() {
		return studentContactno;
	}
	public void setStudentContactno(String studentContactno) {
		this.studentContactno = studentContactno;
	}
	public String getStudentCourses() {
		return studentCourses;
	}
	public void setStudentCourses(String studentCourses) {
		this.studentCourses = studentCourses;
	}
	public String getStudentEmails() {
		return studentEmails;
	}
	public void setStudentEmails(String studentEmails) {
		this.studentEmails = studentEmails;
	}
	public String getStudentFees() {
		return studentFees;
	}
	public void setStudentFees(String studentFees) {
		this.studentFees = studentFees;
	}
	@Override
	public String toString() {
		return "Admission [StudentId=" + StudentId + ", studentName=" + studentName + ", studentQualify=" + studentQualify
				+ ", studentContactno=" + studentContactno + ", studentCourses=" + studentCourses + ", studentEmails="
				+ studentEmails + ", studentFees=" + studentFees + "]";
	}
}
