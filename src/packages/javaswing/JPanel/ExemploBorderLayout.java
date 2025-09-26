package packages.javaswing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExemploBorderLayout {

	public static void main(String[] args) {

		JFrame janelaBasica = new JFrame();
		janelaBasica.setTitle("Janela Básica");
		janelaBasica.setSize(600, 400);
		janelaBasica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//container no topo
		JPanel painelNorte = new JPanel();
		painelNorte.setBackground(Color.RED);
		painelNorte.setPreferredSize(new Dimension(0, 100));
		
//		//container na base
//		JPanel painelSul = new JPanel();
//		painelSul.setBackground(Color.BLUE);
//		painelSul.setPreferredSize(new Dimension(0, 50));
//		
//		JPanel painelLeste = new JPanel();
//		painelLeste.setBackground(Color.GREEN);
//		painelLeste.setPreferredSize(new Dimension(100, 0));
//		
////		
//		JPanel painelOeste = new JPanel();
//        painelOeste.setBackground(Color.YELLOW);
//        painelOeste.setPreferredSize(new Dimension(100, 0));
////		
		//"sub-contêiner" do centro
		JPanel painelCentro = new JPanel();
		painelCentro.setBackground(Color.GRAY);
		
		
		janelaBasica.add(painelNorte, BorderLayout.NORTH);
//		janelaBasica.add(painelSul, BorderLayout.SOUTH);
//		janelaBasica.add(painelLeste, BorderLayout.EAST);
//		janelaBasica.add(painelOeste, BorderLayout.WEST);
		janelaBasica.add(painelCentro, BorderLayout.CENTER);
		
		
		
		janelaBasica.setVisible(true);
	}

}
