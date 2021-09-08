package estaticos;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;


public class Janela extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private BufferedImage hudson;
	private BufferedImage fillype;
	private BufferedImage espera;
	private BufferedImage fim;
	private Image imagemAtual;
	private String texto = "";
	private Font font;
	
	public Janela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(900,350);
		setTitle("Zueira Never Ends");
		setLocationRelativeTo(null);
		font = new Font("Arial", 1, 18);
		try {
			hudson = ImageIO.read(new File("imagens/hudson 2.jpg"));
			fillype = ImageIO.read(new File("imagens/fillype1.jpg"));
			espera = ImageIO.read(new File("imagens/Later.jpg"));
			fim = ImageIO.read(new File("imagens/gordinho.jpg"));
		} catch(IOException e) {
			System.out.println("erro na imagem");
		}
		setVisible(true);
		setResizable(false);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setFont(font);
		g2d.clearRect(0, 0, 400, 400);
		if (imagemAtual == espera || imagemAtual == fim) {
			g2d.drawImage(imagemAtual, 0, 30, 350, 350, 0, 0, imagemAtual.getWidth(null), imagemAtual.getHeight(null), this);	
		} else {
			g2d.drawImage(imagemAtual, 0, 50, 250, 300, 0, 0, imagemAtual.getWidth(null), imagemAtual.getHeight(null), this);
			g2d.drawString(texto, 260, 100);
		}
		g2d.dispose();
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public void setImagem(int numero) {
		switch(numero) {
		case 1:
			imagemAtual = hudson;
			break;
		case 2:
			imagemAtual = fillype;
			break;
		case 3:
			imagemAtual = espera;
			repaint();
			break;
		case 4:
			imagemAtual = fim;
			repaint();
			break;
		}
	}
	
}
