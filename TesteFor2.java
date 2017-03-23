public class TesteFor2 {

	public static void main(String[] args) {

		int fatorial = 1;

		for (int n = 1; n <=10; n = n + 1) {

			if (n > 1) {
				fatorial = n * (n - 1);
			}

			System.out.println(fatorial);

		}

	}

}
