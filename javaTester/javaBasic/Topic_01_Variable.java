package javaBasic;

public class Topic_01_Variable {
	static int studentNumber;
	static boolean statusValue;
	static final String browserName = "Chrome";
	
	String studentName ="Automation FC";
	
	public static void main(String[] args) {
		System.out.println(studentNumber);
		System.out.println(statusValue);
		
	}
	
	//Getter: getCurrentUrl/ getTitle/ getText/ getAttribute/ getCssValue/ getSize/ getLocation/ getPosition...
	public String getStudentName() {
		return this.studentName;
		
	}
	
	//Setter: click /sendkey/ clear/ select/ back/ forward/ refresh/ get...
	public void setStudentName(String stdName) {
		this.studentName = stdName;
	}

}
