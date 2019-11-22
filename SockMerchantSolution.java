package com.practise;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
//Sample Program
public class SockMerchantSolution {
	
	//Local Method
	static int sockMerchant(int n, int[] ar) {
		int matchCount = 0;
		int currentColor = 0;
		int length = ar.length;

		ArrayList<Integer> sockColorsArray = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			currentColor = ar[i];
			if (sockColorsArray.contains(currentColor)) {
				matchCount++;
				sockColorsArray.remove(new Integer(currentColor));
			} else {
				sockColorsArray.add(new Integer(currentColor));
			}
		}
		return matchCount;
	}

	private static final Scanner scanner = new Scanner(System.in);
	//Main Method
	public static void main(String[] args) throws IOException {

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		//For Loop
		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant(n, ar);
		//Print Statement
		System.out.println(result);

		scanner.close();
	}
}
