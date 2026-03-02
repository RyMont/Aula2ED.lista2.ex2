package controller;

public class DivisaoController {
	
	public int restoDivisao(int resto, int dividendo) {
		if (resto < dividendo) {
			return resto;
		}
		return restoDivisao(resto-dividendo, dividendo);
	}
}
