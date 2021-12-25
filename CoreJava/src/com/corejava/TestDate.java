package com.corejava;
import java.util.*;
import java.text.*;
public class TestDate {
	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		String dt = sdf.format(d); //Date --> String , date to string convert
		
		System.out.println(dt);
		
		String s = "05/12/2021 01:01:01";
		
		Date dd = sdf.parse(s);// String to Date convret, exception dega - add thorws exeception
			System.out.println(dd);
	}

}
