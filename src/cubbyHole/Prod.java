package cubbyHole;

public class Prod implements Runnable {
	
	CubbyHole current = null;

	public Prod (CubbyHole cubb) {
		this.current = cubb;
		
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			current.setCubb();
			System.out.println("Round prod : " +i);
		}
		System.out.println("TERM PROD");
	// testing 
		
	}
	

}
