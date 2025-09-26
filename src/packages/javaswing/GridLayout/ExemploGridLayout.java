package packages.javaswing.GridLayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ExemploGridLayout {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setTitle("ExemploGridLayout ");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 500);
		
		//Define o layout da janela como GridLayout, com 2 linhas e 3 colunas
		//parametros do construtor do GridLayout (linhas, colunas, hgap, vgap)
		//hgap: o espaçamento horizontal (horizontal gap) entre as colunas, em pixels.
        //vgap: o espaçamento vertical (vertical gap) entre as linhas, em pixels.
		
		frame.setLayout(new GridLayout(2, 3, 20, 20));
		
		// Adiciona 6 botões à janela. 
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
	}

}
