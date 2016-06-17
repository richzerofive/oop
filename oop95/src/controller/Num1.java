/**
 * 
 */
package controller;

/**
 *@date   : 2016. 6. 14.
 *@author : 박승주
 *@file   : Num1.java
 *@story  : 
*/
public class Num1 {
	public String execute(String inputname1,int inputavg1,String inputname2,int inputavg2,String inputname3,int inputavg3){
		
		String name1=inputname1;
		String name2=inputname2;
		String name3=inputname3;
		int avg1=inputavg1;
		int avg2=inputavg2;
		int avg3=inputavg3;
		int gradeA1=0,gradeA2=0,gradeA3=0;
		String grade1="",grade2="",grade3="";
		if (avg1 > avg2 && avg1 > avg3) {
			grade1 = name1;
			gradeA1 = avg1;
			 if(avg2 > avg3) {
				grade2 = name2;
				gradeA2 = avg2;
				grade3 = name3;
				gradeA3 = avg3;
			}  {
				grade2 = name3;
				gradeA2 = avg3;
				grade3 = name2;
				gradeA3 = avg2;
			}
		}   if (avg2 > avg3) {
			grade1 = name2;
			gradeA1 = avg2;
			if (avg1 > avg3) {
				grade2 = name1;
				gradeA2 = avg1;
				grade3 = name3;
				gradeA3 = avg3;
			} else {
				grade2 = name3;
				gradeA2 = avg3;
				grade3 = name1;
				gradeA3 = avg1;
			}
		} else {
			grade1 = name3;
			gradeA1 = avg3;
			 if(avg1 > avg2) {
				grade2 = name1;
				gradeA2 = avg1;
				grade3 = name2;
				gradeA3 = avg2;
			} else  {
				grade2 = name2;
				gradeA2 = avg2;
				grade3 = name1;
				gradeA3 = avg1;
			}
		}

		return  "1 등 : "+grade1+"의 점수는"+gradeA1
				    +    "2 등 : "+grade2+"의 점수는"+gradeA2
				    +    "3 등 : "+grade3+"의 점수는"+gradeA3;
	}
}     


