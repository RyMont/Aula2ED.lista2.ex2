package view;

import javax.swing.JOptionPane;

import controller.DivisaoController;

public class Principal {
	public static void main(String[] args) {
		DivisaoController dc = new DivisaoController();
		int divisor, dividendo, resto;
		
		divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite o divisor: "));
		dividendo = Integer.parseInt(JOptionPane.showInputDialog("Digite o dividendo: "));
		resto = dc.restoDivisao(divisor, dividendo);
		System.out.print("O resto da divisão é: " +resto);
	}
}
