package calculadora1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import java.awt.Color;

public class calculadora {

	private JFrame frmCalculadora;
	private JTextField txtPantalla;
	
	double numero1;
	double numero2;
	double resultado;
	String operacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora window = new calculadora();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculadora() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.getContentPane().setBackground(new Color(135, 206, 235));
		frmCalculadora.setBackground(new Color(124, 252, 0));
		frmCalculadora.setForeground(new Color(127, 255, 0));
		frmCalculadora.getContentPane().setForeground(new Color(127, 255, 0));
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 244, 328);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		txtPantalla = new JTextField();
		txtPantalla.setBounds(0, 11, 218, 35);
		frmCalculadora.getContentPane().add(txtPantalla);
		txtPantalla.setColumns(10);
		
		JButton btnLimpiar = new JButton("C");
		btnLimpiar.setForeground(new Color(153, 50, 204));
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText("");
			}
		});
		btnLimpiar.setBounds(10, 51, 47, 35);
		frmCalculadora.getContentPane().add(btnLimpiar);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngreseNumero = txtPantalla.getText() + btn1.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn1.setBounds(10, 97, 47, 35);
		frmCalculadora.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngreseNumero = txtPantalla.getText() + btn2.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn2.setBounds(67, 97, 47, 35);
		frmCalculadora.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngreseNumero = txtPantalla.getText() + btn3.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn3.setBounds(124, 97, 47, 35);
		frmCalculadora.getContentPane().add(btn3);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngreseNumero = txtPantalla.getText() + btn5.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn5.setBounds(67, 143, 47, 35);
		frmCalculadora.getContentPane().add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngreseNumero = txtPantalla.getText() + btn4.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn4.setBounds(10, 143, 47, 35);
		frmCalculadora.getContentPane().add(btn4);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngreseNumero = txtPantalla.getText() + btn6.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn6.setBounds(124, 143, 47, 35);
		frmCalculadora.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngreseNumero = txtPantalla.getText() + btn7.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn7.setBounds(10, 188, 47, 35);
		frmCalculadora.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngreseNumero = txtPantalla.getText() + btn8.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn8.setBounds(67, 189, 47, 35);
		frmCalculadora.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngreseNumero = txtPantalla.getText() + btn9.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn9.setBounds(124, 189, 47, 35);
		frmCalculadora.getContentPane().add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngreseNumero = txtPantalla.getText() + btn0.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn0.setBounds(67, 226, 47, 35);
		frmCalculadora.getContentPane().add(btn0);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String seleccionar;
				numero2 = Double.parseDouble(txtPantalla.getText());
				
				if(operacion =="+") {
					resultado = numero1 + numero2;
					seleccionar = String.format("%.0f",resultado);
					txtPantalla.setText(seleccionar);
					
				
				}
				else if(operacion =="-") {
					resultado = numero1 - numero2;
					seleccionar = String.format("%.0f",resultado);
					txtPantalla.setText(seleccionar);
					
				
				}
				else if(operacion =="*") {
					resultado = numero1 * numero2;
					seleccionar = String.format("%.0f",resultado);
					txtPantalla.setText(seleccionar);
					
				
				}
				else if(operacion =="/") {
					resultado = numero1 / numero2;
					seleccionar = String.format("%.2f",resultado);
					txtPantalla.setText(seleccionar);
					
				
				}
			}
		});
		btnIgual.setForeground(new Color(153, 50, 204));
		btnIgual.setBounds(124, 226, 47, 35);
		frmCalculadora.getContentPane().add(btnIgual);
		
		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");;
				operacion ="+";
			}
		});
		btnSuma.setForeground(new Color(153, 50, 204));
		btnSuma.setBounds(181, 97, 47, 35);
		frmCalculadora.getContentPane().add(btnSuma);
		
		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");;
				operacion ="-";
			}
		});
		btnResta.setForeground(new Color(153, 50, 204));
		btnResta.setBounds(181, 143, 47, 35);
		frmCalculadora.getContentPane().add(btnResta);
		
		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");;
				operacion ="*";
				
			}
		});
		btnMulti.setForeground(new Color(153, 50, 204));
		btnMulti.setBounds(181, 188, 47, 35);
		frmCalculadora.getContentPane().add(btnMulti);
		
		JButton btnDivi = new JButton("/");
		btnDivi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");;
				operacion ="/";
			}
		});
		btnDivi.setForeground(new Color(153, 50, 204));
		btnDivi.setBounds(181, 226, 47, 35);
		frmCalculadora.getContentPane().add(btnDivi);
		
		JButton btnHolaMundo = new JButton("Hola mundo");
		btnHolaMundo.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        txtPantalla.setText("Hola mundo");
		    }
		});
		btnHolaMundo.setBounds(10, 226, 47, 35);
		frmCalculadora.getContentPane().add(btnHolaMundo);

	}
}
