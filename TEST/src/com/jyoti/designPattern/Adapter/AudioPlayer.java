package com.jyoti.designPattern.Adapter;

public class AudioPlayer implements MediaPlayer {
	
	MediaAdapter mediaAdapter;

	@Override
	public void play(String AudioType, String Filename) {
		// TODO Auto-generated method stub
       if(AudioType.equalsIgnoreCase("mp3"))
       {
    	   System.out.println("playing mp3 format for file name-->"+Filename);
       }   
    	   else if(AudioType.equalsIgnoreCase("MP4") || AudioType.equalsIgnoreCase("VLC"))
    	   {
    		   mediaAdapter = new MediaAdapter(AudioType);
    		   mediaAdapter.play(AudioType, Filename);
    	   }
    	   
    	   else {
    		   
    		   System.out.println("invalid media"+ AudioType + "Format not Supported");
    	   }
       }
	

}
