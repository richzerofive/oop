package gameRps;

import javax.swing.JOptionPane;

public class RPSController {
	public static void main(String[] args) {
			RPSService service = new RPSServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog("1.계속 2.종료")) {
			case "1":
				String rps= JOptionPane.showInputDialog("1.가위 2.바위 3.보자기"); 
					if(service.checkvalidation(rps)){
						service.betPlayerValue(Integer.parseInt(rps));
						service.setComputerValue();
						service.whoWin();
					}else{
						JOptionPane.showMessageDialog(null, "1~3만 가능");
						continue;
					}
				break;
				
			default:
				break;
			}
		}
		}
	}
