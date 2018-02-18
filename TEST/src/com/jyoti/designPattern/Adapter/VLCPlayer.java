package com.jyoti.designPattern.Adapter;

public class VLCPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String filename) {
		// TODO Auto-generated method stub
		
		System.out.println("Playing VLC for filename-->"+ filename);
		
	}

	@Override
	public void playMP4(String filename) {
		// TODO Auto-generated method stub
		// do nothing
	}

}
