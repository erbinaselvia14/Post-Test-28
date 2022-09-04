package com.juaracoding.posttest.main;

public class DataTrailer {

	public static void main(String[] args) {

		String [] t1= {"SOAL3/2112/AB00000","0011 OD:0001234500","CDE5432100 SOAL003"," ABCDE12345 XAS SK","ILL TEST ESSAY .DT"};
		String [] t2= {"SOAL3/2111/BC00001","1100 OD:0003452100","EFG2451300 SOALOO3"," EFGHI25134 XAS SK","ILL TEST ESSAY .DT"};
		String [] t3= {"SOAL3/2110/DE21003","1010 OD:0001524300","HIJ2145300 SOALOO3"," JKLMNS2431 XAS SK","ILL TEST ESSAY .DT"};
		
		String T1="202112SOAL3";
		String T2="202111SOAL3";
		String T3="202110SOAL3";
		
		System.out.println(":T1:" + T1);
		System.out.println(":T2:" + t1[2]+t1[3]+t1[4]+t1[0]+t1[1]);
		System.out.println();
		System.out.println(":T1:" + T2);
		System.out.println(":T2:" + t2[2]+t2[3]+t2[4]+t2[0]+t2[1]);
		System.out.println();
		System.out.println(":T1:" + T3);
		System.out.println(":T2:" +t3[2]+t3[3]+t3[4]+t3[0]+t3[1]);
	}

}
