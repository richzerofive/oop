package role;

/**
 *@date   : 2016. 6. 22.
 *@author : 박승주
 *@file   : Husband.java
 *@story  : 
*/
public class Husband extends Man{
	@Override
	public void role() {
		System.out.println("남편의 역할");
	}
	public void worry(){
		System.out.println("남편의 고민");
	}
}
