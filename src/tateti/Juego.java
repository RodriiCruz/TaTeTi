package tateti;

/**
 * 
 * @author Rodrigo Cruz <rodriikc@gmail.com>
 */
public class Juego {

	private final String JUGADOR_UNO = "X";
	private final String JUGADOR_DOS = "O";
	private final String ESPACIO_LIBRE = "-";
	public String[][] tablero;
	private Integer cantidadDeFichas;

	public Juego() {
		this.tablero = new String[3][3];
		this.cantidadDeFichas = 0;
		iniciar();
	}

	private void iniciar() {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				tablero[i][j] = ESPACIO_LIBRE;
			}
		}
	}
	
	public boolean todasFichasColocadas() {
		return cantidadDeFichas > 5;
	}

	public void colocarFicha(Integer f, Integer c, Integer numJugador) {

		if (numJugador == 1)
			tablero[f][c] = JUGADOR_UNO;
		else
			tablero[f][c] = JUGADOR_DOS;
		
		cantidadDeFichas++;
	}

	public boolean comprobarLugar(Integer f, Integer c) {
		return tablero[f][c].equals(ESPACIO_LIBRE);
	}

	private boolean comprobarVertical() {
		boolean partidaTerminada = false;

		int conteoX = 0;
		int conteoO = 0;

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				if (tablero[j][i].equals(JUGADOR_UNO))
					conteoX++;
				else if (tablero[j][i].equals(JUGADOR_DOS))
					conteoO++;
			}

			if (conteoX == 3 || conteoO == 3) {
				partidaTerminada = true;
				break;
			}

			conteoX = 0;
			conteoO = 0;
		}

		return partidaTerminada;
	}

	private boolean comprobarHorizontal() {
		boolean partidaTerminada = false;

		int conteoX = 0;
		int conteoO = 0;

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				if (tablero[i][j].equals(JUGADOR_UNO))
					conteoX++;
				else if (tablero[i][j].equals(JUGADOR_DOS))
					conteoO++;
			}

			if (conteoX == 3 || conteoO == 3) {
				partidaTerminada = true;
				break;
			}

			conteoX = 0;
			conteoO = 0;
		}

		return partidaTerminada;
	}

	private boolean comprobarDiagPrincipal() {
		String cero = tablero[0][0];
		String uno = tablero[1][1];
		String dos = tablero[2][2];

		return !cero.equals(ESPACIO_LIBRE) && cero.equals(uno) && uno.equals(dos);
	}

	private boolean comprobarDiagSecundaria() {
		String cero = tablero[0][2];
		String uno = tablero[1][1];
		String dos = tablero[2][0];

		return !cero.equals(ESPACIO_LIBRE) && cero.equals(uno) && uno.equals(dos);
	}

	public boolean comprobarTablero() {
		return comprobarVertical() || comprobarHorizontal() || comprobarDiagPrincipal() || comprobarDiagSecundaria();
	}
	
	public boolean moverFicha(Integer jugador, Integer[] posicionActual, Integer[] nuevaPosicion) {
		boolean realizado = false;
		
		if (comprobarLugar(nuevaPosicion[0], nuevaPosicion[1])) {
			
			if (jugador == 1 && tablero[posicionActual[0]][posicionActual[1]].equals(JUGADOR_UNO)) {
				tablero[nuevaPosicion[0]][nuevaPosicion[1]] = JUGADOR_UNO;
				tablero[posicionActual[0]][posicionActual[1]] = ESPACIO_LIBRE;
				realizado = true;
			}
			
			if (jugador == 2 && tablero[posicionActual[0]][posicionActual[1]].equals(JUGADOR_DOS)) {
				tablero[nuevaPosicion[0]][nuevaPosicion[1]] = JUGADOR_DOS;
				tablero[posicionActual[0]][posicionActual[1]] = ESPACIO_LIBRE;
				realizado = true;
			}
		}
		return realizado;
	}
	
	public String obtenerFicha(Integer f, Integer c) {
		return tablero[f][c];
	}
}
