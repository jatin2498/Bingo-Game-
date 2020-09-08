// SINGLETON IMPLEMENTED HERE

package gamefinal;

import java.util.ArrayList;
import java.util.Random;

public class Moderator implements Runnable, Subject{
	
	private static Moderator moderator;
	
	public static Moderator getInstace(Game game) {
		// TODO Auto-generated method stub
		if(moderator == null) {
			moderator = new Moderator();
		}
		return moderator;
	}
	private int l = 0;
	private ArrayList<Integer> numbersdrawn = new ArrayList<Integer>(10);
	@Override
	public void run() {
		
		
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int drawn = randInt(1, 49, l);
		l = l + 1;
		numbersdrawn.add(drawn);
		GameStarter.setNumber(drawn);
	
		
		// TODO Auto-generated method stub
		System.out.println("The Number drawn is: " +  drawn);
		


	
	}
	private int randInt(int i, int j, int k) {
		Random rand = new Random();
		int randomNum = rand.nextInt((j - i) + 1) + i;
		for(int ii = 0; ii < k; ii++) {
    		if(numbersdrawn.get(ii) == randomNum) {
    			randomNum = rand.nextInt((j - i) + 1) + i;
    		}
    	}
		return randomNum;
	}
	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove(Observer o) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int notifyit() {
		// TODO Auto-generated method stub
		return 0;
	}
}
