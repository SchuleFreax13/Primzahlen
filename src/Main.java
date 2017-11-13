import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main_(String[] args) {
		System.out.println(new BigInteger(new Scanner(System.in).nextLine()).isProbablePrime(1));
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Max: ");
		long max = Long.valueOf(scanner.nextLine());

		long[] zahlen = new long[10000000];
		long start = System.currentTimeMillis();
		int counter = 0;

		zahlen[counter++] = 2;
		
		for (int i = 3; i < max; i += 2) {
			test: {
				double sqrt = Math.sqrt(i);
				for (int j = 0; j < counter && sqrt >= zahlen[j]; j++) {
					if (i % zahlen[j] == 0) {
						break test;
					}
				}
				zahlen[counter++] = i;
				//System.out.println(i);
			}
		}

		System.out.println("Benötigte Zeit: " + (System.currentTimeMillis() - start) + "ms");
	}

}
