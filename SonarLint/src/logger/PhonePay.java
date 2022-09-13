package logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class PhonePay {
	
	public static final Logger LOGGER = Logger.getLogger("com.te.logger");
	
	List<User>  user;
	
	public void sendMoney(long phoneNumber, double amount) {
		List<User> collect = user.stream().filter(u->u.getPhoneNumber()==phoneNumber).collect(Collectors.toList());
		if (!collect.isEmpty()) {
			User reciver = collect.get(0);
			double newBalance = reciver.getBalance() + amount;
			reciver.setBalance(newBalance);
			LOGGER.fine("The transaction is succesfull, you paid " + reciver.getName()+" "+ amount);
			
		} else {
			LOGGER.warning("The User  is you are looking for is not register on PhonePAY, DO you want to invite him");

		}
	}

	public PhonePay() {
		user = new ArrayList<>();
		LOGGER.setLevel(Level.ALL);
		FileHandler filehandler;
		
			try {
				filehandler = new FileHandler("Logoftransaction.log");
				filehandler.setLevel(Level.ALL);
				LOGGER.addHandler(filehandler);
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	

}
