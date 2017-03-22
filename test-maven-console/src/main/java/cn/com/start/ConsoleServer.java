package cn.com.start;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cn.com.commons.utils.ApplicationContext;

public class ConsoleServer {
	

	private static Log log = LogFactory.getLog(ConsoleServer.class);
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		log.info("starting ConsoleServer!!!!");
		ApplicationContext.load();
		log.info("context loaded!!!!");
		log.info("stared ConsoleServer!!!! cost:" + (System.currentTimeMillis() - start) + " ms!");
		synchronized (ConsoleServer.class) {	
			while(true){
				try {
					ConsoleServer.class.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
