package arreglo_3d;

public class Arreglo3D { // se menciona error dado que no se pude
	// heredar de una clase final

	public static void main(String[] args) {

		Integer arreglo[][][] = new Integer[3][3][3];

		arreglo[0][0][0] = 1;
		arreglo[0][0][1] = 2;
		arreglo[0][0][2] = 3;
		arreglo[0][1][0] = 4;
		arreglo[0][1][1] = 5;
		arreglo[0][1][2] = 6;
		arreglo[0][2][0] = 7;
		arreglo[0][2][1] = 8;
		arreglo[0][2][2] = 9;

		arreglo[1][0][0] = 0;
		arreglo[1][0][1] = 1;
		arreglo[1][0][2] = 2;
		arreglo[1][1][0] = 3;
		arreglo[1][1][1] = 4;
		arreglo[1][1][2] = 5;
		arreglo[1][2][0] = 6;
		arreglo[1][2][1] = 7;
		arreglo[1][2][2] = 8;

		arreglo[2][0][0] = 1;
		arreglo[2][0][1] = 2;
		arreglo[2][0][2] = 3;
		arreglo[2][1][0] = 1;
		arreglo[2][1][1] = 2;
		arreglo[2][1][2] = 3;
		arreglo[2][2][0] = 1;
		arreglo[2][2][1] = 2;
		arreglo[2][2][2] = 3;

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				for (int y = 0; y < 3; y++) {
					System.out.print("{" + arreglo[i][j][y] + "}");

				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}
