package Entidade;

import java.util.Scanner;
import Entidade.Forma;
import Entidade.Triangulo;
import Entidade.Retangulo;

public class Main {
    public static void main(String[] args) {
    	Scanner scn = new Scanner(System.in);
    	
    	System.out.println("Escolha uma opção: ");
    	int opcao = scn.nextInt();
    	
    	if (opcao == 1) {
    		System.out.println("Digite a base: ");
    		double base = scn.nextDouble();
    		System.out.println("Digite a altura: ");
    		double altura = scn.nextDouble();
    		Triangulo T = new Triangulo(altura, base);
    		
    		System.out.println("Area: " + T.calcularArea(base, altura));
    	}
    	else if (opcao == 2) {
    		System.out.println("Digite a largura: ");
    		double largura = scn.nextDouble();
    		System.out.println("Digite a altura: ");
    		double altura = scn.nextDouble();
    		Retangulo R = new Retangulo(altura, largura);
    		
    		System.out.println("Area: " + R.calcularArea(largura, altura));
    	}
    }
}
