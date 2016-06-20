package gameRps;

import java.util.Random;

public class RPSServiceImpl implements RPSService{
RPSBean bean;
	@Override
	public void betPlayerValue(int playerValue) {
		
	}

	@Override
	public void setComputerValue() {
		Random random = new Random();
		int num = random.nextInt(3);
		bean.setComp(String.valueOf(num));
	}

	@Override
	public void whoWin() {
		String result="";
			

		}
	@Override
	public void showResult() {
		
	}

	@Override
	public boolean checkvalidation(String rps) {
		return false;
	}
}
