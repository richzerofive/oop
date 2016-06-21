package gameRps;

import java.util.Random;

import javax.swing.JOptionPane;

public class RPSServiceImpl implements RPSService{
RPSBean bean;
String result = "";
	@Override
	public void betPlayerValue(int player) {
		
	}

	@Override
	public void setComputerValue() {
		Random random = new Random();
		int num = random.nextInt(3)+1;
		bean.setComp(String.valueOf(num));
	}

	@Override
	public void whoWin() {
		
		
		
		
		while (true) {
			Random r=new Random();
			switch (JOptionPane.showInputDialog("1.가위 2바위 3.보")) {
			case "1":
				switch (r.nextInt(3)+1) {
				case 1: result = "TIE"; break;
				case 2 : result = "LOSE"; break;
				case 3 : result = "WIN"; break;
					default:
					break;
				}
			case "2":
				switch(r.nextInt(3)+1) {
			case 1 : result = "LOSE"; break;
			case 2 : result = "WIN"; break;
			case 3 : result = "TIE"; break;
				default:
				break;
				}
				break;
			case "3":
				switch(r.nextInt(3)+1) {
				case 1 : result = "WIN"; break;
				case 2 : result = "TIE"; break;
				case 3 : result = "LOSE"; break;
				
			
			default:
				break;
				}		
			}
		}
}

	@Override
	public void showResult() {
		JOptionPane.showMessageDialog(null, result);
	}

	@Override
	public boolean checkvalidation(String rps) {
		return false;
	}
}
