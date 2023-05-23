package com.kamalkanth.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {

	public void up() {
		// TODO Auto-generated method stub
		System.out.println("UP");
		
	}

	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Down");
		
	}

	public void left() {
		// TODO Auto-generated method stub
		
		System.out.println("Left");
	}

	public void right() {
		// TODO Auto-generated method stub
		
		System.out.println("Right");
	}
	
	
	

}
