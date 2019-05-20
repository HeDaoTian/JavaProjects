package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("John","Smith");
		System.out.println(em1.showInfo());
		em1.changePassword("123456!@#");
		em1.setAlternateEmail("JS@gmail.com");
		em1.setMailboxCapacity(800);
		
		System.out.println("\nAfter setting:");
		System.out.println(em1.showInfo());

	}

}
