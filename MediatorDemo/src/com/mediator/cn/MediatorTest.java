package com.mediator.cn;

public class MediatorTest {

	public static void main(String[] args){
		User u1 = new User("Robert");
		User u2 = new User("John");
		User u3 = new User("Alice");
		
		u1.sendMessage("Hi@john");
		u2.sendMessage("Hi@Robert");
		u3.sendMessage("Hi@Everyone");
	}
}
