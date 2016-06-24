package LottoEx;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JOptionPane;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

/**
 * @date : 2016. 6. 23.
 * @author : 박승주
 * @file : lottoController.java
 * @story :
 */
public class LottoMain {
	public static void main(String[] args) {
		LottoBean bean = new LottoBean();
		LottoService service = new LottoServiceImpl();
		bean.setMoney(Integer.parseInt(JOptionPane.showInputDialog("얼마치 구입?")));
		service.setLottos(bean);
		StringBuffer buf = new StringBuffer();
		int[][] lottos = service.getLottos();
		for (int i = 0; i < lottos.length; i++) {
			service.sort(lottos[i]);
			Arrays.sort(lottos[i]);
			for (int j = 0; j < lottos[i].length; j++) {
				buf.append(lottos[i][j] + "\t");
			}
			buf.append("/");
		}
		System.out.println("로또/n" + buf);
		int lottoSerialNo = (int) (Math.random() * 99999 + 100000);
		File output = new java.io.File("c:\\eclipse\\lotto\\" + lottoSerialNo + ".txt");
		BufferedWriter bw = null;
		FileWriter fw = null;
		String[] myLotto = buf.toString().split("/");

		try {
			bw = new BufferedWriter(new FileWriter(output,true));
			for(String lots : myLotto){
				lots += System.getProperty("line.separator");
				bw.write(lots);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.flush();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	}
}
