package cubbyHole;

public class CubbyHole {
	private int cubb;

	public synchronized void getCubb() {
		if (cubb < 1) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} }
			
		
			this.cubb -=1;
			System.out.println(this.cubb);
			System.out.println("minus");
			
			notify();
			
		}
	

	public synchronized void setCubb() {
		if (cubb > 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} }
			this.cubb += 1;
			System.out.println(this.cubb);
			System.out.println("plus");
			notify();
			
		
	}
}
