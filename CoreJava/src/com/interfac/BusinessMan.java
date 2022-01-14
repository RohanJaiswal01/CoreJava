package com.interfac;

public class BusinessMan extends Person implements Richman, SocialWorker {
	
  
	public BusinessMan() {
		// TODO Auto-generated constructor stub
	}
	public BusinessMan(String name, String ln) {
		
		super(name,ln);
	}
	
 @Override
 public void helpToOther() {
	// TODO Auto-generated method stub
	System.out.println("Help to others");
	
 }

@Override
public void donation() {
	// TODO Auto-generated method stub
	System.out.println("Donation");
}

@Override
public void party() {
	// TODO Auto-generated method stub
	System.out.println("Party");
}

@Override
public void earnmoney() {
	// TODO Auto-generated method stub
	System.out.println("Earn Money");
}
}
