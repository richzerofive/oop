package phone;

/**
 *@date   : 2016. 6. 22.
 *@author : 박승주
 *@file   : AndroidPhone.java
 *@story  : 
*/
public class AndroidPhone extends Iphone{
	public final static String BRAND="갤럭시노트";
	private String size,date;
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String call,String size,String date) {
		super.setCompany(BRAND);
		super.setPortable(true);
		super.setCall(call);
		this.setSize(size);
		this.date = KIND+"이기 때문에" + super.getMove()+","+super.getCompany()+"제품을 가지고\n"+  super.getCall() + "(이)라고 통화하고\n"+this.getSize()+"인치 큰 화면을 통해서"+"카톡으로"+date+"메시지 전달했다";
	}
	
	@Override
	public String toString() {
		return this.getDate();
	}
	
}
