/**
 * 
 */
package school;

import javax.swing.JOptionPane;

/**
 *@date   : 2016. 6. 16.
 *@author : 박승주
 *@file   : schoolControler.java
 *@story  : 스테틱 변수 : 한빛 학원 인스턴스 Id , pw , name , regDate , gender ,800101-1(ssn)int age
 *1. 등록 :ssn,아이디,비번,이름 2. 조회 (결과값 : 홍길동,h,남)
*/
public class SchoolControler {
	public static void main(String[] args) {
		
		Student student = null;
		
		while (true) {
			switch (JOptionPane.showInputDialog("1. 등록 2. 조회 0. 종료")){
				
			case "1":
				int yes=JOptionPane.showConfirmDialog(null, "등록?");
				if (yes==0) {
				String id = JOptionPane.showInputDialog("아이디");
				String pw = JOptionPane.showInputDialog("비밀번호");
				String name = JOptionPane.showInputDialog("이름");
				String ssn = JOptionPane.showInputDialog("주민번호 7자리");
				student= new Student(id,pw,name,ssn);	
				}
				break;
				
			case "2":
				JOptionPane.showMessageDialog(null, "이름 :"+student.toString());
				break;
			
			case "0" :
				yes =JOptionPane.showConfirmDialog(null, "종료?");
				if (yes==0) {
					return;
				}else{
				continue;}
			default:
				break;
			}
		}
		
	}
}
