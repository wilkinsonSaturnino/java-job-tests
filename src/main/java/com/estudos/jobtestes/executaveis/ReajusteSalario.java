package com.estudos.jobtestes.executaveis;
import java.util.Scanner;

public class ReajusteSalario {

	public static void main(String args[]) {
		
		double salarioAtual = 0;
		double reajustePorcentagem = 0;
		double salarioReajustado;
		float porcentagem;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Informe o salário atual: ");
			salarioAtual = input.nextDouble();
			System.out.println("Informe a porcentagem de reajuste: ");
			reajustePorcentagem = input.nextDouble();
		}
		
		porcentagem = (float) ((reajustePorcentagem/100) * (salarioAtual));
		salarioReajustado = salarioAtual + porcentagem;
		
		if ((salarioReajustado % 2) == 0)
			salarioReajustado++;
		
		System.out.println("Salário reajustado: " + salarioReajustado);
		
	}
}
