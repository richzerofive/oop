package simpleRPS5;

import java.util.Random;

public class SimpleRPSServiceImpl implements SimpleRPSService{
	SimpleRPSBean rps = new SimpleRPSBean();
	@Override
	public String playGame(int player) {
		String result,winner = "";
		rps.setPlay(player);
		rps.setComp();
		int com = rps.getComp();
		int ply = rps.getPlay();
		int win = 0;
		if (com==ply) {
			result = "TIE";
			return "TIE";
		}
		switch (Math.abs(ply-com)) {
		case 1:
			win = (ply>com)? ply : com;
			break;
		case 2:
			win = (ply>com)? com : ply;
			break;
		default:
			break;
		}
		winner = (win == ply)?"플레이어":"컴퓨터";
		result = winner+"승리";
		return result;
	}

	@Override
	public String getResult(String result) {
		
		return "플레이어 : "+rps.getValue(rps.getPlay())+"\n"
		+"컴퓨터 : "+rps.getValue(rps.getComp())+"\n"
		+"결과 : "+this.playGame(rps.getPlay());
	}

}
