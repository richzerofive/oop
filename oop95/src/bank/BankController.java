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
		AccountService service = new AccountServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog("1.개설 2.입금 3.조회 4.출금 5.통장내역 0.종료")) {
			case "1":
				String spec= JOptionPane.showInputDialog("이름,id,pw");
				String[] specArr=spec.split(",");
				service.openAccount(specArr[0], specArr[1], specArr[2]);
				break;
			case "2":
				String inputMoney=JOptionPane.showInputDialog("입금액?");
			//	account.setMoney(Integer.parseInt(inputMoney));
				service.deposit(Integer.parseInt(inputMoney));
				break;
			case "3":
				//JOptionPane.showMessageDialog(null, service.findAccount());
				break;
			case "4":
				String outputMoney=JOptionPane.showInputDialog("출금액?");
				 JOptionPane.showMessageDialog(null, service.withdraw(Integer.parseInt(outputMoney)));
				break;
			case "5":
				JOptionPane.showMessageDialog(null, service.showAccount());
				break;
			case "0":
				int ok =JOptionPane.showConfirmDialog(null, "종료?");
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
