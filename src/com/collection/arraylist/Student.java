package com.collection.arraylist;
import java.util.Comparator;
//public class Student implements Comparable<Student> {
public class Student {
	private String studentname;
    private int rollno;
    private int studentage;
    private int marks;
    private String grade;

    public Student(int rollno, String studentname, int studentage, int marks) {
         this.rollno = rollno;
         this.studentname = studentname;
         this.studentage = studentage;
         this.marks = marks;
    }
    
	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}




	/*@Override
	 public int compareTo(Student comparestu) {
	        int compareage=((Student)comparestu).getStudentage();
	        // For Ascending order
//	        return this.studentage-compareage;

	        // For Descending order do like this 
	        return compareage-this.studentage;
	    }*/
	
	 public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}




		/*Comparator for sorting the list by Student Name*/
		public static Comparator<Student> compareStudent =new Comparator<Student>(){
		
			public int compare(Student s1 , Student s2){
				String studentName1 = s1.getStudentname();
				String studentName2 = s2.getStudentname();
				
				//ascending order
				return studentName1.compareTo(studentName2);
				
				//descending order
				//return StudentName2.compareTo(StudentName1);
			}
		};
		
		/*Comparator for sorting the list by roll no*/
	    public static Comparator<Student> StuRollno = new Comparator<Student>() {

			public int compare(Student s1, Student s2) {
	
			   int rollno1 = s1.getRollno();
			   int rollno2 = s2.getRollno();
	
			   /*For ascending order*/
			   return rollno1-rollno2;
	
			   /*For descending order*/
			   //rollno2-rollno1;
	   }};

		@Override
		public String toString() {
			return "Student [studentname=" + studentname + ", rollno=" + rollno + ", studentage=" + studentage
					+ ", marks=" + marks + ", grade=" + grade + "]";
		}
	    
	    
    
}
