/**
 * 
 */
package kaup;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 *@date   : 2016. 6. 15.
 *@author : 박승주
 *@file   : KaupCEx.java
 *@story  : 
*/
public class KaupController {
	public static void main(String[] args) {
		Kaup k = new Kaup();
		while (true) {
			
			switch (JOptionPane.showInputDialog("1:실행 0:종료?")) {
			case "1":
				String name = JOptionPane.showInputDialog("이름");
				String height = JOptionPane.showInputDialog("키");
				String weight = JOptionPane.showInputDialog("몸무게");
				k.setName(name);
				k.setHeight(height);
				k.setWeight(weight);
				
				JOptionPane.showMessageDialog(null, k.execute());
				break;

			default:
				JOptionPane.showConfirmDialog(null, "closing?");
				return;
			}
		}
	}}