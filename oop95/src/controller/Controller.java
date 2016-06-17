/**
 * 
 */
package controller;



import java.util.Scanner;

import javax.swing.JOptionPane;


/**
 *@date   : 2016. 6. 15.
 *@author : 박승주
 *@file   : Controller2.java
 *@story  : 
*/
public class Controller {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Clac clac =new Clac();
		Mn1	mn1 = new Mn1();
		
		while (true) {
			System.out.println("[메뉴]"
					+"1.계산기"
					+"2.카우푸"
					+"3.최고최소"
					+"0.종료"
					);
			switch (s.next()) {
			case "1":
				System.out.println("num1,opcode,num2 입력");
				String a =clac.execute(s.nextInt(), s.next(), s.nextInt());
				break;
			case "2":break;
			case "3":
				System.out.println("학생수");
				int count = s.nextInt();
				System.out.println("점수입력");
				int[] score = new int[count];
				for (int i=0; i < count; i++) {
					score[i] = s.nextInt();
				}
				System.out.println(mn1.execute(score));
			case "0":
				JOptionPane.showConfirmDialog(null, "Closing OK?");
				return;

			default:
				break;
			}
			
		}
			
		}
	}

