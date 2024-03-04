package view;

import controller.SomatorioController;

public class Principal {
	public static void main(String[] args) {
		SomatorioController sm = new SomatorioController();
		
		int n = 5; 
        double resultado = sm.calcularSomatorio(n);
        System.out.println("O somatório para N = " + n + " é: " + resultado);
		
		
	}

}
