package matrices;

public class Start {

	public static void main(String[] args) {

		int filas = 5;
		int columnas = 5;

		int[][] matriz = new int[filas][columnas];

		
		int numero = 1;
		
		int x = columnas / 2;
		int y = filas / 2;

		while (numero<25 && y<filas) {

			matriz[x][y] = numero;
			numero++;
            y++;
            
            if (y==filas-1) {
            	
            	
            	y=1;
                x=columnas-2;
           	
            }
			
			
		}

		/*
		 * int perdida = 0;
		 * 
		 * for (int j = 0; j < filas; j++) {
		 * 
		 * for (int i = perdida; i < filas - perdida; i++) {
		 * 
		 * matriz[i][j] = '#'; } if (j < columnas / 2) perdida++; else perdida--;
		 * 
		 * }
		 */
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {

				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();

		}
	}

}
