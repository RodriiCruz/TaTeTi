package tateti;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 * 
 * @author Rodrigo Cruz <rodriikc@gmail.com>
 */
public class Ventana extends JFrame {

	private final ImageIcon IMG_X;
	private final ImageIcon IMG_O;
	private JPanel contentPane;
	private JButton btnUno;
	private JButton btnDos;
	private JButton btnTres;
	private JButton btnCuatro;
	private JButton btnCinco;
	private JButton btnSeis;
	private JButton btnSiete;
	private JButton btnOcho;
	private JButton btnNueve;
	private JLabel lblJugador;
	private Integer[] posicionActual;
	private Integer[] posicionNueva;
	private Integer jugador;
	private Integer fila;
	private Integer columna;
	private Juego juego;
	private JButton botonSeleccionado;

	public Ventana() {
		IMG_X = new ImageIcon("img/X.png");
		IMG_O = new ImageIcon("img/O.png");
		setIconImage(Toolkit.getDefaultToolkit().getImage("img/X.png"));
		posicionActual = new Integer[2];
		posicionNueva = new Integer[2];
		jugador = 1;
		fila = 0;
		columna = 0;
		juego = new Juego();
		initComponents();
	}

	private void initComponents() {
		setTitle("TA TE TI!");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(394, 422);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		agregarBotones();

		lblJugador = new JLabel("JUGADOR 1");
		lblJugador.setEnabled(false);
		lblJugador.setForeground(Color.WHITE);
		lblJugador.setHorizontalAlignment(SwingConstants.CENTER);
		lblJugador.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblJugador.setBounds(30, 11, 318, 24);
		contentPane.add(lblJugador);

		JLabel fondo = new JLabel();
		fondo.setIcon(new ImageIcon("img/fondo.png"));
		fondo.setBounds(0, 0, 378, 383);
		contentPane.add(fondo);
	}

