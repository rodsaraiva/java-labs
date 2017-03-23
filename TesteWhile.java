public class TesteWhile {

	public static void main (String[] args) {				

		int numero = 1;
		int soma = 0;

		while (numero <= 1000) {

			soma = soma + numero;
			numero = numero + 1;

		}

		System.out.println ("O valor da soma é: "soma);

	}

}
