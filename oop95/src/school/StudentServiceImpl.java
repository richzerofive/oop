package school;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

/**
 *@date   : 2016. 6. 20.
 *@author : 박승주
 *@file   : StudentServiceImpl.java
 *@story  : 
*/
public class StudentServiceImpl implements StudentService{
	StudentBean Student;
	@Override
	public void registStudent(String id, String pw, String name, String ssn) {
		
		Student = new StudentBean(id,pw,name,ssn);
	}
	@Override
	public String showStudent() {
		return Student.toString();
	}

	@Override
	public void updateStudent(String pw) {
		Student.setPw(pw);
	}

	@Override
	public void deleteStudent() {
		Student = null;
	}
	
}

