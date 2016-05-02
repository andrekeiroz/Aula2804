import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TestVal {

	private JFrame frame;
	Valores val = new Valores();
	JLabel lblLista;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestVal window = new TestVal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestVal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Inserir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(val.ins(Integer.parseInt(new JOptionPane().showInputDialog("Insira um número na lista:")))){
					new JOptionPane().showMessageDialog(null, "Número incluido com sucesso.");
				}else{
					new JOptionPane().showMessageDialog(null, "Lista cheia, não é possivel adicionar mais números.");
				}
				lblLista.setText("Lista: " + val.getLista().toString());
			}
		});
		btnNewButton.setBounds(55, 89, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(val.size() > 0){
					try{
						val.del(Integer.parseInt(new JOptionPane().showInputDialog("Remover Item da Posição:")) - 1);
						new JOptionPane().showMessageDialog(frame, "Número removido com sucesso.");
					}catch(IndexOutOfBoundsException e){
						new JOptionPane().showMessageDialog(frame, "Valor fora do limite");
					}
				}else{
					new JOptionPane().showMessageDialog(frame, "A lista está vazia.");
				}
				
				lblLista.setText("Lista: " + val.getLista().toString());
			}
		});
		btnNewButton_1.setBounds(164, 89, 97, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		lblLista = new JLabel("Lista: " + val.getLista().toString());
		lblLista.setBounds(12, 13, 408, 16);
		frame.getContentPane().add(lblLista);
		
		JButton btnNewButton_2 = new JButton("Tamanho");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new JOptionPane().showMessageDialog(frame, "Tamanho da lista: " + val.size() + " elementos");
			}
		});
		btnNewButton_2.setBounds(273, 89, 97, 25);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnMdia = new JButton("M\u00E9dia");
		btnMdia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new JOptionPane().showMessageDialog(frame, "Média do elementos: " + val.mean());
			}
		});
		btnMdia.setBounds(55, 127, 97, 25);
		frame.getContentPane().add(btnMdia);
		
		JButton btnMaior = new JButton("Maior");
		btnMaior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(val.greater() >= 0){
					new JOptionPane().showMessageDialog(frame, "Maior elemento da lista: " + val.greater());
				}else{
					new JOptionPane().showMessageDialog(frame, "A lista está vazia");
				}
			}
		});
		btnMaior.setBounds(164, 127, 97, 25);
		frame.getContentPane().add(btnMaior);
		
		JButton btnMenor = new JButton("Menor");
		btnMenor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(val.greater() >= 0){
					new JOptionPane().showMessageDialog(frame, "Menor elemento da lista: " + val.lower());
				}else{
					new JOptionPane().showMessageDialog(frame, "A lista está vazia");
				}
				
			}
		});
		btnMenor.setBounds(273, 127, 97, 25);
		frame.getContentPane().add(btnMenor);
	}
}
