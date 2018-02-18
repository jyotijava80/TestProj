package com.jyoti.designPattern.Adapter;

public class MP4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String filename) {
		// TODO Auto-generated method stub
		// do nothing

	}

	@Override
	public void playMP4(String filename) {
		// TODO Auto-generated method stub
      System.out.println("Playing MP4 format for file-->"+filename);
	}

}
