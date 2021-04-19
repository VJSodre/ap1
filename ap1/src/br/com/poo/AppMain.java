package br.com.poo;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import br.com.poo.modelo.Ingresso;
import br.com.poo.modelo.Menu;
import br.com.poo.modelo.ShowA;

public class AppMain extends Canvas implements Runnable, KeyListener {
	private static final long serialVersionUID = 1L;
	public static int width = 140;
	public static int height = 100;
	public static int scale = 3;
	public static boolean ssa = true, ssb, ssc, ssd, sse;
	private static BufferedImage image;
	public Menu menu;

	public AppMain() {
		this.setPreferredSize(new Dimension(width * scale, height * scale));
		this.addKeyListener(this);
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
	}

	Menu me = new Menu();

	public void render() {
		Graphics g = image.getGraphics();
		me.render(g);
	}

	public static void main(String[] args) {
		AppMain app = new AppMain();
		JFrame frame = new JFrame("Venda de Ingressos");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(app);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);

		Ingresso iA = new Ingresso(10, 100);
		Ingresso iB = new Ingresso(20, 150);
		ShowA sa = new ShowA(iA);

		String select = JOptionPane.showInputDialog("Venda de ingressos \nEscolha o seu show: ");
		
			if (select == "a") {
				JOptionPane.showMessageDialog(null, iA.impressao());
				JOptionPane.showMessageDialog(frame, iA);
			}
			if (ssa = true) {
				iA.qnt--;
			}
		}
	
	public void keyTyped(KeyEvent e) {

	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_1) {
			System.out.println("Você Selecionou o Show do Killswitch Engage");
			ssa = true;
		}

	}

	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_1) {

		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {

		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {

		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {

		}

	}

	@Override
	public void run() {

	}

}
