package gamefinal;

public class GameStarter {
	public static int numbplayers;
	static int winner = 0;
	static int numberdrawn;
	
	
	static boolean complete = false;
	public static int drawn;
	public static void main(String args[]) throws InterruptedException {
		Game Start = new Game();
		Start.startingMsg();
	
		Game game = new Game();
		//Player players[] = new Player[numbplayers];
		//System.out.println("no.o f players");
		Player playerarr[] = new Player[numbplayers];
		for(int i = 0; i < numbplayers; i++) {
			playerarr[i] = new Player("player" + (i+1));
		}
		System.out.println();
		if(numbplayers>0) {
			Moderator moderator = Moderator.getInstace(game);
			System.out.println();
			for(int j = 0; j < 10 && complete == false; j++) {
				moderator.run();
				for(int i = 0; i < numbplayers && complete == false; i++) {
					playerarr[i].run();
					setwinner(i+1);
				}
			}
			if(winner > 0 && complete) {
				System.out.println("\nPlayer " + winner + " has won.");
			}
			else {
				System.out.println("\nNo one has one won. Better luck Next Time");
			}
			
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("\nHope you enjoyed, You are welcome to play another Game");
		}
		else {
			System.out.println("\n There should be atleast 1 player");
		}
		
		
	}
	public static synchronized void setNumber(int drawn2) {
		// TODO Auto-generated method stub
		numberdrawn = drawn2;
	}
	public static void setcomplete() {
		// TODO Auto-generated method stub
		complete = true;
	}
	public static void setwinner(int i) {
		// TODO Auto-generated method stub
		winner = i;
	}
	
}
