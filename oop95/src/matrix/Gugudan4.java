package matrix;

/**
 *@date   : 2016. 6. 22.
 *@author : 박승주
 *@file   : Gugudan4.java
 *@story  : 
*/
public class Gugudan4 {
	public static void main(String[] args) {
	
		int[][] mtx=new int[5][5];
		int k = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <5; j++) {
				k+=5;
				System.out.print(mtx[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

