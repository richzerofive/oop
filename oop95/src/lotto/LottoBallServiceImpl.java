package lotto;

/**
 * @date : 2016. 6. 24.
 * @author : 박승주
 * @file : LottoBallServiceImpl.java
 * @story :
 */
public class LottoBallServiceImpl implements LottoBallService {

	private int[] alotto;
	LottoBean bean = new LottoBean();
	@Override
	public void setLottoBall() {
		
		this.alotto = new int[6];
		
		for (int i = 0; i < alotto.length; i++) {
			bean.setNumber();
			this.alotto[i] = bean.getNumber();
		}
	}

	@Override
	public int[] getLottoBall() {
		return alotto;
	}
}
	

