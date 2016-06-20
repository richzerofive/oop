/**
 * 
 */
package something;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *@date   : 2016. 6. 20.
 *@author : 박승주
 *@file   : Student.java
 *@story  : 스테틱 변수 : 한빛 학원 인스턴스 Id , pw , name , regDate , gender ,800101-1(ssn)int age
 *1. 등록 :ssn,아이디,비번,이름 2. 조회 (결과값 : 홍길동,h,남)
*/
public class Student {
	private String id,pw,name,regDate,gender,ssn;
	private int age;
	public final static String SCHOOL_NAME="한빛학원";
	
	public Student(String id,String pw,String name,String ssn) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.ssn = ssn;
		String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
		this.regDate = now;
		
	}	
}
