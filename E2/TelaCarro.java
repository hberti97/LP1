package carros;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.awt.event.ActionEvent;

public class TelaCarro extends JFrame {

	private JPanel contentPane;
	private JTextField tfCor;
	private JTextField tfModelo;
	private JTextField tfAno;
	private JTextField tfFabricante;
	HashSet<String> Bicicleta;
	ArrayList <TelaCarro> x;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCarro frame = new TelaCarro();
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
	public TelaCarro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		x = new ArrayList<>();
		Bicicleta = new HashSet<String>();
		
		JPanel jPanel1 = new JPanel();
		jPanel1.setBackground(Color.WHITE);
		contentPane.add(jPanel1, BorderLayout.CENTER);
		
		JLabel Cor = new JLabel();
		Cor.setText("Cor");
		Cor.setFont(new Font("Arial", Font.BOLD, 14));
		
		tfCor = new JTextField();
		tfCor.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel modelo = new JLabel();
		modelo.setText("Modelo");
		modelo.setFont(new Font("Arial", Font.BOLD, 14));
		
		tfModelo = new JTextField();
		tfModelo.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel Marca = new JLabel();
		Marca.setText("Ano");
		Marca.setFont(new Font("Arial", Font.BOLD, 14));
		
		tfAno = new JTextField();
		tfAno.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel modelo1 = new JLabel();
		modelo1.setText("Fabricante");
		modelo1.setFont(new Font("Arial", Font.BOLD, 14));
		
		tfFabricante = new JTextField();
		tfFabricante.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JButton Cadastrar1 = new JButton();
		Cadastrar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCarro c1 = new TelaCarro();
	            c1.setFabricante(tfFabricante.getText());
	            c1.setModelo(tfModelo.getText());
	            c1.setAno(tfAno.getText());
	            c1.setCor(tfCor.getText());
	            x.add(c1);
	            
	            for(TelaCarro item: x) {
	            	System.out.println("Lista");
	    			System.out.printf("%s\n", item.toString());
	    		}
	       
	            try{
	            		
	               FileWriter fw = new FileWriter("C:\\Users\\Naiara\\Desktop\\Nova pasta\\carro.csv", true);
	               BufferedWriter bw = new BufferedWriter(fw);
	               PrintWriter out = new PrintWriter(bw);
				   StringBuilder sb = new StringBuilder();
				   
				   sb.append(tfFabricante.getText() + ";");
				   sb.append(tfModelo.getText() + ";");
				   sb.append(tfAno.getText() + ";");
				   sb.append(tfCor.getText() + ";");
				   bw.write(sb.toString() + "\n");
				   bw.close();
	            
	        } catch (Exception e1){
	            System.out.println("Erro !");
	        }
	           
			}
		});
		Cadastrar1.setText("Cadastrar");
		Cadastrar1.setFont(new Font("Arial", Font.BOLD, 14));
		Cadastrar1.setBackground(new Color(204, 204, 255));
		
		JButton Cadastrar = new JButton();
		Cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 System.exit(0);
			}
		});
		Cadastrar.setText("Sair");
		Cadastrar.setFont(new Font("Arial", Font.BOLD, 14));
		Cadastrar.setBackground(new Color(204, 204, 255));
		
		JLabel jLabel2 = new JLabel();
		jLabel2.setText("Bicicleta");
		jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel2.setFont(new Font("Arial", Font.BOLD, 24));
		
		JButton Dicionario = new JButton();
		Dicionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try (BufferedReader br = new BufferedReader(new FileReader("C:\\\\Users\\\\Naiara\\\\Desktop\\\\Nova pasta\\\\carro.csv"))){
					String line = br.readLine();
					Map<String, String> map = new HashMap<>();
					while (line != null) {
						String [] fields = line.split(";");
						
						String Fabricantec = "Fabricante: ";
						String Fabricante = fields[0];
						String Modeloc = "Modelo: ";
						String Modelo = fields[1];
						String marcac = "Marca: ";
						String marca = fields[2];
						String corc = "Cor: ";
						String cor = fields[3];

						
						map.put(Fabricantec, Fabricante);
						map.put(Modeloc, Modelo);
						map.put(marcac, marca);
						map.put(corc, cor);
					
						line = br.readLine();
						
					}
					System.out.println("Dicionario");
					for (String key: map.keySet()) {
						
						System.out.println(key + map.get(key));
						JOptionPane.showMessageDialog(null, key + map.get(key));
						
					}
				} catch (Exception e2) {
					System.out.println("Error: " + e2.getMessage());
					// TODO: handle exception
				}
				
			}
		});
		Dicionario.setText("Dicion\u00E1rio");
		Dicionario.setFont(new Font("Arial", Font.BOLD, 14));
		Dicionario.setBackground(new Color(204, 204, 255));
		GroupLayout gl_jPanel1 = new GroupLayout(jPanel1);
		gl_jPanel1.setHorizontalGroup(
			gl_jPanel1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jPanel1.createSequentialGroup()
					.addGap(37)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jPanel1.createSequentialGroup()
							.addComponent(Cadastrar1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(Dicionario, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Cadastrar, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_jPanel1.createSequentialGroup()
							.addGroup(gl_jPanel1.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_jPanel1.createSequentialGroup()
									.addGroup(gl_jPanel1.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(Marca)
										.addComponent(modelo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(Cor))
									.addGap(18))
								.addGroup(gl_jPanel1.createSequentialGroup()
									.addComponent(modelo1, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_jPanel1.createParallelGroup(Alignment.TRAILING)
								.addComponent(tfCor, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfFabricante, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfAno, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfModelo, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(143, Short.MAX_VALUE))))
				.addComponent(jLabel2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
		);
		gl_jPanel1.setVerticalGroup(
			gl_jPanel1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jPanel1.createSequentialGroup()
					.addGap(10)
					.addComponent(jLabel2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfFabricante, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(modelo1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(modelo, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfModelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfAno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(Marca, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfCor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(Cor, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(Cadastrar1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(Dicionario, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(Cadastrar, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		jPanel1.setLayout(gl_jPanel1);
	}

	protected void setCor(String text) {
		// TODO Auto-generated method stub
		
	}

	protected void setAno(String text) {
		// TODO Auto-generated method stub
		
	}

	protected void setModelo(String text) {
		// TODO Auto-generated method stub
		
	}

	protected void setFabricante(String text) {
		// TODO Auto-generated method stub
		
	}
}
