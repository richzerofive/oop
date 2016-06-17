/**
 * 
 */
package controller;

/**
 *@date   : 2016. 6. 14.
 *@author : 박승주
 *@file   : Kaup.java
 *@story  : 
*/
public class Kaup {
	public String execute(String inputName,double inputheight,Double inputweight){
		Double kaup=0.0;
		String result="";
		//---- op -----
		
		String name=inputName;
		Double height=inputheight;
		Double weight=inputweight;
		
		kaup = weight / (height / 100) / (height / 100);
		
		if (kaup < 18.5) {
			result = "저체중";
		}else if(kaup < 22.9 && kaup > 18.5){
			result = "정상";
		}else if(kaup < 24.9 && kaup > 23.0){
			result = "위험체중";
		}else if(kaup < 29.9 && kaup > 25.0){
			result = "비만1단계";
		}else if(kaup < 40 && kaup > 30.0){
			result = "비만2단계";
		}else if(kaup >= 40){
			result = "비만3단계";
		}
		/*double d = Double.parseDouble(String.format("%.2f", kaup));
		System.out.println(
				name+"은 BMI지수는 "+d+"이고,"+result+"이다"); */
		// 위 문장을 printf 로 변경하시오
		return name+"은 bmi지수"+kaup+"이고"+result+"이다";
		
				
	}
}