	private void agregarBotones() {
		btnUno = new JButton();
		btnUno.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnUno.setBorderPainted(false);
		btnUno.setContentAreaFilled(false);
		btnUno.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fila = 0;
				columna = 0;
				colocarMoverFicha(btnUno);
			}
		});
		btnUno.setBounds(30, 46, 100, 100);
		contentPane.add(btnUno);

		btnDos = new JButton();
		btnDos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDos.setBorderPainted(false);
		btnDos.setContentAreaFilled(false);
		btnDos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fila = 0;
				columna = 1;
				colocarMoverFicha(btnDos);
			}
		});
		btnDos.setBounds(138, 46, 100, 100);
		contentPane.add(btnDos);

		btnTres = new JButton();
		btnTres.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTres.setContentAreaFilled(false);
		btnTres.setBorderPainted(false);
		btnTres.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fila = 0;
				columna = 2;
				colocarMoverFicha(btnTres);
			}
		});
		btnTres.setBounds(248, 46, 100, 100);
		contentPane.add(btnTres);

		btnCuatro = new JButton();
		btnCuatro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCuatro.setBorderPainted(false);
		btnCuatro.setContentAreaFilled(false);
		btnCuatro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fila = 1;
				columna = 0;
				colocarMoverFicha(btnCuatro);
			}
		});
		btnCuatro.setBounds(30, 157, 100, 100);
		contentPane.add(btnCuatro);

		btnCinco = new JButton();
		btnCinco.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCinco.setContentAreaFilled(false);
		btnCinco.setBorderPainted(false);
		btnCinco.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fila = 1;
				columna = 1;
				colocarMoverFicha(btnCinco);
			}
		});
		btnCinco.setBounds(138, 157, 100, 100);
		contentPane.add(btnCinco);

		btnSeis = new JButton();
		btnSeis.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSeis.setBorderPainted(false);
		btnSeis.setContentAreaFilled(false);
		btnSeis.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fila = 1;
				columna = 2;
				colocarMoverFicha(btnSeis);
			}
		});
		btnSeis.setBounds(248, 157, 100, 100);
		contentPane.add(btnSeis);

		btnSiete = new JButton();
		btnSiete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSiete.setContentAreaFilled(false);
		btnSiete.setBorderPainted(false);
		btnSiete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fila = 2;
				columna = 0;
				colocarMoverFicha(btnSiete);
			}
		});
		btnSiete.setBounds(30, 268, 100, 100);
		contentPane.add(btnSiete);

		btnOcho = new JButton();
		btnOcho.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOcho.setContentAreaFilled(false);
		btnOcho.setBorderPainted(false);
		btnOcho.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fila = 2;
				columna = 1;
				colocarMoverFicha(btnOcho);
			}
		});
		btnOcho.setBounds(138, 268, 100, 100);
		contentPane.add(btnOcho);

		btnNueve = new JButton();
		btnNueve.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNueve.setContentAreaFilled(false);
		btnNueve.setBorderPainted(false);
		btnNueve.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fila = 2;
				columna = 2;
				colocarMoverFicha(btnNueve);
			}
		});
		btnNueve.setBounds(248, 268, 100, 100);
		contentPane.add(btnNueve);
	}

	private boolean colocarFicha() {
		boolean accionRealizada = false;

		if (juego.comprobarLugar(fila, columna)) {
			juego.colocarFicha(fila, columna, jugador);
			accionRealizada = true;
		}
		return accionRealizada;
	}

	private boolean moverFicha(JButton boton) {
		boolean accionRealizada = false;

		posicionNueva[0] = fila;
		posicionNueva[1] = columna;

		if (botonSeleccionado != null && posicionActual != posicionNueva) {
			accionRealizada = juego.moverFicha(jugador, posicionActual, posicionNueva);
			botonSeleccionado.setBorderPainted(false);
			botonSeleccionado = null;
		} else {
			if (juego.obtenerFicha(fila, columna).equals("X") && jugador == 1
					|| juego.obtenerFicha(fila, columna).equals("O") && jugador == 2) {
				botonSeleccionado = boton;
				botonSeleccionado.setBorderPainted(true);
			}
			posicionActual[0] = fila;
			posicionActual[1] = columna;
		}

		return accionRealizada;
	}

	private void colocarMoverFicha(JButton boton) {
		boolean accionRealizada = false;
		int jugadorActual = jugador;

		if (!juego.todasFichasColocadas())
			accionRealizada = colocarFicha();
		else
			accionRealizada = moverFicha(boton);

		dibujarTablero();

		if (accionRealizada) {
			if (jugador == 1)
				jugador = 2;
			else
				jugador = 1;
		}

		if (juego.comprobarTablero()) {
			JOptionPane.showMessageDialog(null, "GANÓ JUGADOR " + jugadorActual);
			reiniciarJuego();
		}

		lblJugador.setText("JUGADOR " + jugador);
	}

	private void colocarImagen(String ficha, JButton boton) {
		switch (ficha) {
		case "X":
			boton.setIcon(IMG_X);
			break;
		case "O":
			boton.setIcon(IMG_O);
			break;
		default:
			boton.setIcon(null);
			break;
		}
	}

	private void dibujarTablero() {
		int boton = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				switch (boton) {
				case 1:
					colocarImagen(juego.tablero[i][j], btnUno);
					break;
				case 2:
					colocarImagen(juego.tablero[i][j], btnDos);
					break;
				case 3:
					colocarImagen(juego.tablero[i][j], btnTres);
					break;
				case 4:
					colocarImagen(juego.tablero[i][j], btnCuatro);
					break;
				case 5:
					colocarImagen(juego.tablero[i][j], btnCinco);
					break;
				case 6:
					colocarImagen(juego.tablero[i][j], btnSeis);
					break;
				case 7:
					colocarImagen(juego.tablero[i][j], btnSiete);
					break;
				case 8:
					colocarImagen(juego.tablero[i][j], btnOcho);
					break;
				case 9:
					colocarImagen(juego.tablero[i][j], btnNueve);
					break;
				}
				boton++;
			}
		}
	}

	private void reiniciarJuego() {
		this.juego = new Juego();
		this.jugador = 1;
		this.btnUno.setIcon(null);
		this.btnDos.setIcon(null);
		this.btnTres.setIcon(null);
		this.btnCuatro.setIcon(null);
		this.btnCinco.setIcon(null);
		this.btnSeis.setIcon(null);
		this.btnSiete.setIcon(null);
		this.btnOcho.setIcon(null);
		this.btnNueve.setIcon(null);
	}
}
