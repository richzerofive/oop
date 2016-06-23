package lotto2;

/**
 *@date   : 2016. 6. 23.
 *@author : 박승주
 *@file   : lottoService.java
 *@story  : 
*/
public interface LottoService {
	public void setLottos(LottoBean bean);
	public int[][] getLottos();
	public boolean isDuplication(int conut , int num);
	public void sort(int[]arr);
	public int count(LottoBean bean);
}
