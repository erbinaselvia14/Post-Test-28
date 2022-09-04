package com.juaracoding.posttest.main;

public class Segitiga {

	public static void main(String[] args) {
				
		int nilai = 5;
		
		for (int i = nilai; i >= 1; i--) {

			int vaTemp = 0;
			int x = nilai - i + 1;
			while (vaTemp != i) {
				if (x % 2 != 0) {
					if (!(i % 2 == 0 && vaTemp >= i - 1)) {
						System.out.print(x);
					}
					vaTemp++;
				} else {
					System.out.print("_");
				}
				x++;
			}
			System.out.println("");
		}

	}
}
