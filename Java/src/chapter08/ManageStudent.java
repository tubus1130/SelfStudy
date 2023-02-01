package chapter08;

public class ManageStudent {
	public static void main(String[] args) {
		Student[] student = null;
		ManageStudent manage = new ManageStudent();
		student = manage.addStudent();
		manage.printStudents(student);
//		manage.checkEquals();
	}
	
	public Student[] addStudent() {
		Student[] student = new Student[3];
		student[0] = new Student("Lim");
		student[1] = new Student("Min");
		student[2] = new Student("Sook", "Seoul", "01012345678", "sook@gmail.com");
		
		return student;
	}
	
	public void printStudents(Student[] student) {
		for(Student data : student) {
			System.out.println(data);
		}
	}
	
	public void checkEquals() {
		Student a = new Student("Kim", "Seoul", "01012345678", "kim@gmail.com");
		Student b = new Student("Kim", "Seoul", "01012345678", "kim@gmail.com");
		
		if(a.equals(b)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
	}
}
