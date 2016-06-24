package LottoEx;

/**
 *@date   : 2016. 6. 23.
 *@author : 박승주
 *@file   : lottoServiceImpl.java
 *@story  : 
*/
public class LottoServiceImpl implements LottoService{

	private int[][]lottos;
	private int[] lotto;
	private int count; // 돈에 따른 회전수
	
	@Override
	public void setLottos(LottoBean bean) {
		// 회전수를 입력받아서 매트릭스로 로또 추첨
		this.count = count(bean);
		this.lottos = new int[count][6];
		this.lotto = new int[6];
		int i = 0;
		if (count<0) {
			this.lottos = null;
		} else {
			for (count = 0; count < lottos.length; count++) {
				while (true) {
					bean.setNumber();
					int num = bean.getNumber();// 0대신 식을 채우시오;
					
					if (isDuplication(count, num)) {
						continue;
					}
					this.lottos[count][i] = num;
						i++;
						if (i==lottos[count].length) {
							i=0;
							break;
						}
				  }
		}
			}}

	@Override
	public int[][] getLottos() {
		// 로또를 가져온다(완성)
		return lottos;
	}

	@Override
	public boolean isDuplication(int count, int num) {
		// 중복방지(완성)
		for (int i = 0; i < lottos[count].length; i++) {
			if (lottos[count][i]==num) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void sort(int[] bean) {
		// 오름차순을 정렬(줄단위로 해당)
		for (int i = 0; i < bean.length -1; i++) {
			for (int j = 0; j < bean.length -i -1; j++) {
				if (bean[j]>bean[j+1]) {
					int temp = bean[j];
					bean [j] = bean[j+1];
					bean[j+1]=temp;
			}
		}
	}
	}

	@Override
	public int count(LottoBean bean) {
		return bean.getMoney()/1000; // 1000단위 횟수추출하도록 편집
	}
	
}
