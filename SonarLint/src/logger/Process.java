package logger;

import java.util.logging.Logger;

public class Process {
	public static final Logger LOGGER = Logger.getLogger("com.te.logger");
	public static void main(String[] args) {
		User reciver = new User();
		reciver.setName("Amir");
		reciver.setBalance(14000);
		reciver.setUpiId("9833947245@ybl");
		reciver.setPhoneNumber(9833947245l);
		
		User user = new User();
		user.setName("Ajay");
		user.setBalance(1400);
		user.setUpiId("953871735@ybl");
		user.setPhoneNumber(953871735l);
		
		PhonePay phonepay = new PhonePay();
		phonepay.user.add(user);
		phonepay.user.add(reciver);
		
		phonepay.sendMoney(9833947245l, 700);
		LOGGER.fine("Program Completed");
		
	}

}
