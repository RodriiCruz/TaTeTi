package tateti;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;

/**
 * 
 * @author Rodrigo Cruz <rodriikc@gmail.com>
 */
public class Constantes {
	
	public static final String TITULO = "TA TE TI!";
	public static final Image ICONO = Toolkit.getDefaultToolkit().getImage("img/icono.png");
	public static final String JUGADOR_UNO = "X";
	public static final String JUGADOR_DOS = "O";
	public static final String ESPACIO_LIBRE = "-";
	public static final String SALIR = "Salir";
	public static final String REINICIAR = "Reiniciar";
	public static final String FUENTE = "Tahoma";
	public static final String JUGADOR = "JUGADOR ";
	public static final ImageIcon BG_TABLERO = new ImageIcon("img/fondo.png");
	public static final ImageIcon BG_RESULTADO = new ImageIcon("img/fondo2.png");
	public static final ImageIcon IMG_X = new ImageIcon("img/X.png");
	public static final ImageIcon IMG_O = new ImageIcon("img/O.png");
	public static final String RESULTADO(Integer jugador) {
		return "GANÓ JUGADOR " + jugador + "!";
	}

}
