package de.gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Fenster extends Frame {

	public Fenster() {
		addWindowListener(new MyWindowListener());
		setSize(500,500);
		Button button = new Button("Beenden");
		button.addActionListener(e->this.beenden());
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				beenden();
			}
		});
		add(button);
	}
	
	public static void main(String[] args) {
		new Fenster().setVisible(true);

	}
	
	private void beenden() {
		// Ganz doll viel Fachlogik
		dispose();
	}

	class MyWindowListener extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			beenden();
		}
	}

}
