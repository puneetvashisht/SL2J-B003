package com.cts.stringsdemo;

public class StringDemo {

	public static void main(String[] args) throws InterruptedException {
		String str1 = "Friday";
		String str2 = "Friday";
		
		String changedObj = str1.substring(3);
		
		System.out.println(str1);
		System.out.println(changedObj);
		
		
		
//		String initVal = "";
		StringBuffer sb = new StringBuffer("");
		
		for(int i=0; i<1000; i++){
			Thread.sleep(20);
//			initVal  +=  i;
			sb.append(i);
		}
		System.out.println(sb.toString());
		
//		String str1 = new String("Friday");
		
//		String str2 = new String("Friday");
		
		System.out.println(str1 == str2);

	}

}
