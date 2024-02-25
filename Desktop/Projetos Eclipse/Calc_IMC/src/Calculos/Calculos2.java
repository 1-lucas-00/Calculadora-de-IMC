package Calculos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculos2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtPeso;
	private JTextField txtAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculos2 frame = new Calculos2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculos2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 852);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CALCULADORA DE IMC");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel.setBounds(127, 11, 236, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1.setBounds(2, 101, 78, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Peso");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(186, 101, 78, 21);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Altura");
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(374, 101, 78, 21);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Faixa de peso");
		lblNewLabel_1_3.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(186, 399, 121, 21);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNormal = new JLabel("");
		lblNormal.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNormal.setBounds(10, 548, 531, 21);
		contentPane.add(lblNormal);
		
		JLabel lblSobrepeso = new JLabel("");
		lblSobrepeso.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblSobrepeso.setBounds(10, 596, 531, 21);
		contentPane.add(lblSobrepeso);
		
		JLabel lblObesidade1 = new JLabel("");
		lblObesidade1.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblObesidade1.setBounds(10, 654, 488, 21);
		contentPane.add(lblObesidade1);
		
		JLabel lblObesidade2 = new JLabel("");
		lblObesidade2.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblObesidade2.setBounds(10, 710, 460, 21);
		contentPane.add(lblObesidade2);
		
		JLabel lblObesidade3 = new JLabel("");
		lblObesidade3.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblObesidade3.setBounds(10, 768, 460, 21);
		contentPane.add(lblObesidade3);
		
		txtNome = new JTextField();
		txtNome.setBounds(2, 133, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(186, 133, 86, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(374, 133, 86, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		JLabel lblMagreza = new JLabel("");
		lblMagreza.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblMagreza.setBounds(10, 501, 460, 21);
		contentPane.add(lblMagreza);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String nome = txtNome.getText();
				double peso = Double.parseDouble((txtPeso.getText()));
				double altura = Double.parseDouble(txtAltura.getText());
				double resultado = peso/(altura*altura);
				
					if(resultado<=18.5) 
					{lblMagreza.setText("Olá "+nome+ " você está com "+" Magreza");} 
				else if(resultado<=24.9) 
					{lblNormal.setText("Olá "+nome+ " você está com o peso "+" Normal");}
				if(resultado>=25) 
					{lblSobrepeso.setText("Olá "+nome+ " você está com "+" Sobre peso"+", " +" cuidado!");} 
				else if(resultado>=29.9) 
					{lblObesidade1.setText("Olá "+nome+ " você está com "+" Obesidade "+" procure um nutricionista urgente ");}
				if(resultado>=30) 
					{lblObesidade2.setText("Olá "+nome+ " você está com "+" Obesidade2 "+" procure um nutricionista urgente ");} 
				else if(resultado>=40) 
					{lblObesidade3.setText("Olá "+nome+ " você está com "+" Obesidade3 "+" procure um nutricionista urgente" );}
				
				
				
			
			
			
			
			
			}
		});
		btnCalcular.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnCalcular.setBackground(Color.CYAN);
		btnCalcular.setBounds(173, 374, 121, 23);
		contentPane.add(btnCalcular);
	}
}
