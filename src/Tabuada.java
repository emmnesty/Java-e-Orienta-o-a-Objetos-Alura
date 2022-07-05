public class Tabuada {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println("");
			System.out.println("Essa é a tabuada do: {" + i + "}");

			for (int j = 1; j <= 10; j++) {
				int tabuada = j * i;

				System.out.print(tabuada + " ");
			}
			System.out.println();

		}

	}

}
