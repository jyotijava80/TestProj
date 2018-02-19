package com.jyoti.designPattern.Template;

public abstract class Game {
	
	 abstract void initiate();
	 abstract void startPlay();
	 abstract void endPlay();
	 
	 public final void Play()
	 {
		 initiate();
		 startPlay();
		 endPlay();
	 };
	

}
