/**
 * 
 */
package bank;

import java.util.Random;

/**
 * @date : 2016. 6. 16.
 * @author : 박승주
 * @file : Account.java
 * @story :
 */
public class Account {
	private int accountNo; // 인스턴스 변수는 초기화를 하지 않는다
	private String name;
	private int money;
	private String pw;
	private String id;
	
	/**
	 * 
	 */
	public Account(String name) {
		this.accountNo = (int) (Math.random() * 999999) + 100000;
		this.name = name;
	}

	public void setMoney(int money) {
		this.money = money;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAccountNo() {
		return this.accountNo;
	}

	public String getName() {
		return this.name;
	}

	public int getMoney() {
		return this.money;
	}

	public String getPw() {
		return this.pw;
	}

	public String getId() {
		return this.id;
	}

}
