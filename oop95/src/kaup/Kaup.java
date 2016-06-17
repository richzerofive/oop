/**
 * 
 */
package kaup;

import java.util.Scanner;

/**
 *@date   : 2016. 6. 15.
 *@author : 박승주
 *@file   : kaup.java
 *@story  : 
*/
public class Kaup {
	
	String name,height,weight;

	public void setName(String name){//write=set
		String result = "";
		double height = Double.parseDouble(this.height),
				weight = Double.parseDouble(this.weight),
				kaup = 0.0;this.name = name;
	}
	public void setHeight(String height){//write
		this.height=height;
	}
	public void setWeight(String weight){//write
		this.weight=weight;
	}
	public String getName(){
		return this.name;
	}
	public String getHeight(){
		return this.height;
	}
	public String getWeight(){
		return this.weight;
	}
	
	
	
	public String execute() {
	String result = "";
	double height = Double.parseDouble(this.height),
			weight = Double.parseDouble(this.weight),
			kaup = 0.0;
	
	// ----------op-----------
	
	// -------수식---------
	height = height * 0.01;
	kaup = weight / height / height;

	if (kaup < 18.5) {

	} else if (18.5 <= kaup && kaup < 23) {
		result = "저체중";
	} else if (23 <= kaup && kaup < 25) {
		result = "정상체중";
	} else if (25 <= kaup && kaup < 30) {
		result = "비만1단계";
	} else if (30 <= kaup && kaup < 40) {
		result = "비만2단계";
	} else if (kaup >= 40) {
		result = "비만3단계";
		/*System.out.println(
				name + "은 BMI지수는 " + Double.parseDouble(String.format("%.2f", kaup)) 
				+ "이고," + " " + result + "이다");*/
		// 위 문장을 printf로 변경하시오
	
	}
	return name+"은 BMI지수는"+String.format("%.2f", kaup)+"이고"+result+"이다";
	}
}
