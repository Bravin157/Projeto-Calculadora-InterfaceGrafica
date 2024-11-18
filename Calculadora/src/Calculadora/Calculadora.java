package Calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Calculadora {

	private JFrame frmCalculadora;
	private JTextField txtResultado;
	
	//Criando variaveis para realizar as operações
	double valorAtual, valorNovo;
	String operador = "";
	boolean continuarOperacao = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
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
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 434, 374);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		frmCalculadora.setLocationRelativeTo(null); //Centralizando a calculadora na tela ao executar 
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtResultado.setText(txtResultado.getText() + "6");
			}
		});
		btn6.setBounds(29, 147, 46, 48);
		frmCalculadora.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtResultado.setText(txtResultado.getText() + "3");
			}
		});
		btn3.setBounds(29, 206, 46, 48);
		frmCalculadora.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtResultado.setText(txtResultado.getText() + "0");
			}
		});
		btn0.setBounds(29, 265, 46, 48);
		frmCalculadora.getContentPane().add(btn0);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtResultado.setText(txtResultado.getText() + "7");
			}
		});
		btn7.setBounds(85, 147, 46, 48);
		frmCalculadora.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtResultado.setText(txtResultado.getText() + "4");
			}
		});
		btn4.setBounds(85, 206, 46, 48);
		frmCalculadora.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtResultado.setText(txtResultado.getText() + "1");
			}
		});
		btn1.setBounds(85, 265, 46, 48);
		frmCalculadora.getContentPane().add(btn1);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtResultado.setText(txtResultado.getText() + "8");
			}
		});
		btn8.setBounds(141, 147, 46, 48);
		frmCalculadora.getContentPane().add(btn8);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtResultado.setText(txtResultado.getText() + "2");
			}
		});
		btn2.setBounds(141, 265, 46, 48);
		frmCalculadora.getContentPane().add(btn2);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtResultado.setText(txtResultado.getText() + "5");
			}
		});
		btn5.setBounds(141, 206, 46, 48);
		frmCalculadora.getContentPane().add(btn5);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (continuarOperacao) {
					valorNovo = Double.parseDouble(txtResultado.getText());
				}
				
				//Verificando se o operador é divisivel por 0
				
				if (operador.equals("/") && valorNovo == 0 ) {
					txtResultado.setText("Erro: divisão por 0");
				}
				
				else  {
					switch (operador) {
					case "+" -> valorAtual += valorNovo;
					case "-" -> valorAtual -= valorNovo;
					case "*" -> valorAtual *= valorNovo;
					case "/" -> valorAtual /= valorNovo;
					}
					txtResultado.setText(String.valueOf(valorAtual));
				}
				continuarOperacao = false; //Assim vai resetar para que a proxima operacao comece do zero
			}
		});
		btnIgual.setBounds(309, 265, 88, 48);
		frmCalculadora.getContentPane().add(btnIgual);
		
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!continuarOperacao) {
					valorAtual = Double.parseDouble(txtResultado.getText());
				}
				else {
					valorNovo = Double.parseDouble(txtResultado.getText());
					valorAtual += valorNovo;
					txtResultado.setText(String.valueOf(valorAtual));
				}
				operador = "+";
				continuarOperacao = true;
				txtResultado.setText("");
			}
		});
		btnSoma.setBounds(197, 201, 46, 112);
		frmCalculadora.getContentPane().add(btnSoma);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtResultado.setText(txtResultado.getText() + "9");
			}
		});
		btn9.setBounds(197, 147, 46, 48);
		frmCalculadora.getContentPane().add(btn9);
		
		JButton btnMultiplicacao = new JButton("x");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!continuarOperacao) {
					valorAtual = Double.parseDouble(txtResultado.getText());
				}
				else {
					valorNovo = Double.parseDouble(txtResultado.getText());
					valorAtual *= valorNovo;
					txtResultado.setText(String.valueOf(valorAtual));
				}
				
				operador = "*";
				continuarOperacao = true;
				txtResultado.setText("");
			}
		});
		btnMultiplicacao.setBounds(253, 265, 46, 48);
		frmCalculadora.getContentPane().add(btnMultiplicacao);
		
		JButton btnSubtracao = new JButton("-");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (!continuarOperacao) {
				valorAtual = Double.parseDouble(txtResultado.getText());
			}
			else {
				valorNovo = Double.parseDouble(txtResultado.getText());
				valorAtual -= valorNovo;
				txtResultado.setText(String.valueOf(valorAtual));
			}
			
			operador = "-";
			continuarOperacao = true;
			txtResultado.setText("");
			}
		});
		btnSubtracao.setBounds(253, 147, 46, 48);
		frmCalculadora.getContentPane().add(btnSubtracao);
		
		txtResultado = new JTextField();
		txtResultado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtResultado.setBounds(46, 60, 351, 59);
		frmCalculadora.getContentPane().add(txtResultado);
		txtResultado.setColumns(10);
		
		JButton btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!continuarOperacao) {
					valorAtual = Double.parseDouble(txtResultado.getText());
				}
				else {
					valorNovo = Double.parseDouble(txtResultado.getText());
					valorAtual /= valorNovo;
					txtResultado.setText(String.valueOf(valorAtual));
				}
				
				operador = "/";
				continuarOperacao = true;
				txtResultado.setText("");
			}
		});
		btnDivisao.setBounds(253, 206, 46, 48);
		frmCalculadora.getContentPane().add(btnDivisao);
		
		JButton btnLimpar = new JButton("C");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtResultado.setText("");
			}
		});
		btnLimpar.setBounds(309, 147, 88, 48);
		frmCalculadora.getContentPane().add(btnLimpar);
		
		JButton btnPonto = new JButton(".");
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!txtResultado.getText().contains(".")) {
					txtResultado.setText(txtResultado.getText() + ".");
				}
			}
		});
		btnPonto.setBounds(309, 206, 88, 48);
		frmCalculadora.getContentPane().add(btnPonto);
	}
}
