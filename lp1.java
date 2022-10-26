package lp1;

import java.awt.EventQueue;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.HashSet;

import java.awt.Font;

public class lp1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtFabricante;
	private JTextField txtModelo;
	private JTextField txtCor;
	private JTextField txtAno;
	ArrayList<lp1> x;
	HashSet<String> carro;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lp1 frame = new lp1();

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
	public lp1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x = new ArrayList<>();
		carro = new HashSet<String>();
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtFabricante = new JTextField();
		txtFabricante.setBounds(130, 79, 86, 20);
		contentPane.add(txtFabricante);
		txtFabricante.setColumns(10);
		
		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		txtModelo.setBounds(130, 110, 86, 20);
		contentPane.add(txtModelo);
		
		txtCor = new JTextField();
		txtCor.setColumns(10);
		txtCor.setBounds(130, 141, 86, 20);
		contentPane.add(txtCor);
		
		txtAno = new JTextField();
		txtAno.setColumns(10);
		txtAno.setBounds(130, 172, 86, 20);
		contentPane.add(txtAno);
		
		JButton Cadastrar = new JButton("Cadastrar");
		Cadastrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		Cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lp1 c1 = new lp1();
				c1.settxtFabricante(txtFabricante.getText());
				c1.settxtHora(txtModelo.getText());
				c1.settxtBatimento(txtCor.getText());
				c1.settxtTemperatura(txtAno.getText());
				x.add(c1);
				carro.add(c1.gettxtFabricante());
				System.out.println(x);
				

				
				try {
				PrintWriter pw = new PrintWriter(new File("C:\\Users\\DNC-PC-138\\Desktop\\Java\\teste.csv"));
				   StringBuilder sb = new StringBuilder();
				   
				   sb.append(txtFabricante.getText());
				   sb.append(";");
				   sb.append(txtModelo.getText());
				   sb.append(";");
				   sb.append(txtCor.getText());
				   sb.append(";");
				   sb.append(txtAno.getText());
				   sb.append(";");
				   pw.write(sb.toString());
				   pw.close();
				            
				        } catch (Exception e1){
				            System.out.println("Error !");
				        }
				JOptionPane.showMessageDialog(null, "Informações cadastradas com sucesso");
				System.exit(0);

			}
		});
		Cadastrar.setBounds(294, 109, 110, 23);
		contentPane.add(Cadastrar);
		
		JLabel lblNewLabel = new JLabel("Fabricante");
		lblNewLabel.setForeground(new Color(192, 192, 192));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 79, 110, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblHora = new JLabel("Modelo");
		lblHora.setForeground(new Color(192, 192, 192));
		lblHora.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHora.setBounds(10, 113, 75, 14);
		contentPane.add(lblHora);
		
		JLabel lblBatimento = new JLabel("Cor");
		lblBatimento.setForeground(new Color(192, 192, 192));
		lblBatimento.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBatimento.setBounds(10, 144, 110, 14);
		contentPane.add(lblBatimento);
		
		JLabel lblTemperatura = new JLabel("Ano");
		lblTemperatura.setForeground(new Color(192, 192, 192));
		lblTemperatura.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTemperatura.setBounds(10, 175, 124, 14);
		contentPane.add(lblTemperatura);
		
		JLabel lblSmartwatch = new JLabel("MODELO DE CARROS");
		lblSmartwatch.setForeground(Color.LIGHT_GRAY);
		lblSmartwatch.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSmartwatch.setBounds(130, 11, 194, 23);
		contentPane.add(lblSmartwatch);
	}

	protected String gettxtFabricante() {
		// TODO Auto-generated method stub
		return null;
	}

	protected void settxtTemperatura(String text) {
		// TODO Auto-generated method stub
		
	}

	protected void settxtBatimento(String text) {
		// TODO Auto-generated method stub
		
	}

	protected void settxtHora(String text) {
		// TODO Auto-generated method stub
		
	}

	protected void settxtFabricante(String text) {
		// TODO Auto-generated method stub
		
	}
}
