package gamefinal;

import java.util.ArrayList;
import java.util.Random;

public class Player implements Runnable{
	//Thread t;
	private ArrayList<Integer> numbers = new ArrayList<Integer>(10);
	int matches = 0;
	
	
	public Player(String name) {
		//t = new Thread(name);
		System.out.print("\n" + name + "        ");
		for(int i=0;i<10;i++) {
			int randu = randInt(1, 49, i);
			numbers.add(randu);
			System.out.print(randu + " ");
			
		}
	}



	private int randInt(int i, int j, int k) {
		Random rand = new Random();
	    int randomNum = rand.nextInt((j - i) + 1) + i;
	    
	    	for(int ii = 0; ii < k; ii++) {
	    		if(numbers.get(ii) == randomNum) {
	    			randomNum = rand.nextInt((j - i) + 1) + i;
	    		}
	    	}
	    
	    return randomNum;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println();
		for(int i = 0; i < 10; i++) {
			//System.out.print(numbers.get(i));
			//System.out.println("test1" + GameStarter.numberdrawn);
			if(numbers.get(i) == GameStarter.numberdrawn) {
				matches = matches + 1;
				if(matches == 3) {
					GameStarter.setcomplete();
					//GameStarter.setwinner(i+1);
				}
				//System.out.println("Success" + matches + "\n");
				break;
			}
		}
		
		
	}
}
