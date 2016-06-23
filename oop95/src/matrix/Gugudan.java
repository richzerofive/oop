package matrix;

/**
 * @date : 2016. 6. 22.
 * @author : 박승주
 * @file : gugu.java
 * @story :
 */
public class Gugudan {
	public static void main(String[] args) {
		int j = 0, i = 0;
		for (i = 1; i <= 9; i++) {
		System.out.println();
		for (j = 2; j <= 5; j++) {
		System.out.print(j + "*" + (i) + "=" + (i * j) + "\t");
		}

		}
		System.out.println("\n");
		for (i = 1; i <= 9; i++) {
		System.out.println();
		for (j = 6; j <= 9; j++) {
		System.out.print(j + "*" + (i) + "=" + (i * j) + "\t");
		}
		}

	}
}
