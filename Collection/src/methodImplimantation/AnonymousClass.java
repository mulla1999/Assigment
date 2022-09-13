package methodImplimantation;

public class AnonymousClass {
	public static void main(String[] args) {
		System.out.println("Program Start");
		// This is Anonymous class
		System.err.println("This from Anonymous Class");
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println(i);

				}

			}
		};
		r.run();
		System.err.println("This is from Lamba Expression");
		Runnable r1 = () -> {
			for (int i = 6; i <= 10; i++) {
				System.out.println(i);

			}

		};
		r1.run();
		System.out.println("Program End");
	}

}
