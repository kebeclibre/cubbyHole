package Launch;

import cubbyHole.Consu;
import cubbyHole.CubbyHole;
import cubbyHole.Prod;

public class Main {

	public static void main(String[] args) {
		CubbyHole cubb = new CubbyHole();
		Prod pr = new Prod(cubb);
		Consu cs = new Consu(cubb);
		
		Thread t = new Thread(pr);
		Thread t2 = new Thread(cs);
		
		t.start();
		t2.start();
		// bloob, test
		
	}

}
