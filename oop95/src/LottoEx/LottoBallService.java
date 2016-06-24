package LottoEx;

/**
 *@date   : 2016. 6. 24.
 *@author : 박승주
 *@file   : LottoBallService.java
 *@story  : 
*/
public interface LottoBallService {
	public void setLottoBall();
	public int[] getLottoBall();
	public boolean isDuplication(int count, int num);
}
