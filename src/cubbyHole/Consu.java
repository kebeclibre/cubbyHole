package cubbyHole;

public class Consu implements Runnable {
	
	CubbyHole current = null;
	
	public Consu (CubbyHole cubb) {
		this.current = cubb;
		
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			current.getCubb();
			System.out.println("Round Cons : " +i);
		}
		System.out.println("TERM CONS");
		
	}
}
