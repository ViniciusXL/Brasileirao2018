package br.com.vinicius.brasileirao;

import java.awt.EventQueue;

import br.com.vinicius.brasileirao.view.TabelaBrasileirao;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			TabelaBrasileirao br = new TabelaBrasileirao();
			br.getFrame().setVisible(true);
			br.getFrame().setSize(605, 490);
		});
	}
}
