package br.com.poo.modelo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Menu {
	private ShowA showa;
	public boolean select = false;

	public void render(Graphics g) {
		g.setColor(new Color(0, 7, 90));
		g.setFont(new Font("arial", Font.BOLD, 8));
		g.drawString("Escolha o show", 50, 50);
	}

}
