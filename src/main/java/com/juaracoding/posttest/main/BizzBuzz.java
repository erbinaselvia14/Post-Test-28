package com.juaracoding.posttest.main;

public class BizzBuzz {

	public static void main(String[] args) {
		for (int bilangan=1;bilangan<=100;bilangan++) {
			
			if(bilangan%3==0){
				System.out.println("BIZZ, ");
			}
			
			if(bilangan%5==0) {
				System.out.println("BUZZ, ");
			}
			
			if(bilangan%3==0 && bilangan%5==0) {
					System.out.println("BIZZBUZZ, ");
			}else {
				System.out.print(bilangan+",");
			}
		}
	}
}
