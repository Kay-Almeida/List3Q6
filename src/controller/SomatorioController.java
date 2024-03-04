package controller;

public class SomatorioController {
	public SomatorioController () {
		super(); 
	}
	
	public double calcularSomatorio(int n) {
        // Condição de parada dada quando n é igual a zero, retorna 0
        if (n == 0) {
            return 0;
        } else {
            // chamada recursiva com n-1 e soma da fração
            return calcularSomatorio(n - 1) + 1.0 / fatorial(n);
        }
    }

    // calcular o fatorial do número
	public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

}
