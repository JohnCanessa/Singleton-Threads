package threads.singleton.canessa;

import java.util.concurrent.Semaphore;

/*
 * Typical Singleton implementation
 */
public class Singleton {
	
	// **** members ****
	private static 	Singleton 	singleInstance = null;
	
	private	static	Semaphore	sem = new Semaphore(1);

	public 			int 		val = 0;
	
	// **** constructor ****
	private Singleton() {
		val = 0;
	}
	
	// **** get instance of this class ****
	public static Singleton getInstance() {
				
//		// **** request access ****
//		try {
//			sem.acquire();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		// **** instantiate this class (if needed) ****
		if (singleInstance == null) {
			
			// **** instantiate Singleton ****
			singleInstance = new Singleton();
			
			// **** inform user what is going on ****
			System.out.println("hashCode: " + singleInstance.hashCode());
		}
		
//		// **** release access ****
//		sem.release();

		// **** return this class ****
		return singleInstance;
	}

}
