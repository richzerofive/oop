/**
 * 
 */
package controller;

/**
 *@date   : 2016. 6. 14.
 *@author : 박승주
 *@file   : Tax.java
 *@story  : 
*/
public class Tax {
	public String execute(String inputname,int inputsal,double[] taxRate){
		
		String name = inputname;
		int sal = inputsal;
		int tax = 0;
		{
		tax = (int)(sal);
	}
	
		
		return "연봉"+sal+"만원을 받으시는 "+name+"님께서"+"납부할 세금은 "+tax+"만원입니다.";
}
}