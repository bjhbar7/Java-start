package exam07_third;

import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Subject> subjectLest;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectLest =new ArrayList<Subject> ();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectLest.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectLest) {
			total += s.getScorePoint();
			System.out.println("학생 " + studentName + "의 " + s.getName() + "과목성적은" + s.getScorePoint() + "입니다.");
		}
	}
}
