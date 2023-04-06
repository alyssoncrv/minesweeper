package br.com.group.cm;


import br.com.group.cm.modelo.Tabuleiro;
import br.com.group.cm.visao.TabuleiroConsole;

public class Aplicacao {
	public static void main(String[] args) {
			Tabuleiro tabuleiro = new Tabuleiro(6,6,3);
			new TabuleiroConsole(tabuleiro);
	}
}
