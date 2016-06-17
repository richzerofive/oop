/**
 * 
 */
package bank;

import javax.swing.JOptionPane;

import com.sun.org.apache.xml.internal.security.utils.Constants;

import global.MyConstants;

/**
 *@date   : 2016. 6. 15.
 *@author : 박승주
 *@file   : BankController.java
 *@story  : 
*/
public class BankController {
	public static void main(String[] args) {
		Account account = null;
		while (true) {
			switch (JOptionPane.showInputDialog("1.개설 2.입금 3.조회 4.출금 5.통장내역 0.종료")) {
			case "1":
				int ok=JOptionPane.showConfirmDialog(null, "계좌계설?");
				if (ok==0) {
					account = new Account(JOptionPane.showInputDialog("이름"));
				} else {
					continue;

				}
				break;
			case "2":
				String inputMoney=JOptionPane.showInputDialog("입금액?");
				account.setMoney(Integer.parseInt(inputMoney));
				break;
			case "3":
				JOptionPane.showMessageDialog(null, account.getMoney());
				break;
			case "5":
				JOptionPane.showMessageDialog(null, MyConstants.BANK_NAME+"이름 : "+account.getName()+"계좌번호 : "+account.getAccountNo());
			case "0":
				ok =JOptionPane.showConfirmDialog(null, "종료?");
				if (ok==0) {
					return;
				}else{
				continue;}
				default:
				return;
			}
		}
	}
	
}
