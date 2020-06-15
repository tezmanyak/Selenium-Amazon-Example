package amazon.utils;

import java.util.concurrent.TimeUnit;

public class Utils {

	public static void sleepSecond(long seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
		}
	}
	
}
