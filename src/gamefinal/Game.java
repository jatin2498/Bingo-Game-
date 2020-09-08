package gamefinal;

import java.util.Scanner;
import java.io.*;
public class Game {
	private static int numbPlayers = 0;
	//private static boolean gameCompleted = false;
	static int modnumber;
	
	
	public void startingMsg() {
		// TODO Auto-generated method stub
		
		System.out.println("_______________Lets Play____________");
		System.out.println("Enter Number of Players Numbers");
	
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		numbPlayers = s.nextInt();
		
		//numbPlayers = Integer.parseInt(System.console().readLine());
		
		/*
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(i);
	    try {
	    	
	    	try {
	    		numbPlayers = Integer.parseInt(b.readLine());
	    	} catch(NumberFormatException exception) {
	    		System.out.println("Enter an Integer");
	    	}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Enter an Integer");
		}
		*/
	    
		
		
		
		
		GameStarter.numbplayers = numbPlayers;
	}
}