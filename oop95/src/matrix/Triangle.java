package matrix;

/**
 * @date : 2016. 6. 22.
 * @author : 박승주
 * @file : Triangle.java
 * @story :
 */
public class Triangle {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j > 0; j--) {
				if (i >= j) {
					System.out.print(j);
				} else {
					System.out.print(" ");
				}
			}
				System.out.println();
			}
		}
	}
