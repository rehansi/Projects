package transcation;

import java.util.Arrays;

import java.util.Scanner;

public class DriverApp {
	public static void main(String[] args) {

		int nod;

		Scanner sc = new Scanner(System.in);

		System.out.println("please enter number of days shop is open");

		nod = sc.nextInt();

		int trans[] = new int[nod];

		for (int i = 0; i < trans.length; i++) {

			System.out.println("please enter income of day" + (i + 1));
			trans[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(trans));

		System.out.println("please enter number of target");

		int targets = sc.nextInt();
		int sum;
		int flag;

		for (int i = 1; i <= targets; i++) {
			sum = 0;
			flag = 0;
			System.out.println("please enter target" + i);

			int target = sc.nextInt();
			for (int j = 0; j < trans.length; j++) {
				sum = sum + trans[j];
				if (sum >= target) {
					flag = 1;
					System.out.println("Target is achived on day" + (j + 1));
					break;
				}
				System.out.println(" ");
			}
			if (flag == 0) {
				System.out.println("Target is not achived");
			}
		}

	}
}
