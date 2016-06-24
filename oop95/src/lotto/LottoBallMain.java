package lotto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * @date : 2016. 6. 24.
 * @author : 박승주
 * @file : SBSMain.java
 * @story :
 */
public class LottoBallMain {
	public static void main(String[] args) {
		LottoBean bean = new LottoBean();
		LottoBallService service = new LottoBallServiceImpl();
		service.setLottoBall();
		StringBuffer buf = new StringBuffer();
		int[] lottos = service.getLottoBall();
		for (int i = 0; i < lottos.length; i++) {
			Arrays.sort(lottos);
			buf.append(lottos[i] + "\t");
		
		buf.append("/");
		}
		System.out.println("로또/n"+buf);

		int lottoSerialNo = (int) (Math.random() * 99999 + 100000);
			File output = new java.io.File("c:\\eclipse\\lotto\\lottoball.txt");
			BufferedWriter bw = null;
			FileWriter fw = null;
			String[] myLotto = buf.toString().split("/");
			
			try {
				bw = new BufferedWriter(new FileWriter(output,true));
				for(String lots : myLotto){
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

