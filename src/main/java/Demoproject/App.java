package Demoproject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	public static final Logger LOG=LogManager.getLogger(App.class);
	public static void main(String[] args) {
		System.out.println("Hello world");
		
		String massage = "0";
		LOG.debug(massage+"print dubug massage");
		LOG.info(massage+"print info massage");
		LOG.error(massage+"print error massage");
		LOG.warn(massage+"print warnmassage");
		LOG.fatal(massage+"print fatal massage");



			}

}
