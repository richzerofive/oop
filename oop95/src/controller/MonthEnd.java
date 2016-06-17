/**
 * 
 */
package controller;

/**
 *@date   : 2016. 6. 14.
 *@author : 박승주
 *@file   : MonthEnd.java
 *@story  : 
*/
public class MonthEnd {
	public String execute(int inputyear,int inputmonth){
		
		int year = inputyear;
		int month = inputmonth;
		String monthResult="";
		switch (month) {
		case 1:case 3:case 5:case 6:case 8:case 10:case 12:
			monthResult = "31";
			break;
		case 2:
			monthResult="(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)?29:28";			
			break;
			
			
			 
		case 4:case 7:case 9:case 11:
			monthResult = "30";
			break;
		default:
			System.out.println("정확한달을 입력하세요");
			break;
		}
		return year+"년"+month+"월"+monthResult+"일";
					}
	}

