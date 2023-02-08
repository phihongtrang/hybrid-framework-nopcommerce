package javaOOP;

public class Topic_01_Class_Object {
	private int studentID;
	private String studentName;
	private Float knowledgePoint;
	private Float practicePoint;

	private int getStudentID() {
		return studentID;
	}

	private void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	private String getStudentName() {
		return studentName;
	}

	private void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	private Float getKnowledgePoint() {
		return knowledgePoint;
	}

	private void setKnowledgePoint(Float knowledgePoint) {
		this.knowledgePoint = knowledgePoint;
	}

	private Float getPracticePoint() {
		return practicePoint;
	}

	private void setPracticePoint(Float practicePoint) {
		this.practicePoint = practicePoint;
	}

	private Float averagePoint() {

		return (this.knowledgePoint + this.practicePoint * 2) / 3;
	}

	private void showStudentInfo() {
		System.out.println("*****************************");
		System.out.println("Student ID = " + getStudentID());
		System.out.println("Student Name = " + getStudentName());
		System.out.println("Student knowldege point = " + getKnowledgePoint());
		System.out.println("Student practice point = " + getPracticePoint());
		System.out.println("Student average point = " + averagePoint());
		System.out.println("*****************************");
	}

	public static void main(String[] args) {
		Topic_01_Class_Object firstStudent = new Topic_01_Class_Object();
		// instance variable
		firstStudent.setStudentID(1501);
		firstStudent.setStudentName("Khanh Cuong");
		firstStudent.setKnowledgePoint(8.5f);
		firstStudent.setPracticePoint(8.0f);
		firstStudent.showStudentInfo();

		Topic_01_Class_Object secondStudent = new Topic_01_Class_Object();
		secondStudent.setStudentID(1502);
		secondStudent.setStudentName("Son Hai");
		secondStudent.setKnowledgePoint(8.0f);
		secondStudent.setPracticePoint(7.5f);
		secondStudent.showStudentInfo();

	}

}