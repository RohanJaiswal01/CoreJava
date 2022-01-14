package com.interfac;

public class TestBusinessMan {

	public static void main(String[] args) {
		
	Richman rm = new BusinessMan();
	
	rm.earnmoney();
	rm.donation();
	rm.party();
	
	SocialWorker sw = new BusinessMan();
	
	sw.helpToOther();
	
	Person p = new BusinessMan("Rohan", "Jaiswal");	
	}
}
