package tateti;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 * 
 * @author Rodrigo Cruz <rodriikc@gmail.com>
 */
public class Ventana extends JFrame {

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
	private Integer fila;
	private Integer columna;
	private Juego juego;
	private JButton botonSeleccionado;
	private JPanel panelResultado;
	private JLabel lblGanador;

	public Ventana() {
		posicionActual = new Integer[2];
		posicionNueva = new Integer[2];
		fila = 0;
		columna = 0;
		juego = new Juego();
		initComponents();
	}

	private void initComponents() {
		setIconImage(Constantes.ICONO);
		setTitle(Constantes.TITULO);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(394, 422);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		panelResultado = new JPanel();
		panelResultado.setVisible(false);
		panelResultado.setOpaque(false);
		panelResultado.setBounds(0, 0, 378, 383);
		panelResultado.setLayout(null);
		contentPane.add(panelResultado);
		
		agregarBotones();
		cargarPanelResultado();

		lblJugador = new JLabel(Constantes.JUGADOR + juego.getJugador());
		lblJugador.setEnabled(false);
		lblJugador.setForeground(Color.WHITE);
		lblJugador.setHorizontalAlignment(SwingConstants.CENTER);
		lblJugador.setFont(new Font(Constantes.FUENTE, Font.BOLD, 20));
		lblJugador.setBounds(30, 11, 318, 24);
		contentPane.add(lblJugador);

		JLabel fondo = new JLabel();
		fondo.setIcon(Constantes.BG_TABLERO);
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
	
	private void cargarPanelResultado() {
		
		JButton btnReiniciar = new JButton(Constantes.REINICIAR);
		btnReiniciar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				juego = new Juego();
				dibujarTablero();
				activarBotones(true);
				panelResultado.setVisible(false);
			}
		});
		btnReiniciar.setBounds(101, 216, 85, 23);
		panelResultado.add(btnReiniciar);
		
		JButton btnSalir = new JButton(Constantes.SALIR);
		btnSalir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(189, 216, 85, 23);
		panelResultado.add(btnSalir);
		
		lblGanador = new JLabel();
		lblGanador.setHorizontalAlignment(SwingConstants.CENTER);
		lblGanador.setFont(new Font(Constantes.FUENTE, Font.BOLD, 20));
		lblGanador.setBounds(0, 175, 378, 30);
		panelResultado.add(lblGanador);
		
		JLabel fondo = new JLabel();
		fondo.setIcon(Constantes.BG_RESULTADO);
		fondo.setBounds(0, 90, 378, 216);
		panelResultado.add(fondo);
	}

	private boolean colocarFicha() {
		boolean accionRealizada = false;

		if (juego.comprobarLugar(fila, columna)) {
			juego.colocarFicha(fila, columna);
			accionRealizada = true;
		}
		return accionRealizada;
	}

	private boolean moverFicha(JButton boton) {
		boolean accionRealizada = false;

		posicionNueva[0] = fila;
		posicionNueva[1] = columna;

		if (botonSeleccionado != null && posicionActual != posicionNueva) {
			accionRealizada = juego.moverFicha(posicionActual, posicionNueva);
			botonSeleccionado.setBorderPainted(false);
			botonSeleccionado = null;
		} else {
			if (juego.obtenerFicha(fila, columna).equals(Constantes.JUGADOR_UNO) && juego.getJugador() == 1
					|| juego.obtenerFicha(fila, columna).equals(Constantes.JUGADOR_DOS) && juego.getJugador() == 2) {
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
		int jugadorActual = juego.getJugador();

		if (!juego.todasFichasColocadas())
			accionRealizada = colocarFicha();
		else
			accionRealizada = moverFicha(boton);

		dibujarTablero();

		if (accionRealizada) {
			if (juego.getJugador() == 1)
				juego.setJugador(2);
			else
				juego.setJugador(1);
		}

		if (juego.comprobarTablero()) {
			lblGanador.setText(Constantes.RESULTADO(jugadorActual));
			panelResultado.setVisible(true);
			activarBotones(false);
		} else {
			lblJugador.setText(Constantes.JUGADOR + juego.getJugador());
		}
	}

	private void colocarImagen(String ficha, JButton boton) {
		switch (ficha) {
		case Constantes.JUGADOR_UNO:
			boton.setIcon(Constantes.IMG_X);
			break;
		case Constantes.JUGADOR_DOS:
			boton.setIcon(Constantes.IMG_O);
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
					colocarImagen(juego.obtenerFicha(i, j), btnUno);
					break;
				case 2:
					colocarImagen(juego.obtenerFicha(i, j), btnDos);
					break;
				case 3:
					colocarImagen(juego.obtenerFicha(i, j), btnTres);
					break;
				case 4:
					colocarImagen(juego.obtenerFicha(i, j), btnCuatro);
					break;
				case 5:
					colocarImagen(juego.obtenerFicha(i, j), btnCinco);
					break;
				case 6:
					colocarImagen(juego.obtenerFicha(i, j), btnSeis);
					break;
				case 7:
					colocarImagen(juego.obtenerFicha(i, j), btnSiete);
					break;
				case 8:
					colocarImagen(juego.obtenerFicha(i, j), btnOcho);
					break;
				case 9:
					colocarImagen(juego.obtenerFicha(i, j), btnNueve);
					break;
				}
				boton++;
			}
		}
	}

	private void activarBotones(boolean b) {
		this.btnUno.setEnabled(b);
		this.btnDos.setEnabled(b);
		this.btnTres.setEnabled(b);
		this.btnCuatro.setEnabled(b);
		this.btnCinco.setEnabled(b);
		this.btnSeis.setEnabled(b);
		this.btnSiete.setEnabled(b);
		this.btnOcho.setEnabled(b);
		this.btnNueve.setEnabled(b);
	}
}
