package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Prime numbers from what value?");
		int n = in.nextInt();

		int[] rawArray = new int[n];
		int a = 1;
		for (int i = 0; i < n; i++) {
			
			rawArray[i] = a;
			a++;
		}
		boolean[] label = new boolean[n];

		int p = 2;

		while (p <= n / 2) {
			for (int i = p; i < n; i++) {
				if (!label[i]&&rawArray[i]%p == 0) {
				
					label[i] = true;
				}

			}
			p++;
			
			while (p<= n / 2 && label[p-1]) {
				p++;
			}
		}
		System.out.println("Prime Numbers"  );
		label[0]=true;
		for (int i = 0; i < n; i++) {
			if (!label[i]) {
			System.out.println(rawArray[i]);
		
		}
		
	}
}
}