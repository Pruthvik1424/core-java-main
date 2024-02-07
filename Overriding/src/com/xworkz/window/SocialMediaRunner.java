package com.xworkz.window;

import com.xworkz.windows.add.Instagram;
import com.xworkz.windows.add.SocialMedia;
import com.xworkz.windows.add.Whatsapp;

public class SocialMediaRunner {

	public static void main(String[] args) {
		
		SocialMedia socialmedia =new SocialMedia();
		socialmedia.call();
		socialmedia.chat();
		socialmedia.GroupChats();
		System.out.println("%%%%%%%%%%%%%%%");
		
		Whatsapp whatsapp = new Whatsapp();
		whatsapp.call();
		whatsapp.chat();
		whatsapp.GroupChats();
		whatsapp.VideoCall();
		System.out.println("%%%%%%%%%%%%%%%%%%%%");
//		or
		
		SocialMedia wtsp1 = new Whatsapp();
		wtsp1.call();
		wtsp1.chat();
		wtsp1.GroupChats();
		((Whatsapp) wtsp1).VideoCall(); //here type casting is done
		System.out.println("&&&&&&&&&&&&&&&&&&&&");
		
		Instagram instagram = new Instagram();
		instagram.call();
		instagram.chat();
		instagram.GroupChats();
		instagram.VideoCall();
		instagram.Status();
		System.out.println("%%%%%%%%%%%%%%%%%%");
//		or
		SocialMedia insta1 = new Instagram();
		insta1.call();
		insta1.chat();
		insta1.GroupChats();
		
	    ((Whatsapp) insta1).VideoCall(); // here typecasting is happend,....., 
	    ((Instagram) insta1).Status();
	    System.out.println("%%%%%%%%%%%%%%%%%%%%%%%");
//	    or
	    
	    Whatsapp insta2 =new Instagram();
	    insta2.call();
		insta2.chat();
		insta2.GroupChats();
		insta2.VideoCall();
		((Instagram) insta2).Status();
	    
	    
		
		

	}

}
