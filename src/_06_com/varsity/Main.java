package _06_com.varsity;

import _06_com.varsity.student.Student;
import _06_com.varsity.student.student_details.StudentDetails;
import _06_com.varsity.teacher.Teacher;
import _06_com.varsity.teacher.teacher_details.TeacherDetails;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello, I'm Main Class");
    Student student = new Student();
    student.print();

    Teacher teacher = new Teacher();
    teacher.print();

    StudentDetails studentDetails = new StudentDetails();
    studentDetails.print();

    TeacherDetails teacherDetails = new TeacherDetails();
    teacherDetails.print();
  }
}
