package phone;

import javax.swing.JOptionPane;

public class PhoneController {
	public static void main(String[] args) {
		Phone phone = new Phone();
		CellPhone CelPhone = new CellPhone();
		Iphone iphone = new Iphone();
		AndroidPhone androidPhone = new AndroidPhone();
		while (true) {
			switch (JOptionPane.showInputDialog("1.유선폰 2.휴대폰 3. 아이폰 4. 안드로이드폰 0.종료")) {
			case "1":
				phone.setCompany(JOptionPane.showInputDialog("어느회사제품?"));

				phone.setCall(JOptionPane.showInputDialog("통화내용"));

				JOptionPane.showMessageDialog(null, phone.toString());
				break;

			case "2":
				CelPhone.setCompany(JOptionPane.showInputDialog("어느회사제품?"));
				CelPhone.setCall(JOptionPane.showInputDialog("통화내용"));
				CelPhone.setPortable(true);//이동가능하다
				JOptionPane.showMessageDialog(null, CelPhone.toString());
				break;

			case "3":
				iphone.setCompany(JOptionPane.showInputDialog("어느회사제품?"));
				iphone.setCall(JOptionPane.showInputDialog("통화내용"));
				iphone.setPortable(true);//이동가능하다
				iphone.setData(JOptionPane.showInputDialog("문자내용"));
				JOptionPane.showMessageDialog(null, iphone.toString());
				
				break;
			case "4":
				androidPhone.setDate(JOptionPane.showInputDialog("통화내용"), JOptionPane.showInputDialog("사이즈"), JOptionPane.showInputDialog("카톡내용"));
				
				JOptionPane.showMessageDialog(null, androidPhone.toString());
				
				break;
			case "0":
				return;

			default:
				break;
			}
		}
	}
}
