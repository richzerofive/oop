package phone;

/**
 *@date   : 2016. 6. 22.
 *@author : 박승주
 *@file   : CellPhone.java
 *@story  : 
*/
public class CellPhone extends Phone{
	private String move;
	public boolean portable; //이동성
	public final static String KIND ="휴대폰";
	
	public String getMove() {
		return move;
	}
	public void setMove(String move) {
		this.move = move;
	}
	public boolean isPortable() {
		return portable;
	}
	public void setPortable(boolean portable) {
		if (portable) {
			this.setMove("이동가능");
		} else {
			this.setMove("이동불가능");
		}
		this.portable = portable;
	}
	
	@Override
	public String toString() {
		return KIND+"이기 때문에" + move+","+super.getCompany()+"제품을 가지고," + super.getCall() + "(이)라고 통화했다";
	}
}
