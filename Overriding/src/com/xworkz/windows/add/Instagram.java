package com.xworkz.windows.add;

public class Instagram extends Whatsapp {
	@Override
	public void chat() {
		System.out.println("Chatting in socialmedia.....");
	}
	@Override
	public void call() {
		System.out.println("calling in socialmedia.......");
	}
	@Override
	public void GroupChats() {
		System.out.println("Groupchats in socialmedia......");
	}  
	public void Status() {
		System.out.println("whatsapp Status sharing to instagram....");
	}
}
