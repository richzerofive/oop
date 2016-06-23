package grade2;

/**
 *@date   : 2016. 6. 22.
 *@author : 박승주
 *@file   : GradeBean.java
 *@story  : 
*/
public class GradeBean {
	private int kor, eng, math;
	private String name;
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "GradeBean [kor=" + kor + ", eng=" + eng + ", math=" + math + ", name=" + name + "]";
	}
	
	

}
