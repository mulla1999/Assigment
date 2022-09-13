package logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
	public static final Logger LOGGER = Logger.getLogger(Test.class.getName());
	public static void main(String[] args) throws SecurityException, IOException {
		FileHandler fh = new FileHandler("C:\\Users\\amirm\\OneDrive\\Desktop\\Techo.logfiles.log");
		fh.setLevel(Level.FINEST);
		MyFormatter mf = new MyFormatter();
		fh.setFormatter(mf);
		LOGGER.addHandler(fh);
		LOGGER.setLevel(Level.FINEST);
		LOGGER.severe("I am Sever");
		LOGGER.warning("I am Warning");
		LOGGER.info("I am Info");
		LOGGER.config("I am Config");
		LOGGER.fine("I am Fine");
		LOGGER.finest("I am Finest");
		LOGGER.finer("I am Finer");
		
	}

}
