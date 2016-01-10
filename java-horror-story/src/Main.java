import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		Random random = new Random();
		boolean prob = random.nextBoolean();
		if (prob) {
			System.out.println("AAAAAAAAAGH THE HORROR!");
		} else {
			System.out.println("WHAT HAVE WE DONE!");
		}
	}

}
