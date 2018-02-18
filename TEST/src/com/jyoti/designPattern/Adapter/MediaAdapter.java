package com.jyoti.designPattern.Adapter;

public class MediaAdapter implements MediaPlayer {
	
	AdvancedMediaPlayer advancedMusicPlayer;

	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("vlc"))
				{
			advancedMusicPlayer = new VLCPlayer();
				}
		else if(audioType.equalsIgnoreCase("MP4"))
						{
					
					advancedMusicPlayer =new MP4Player();
						}
		
	}

	@Override
	public void play(String AudioType, String Filename) {
		// TODO Auto-generated method stub
		 if(AudioType.equalsIgnoreCase("VLC")){
	         advancedMusicPlayer.playVlc(Filename);
	      }
	      else if(AudioType.equalsIgnoreCase("MP4")){
	         advancedMusicPlayer.playMP4(Filename);
	      }

	}

}
