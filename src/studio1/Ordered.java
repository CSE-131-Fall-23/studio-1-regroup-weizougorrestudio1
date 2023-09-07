package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		boolean isOrdered = false;
		if (x < y && y < z || z < y && y < x) {
			isOrdered = true;
		}
		System.out.println(isOrdered);

	}

}
