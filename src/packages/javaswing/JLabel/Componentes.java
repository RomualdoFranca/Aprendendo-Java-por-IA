package packages.javaswing.JLabel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Componentes {

	public static void main(String[] args) {

		JFrame janelaBasica = new JFrame();
		janelaBasica.setTitle("Janela Básica");
		janelaBasica.setSize(600, 400);
		janelaBasica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Definir como os componentes serão organizados na sua janela
		//lembrar que esse metodo recebe como parametro um objeto do tipo FlowLayout()
		//o método deve ser aplicado a variavel de referencia da janela
//		janelaBasica.setLayout(new FlowLayout());
		janelaBasica.setLayout(new BorderLayout());
//		janelaBasica.setLayout(new GridLayout());
		
		// Instancia um objeto que exiba um texto simples na sua janela.
//		JLabel msg = new JLabel("Digite algo");
		//campo de texto onde o usuário possa digitar com o tamanho de 20 colunas
//		JTextField input = new JTextField(20);
//		JButton botao = new JButton("OK");
		
//		janelaBasica.add(msg);
//		janelaBasica.add(input);
//		janelaBasica.add(botao);
		
		
		
		
//		
		janelaBasica.setVisible(true);
	}

}
