package lotto;

/**
 *@date   : 2016. 6. 23.
 *@author : 박승주
 *@file   : lottoBean.java
 *@story  : money,number
*/
public class LottoBean {
	private int money;
	private int number;
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber() {
		this.number = (int) (Math.random()*45+1);
		//로또를 구성하는 랜덤 숫자 하나 발생
	}
	@Override
	public String toString() {
		return "lottoBean [money=" + money + ", number=" + number + "]";
	}
	
	
}
