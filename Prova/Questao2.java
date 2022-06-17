package Prova;

import java.util.Scanner;

public class Questao2 {
	private int qtd;
	private boolean existe = false;
	public Scanner sc = new Scanner(System.in);
	
	public Questao2() {
		System.out.print("Digite um numero: ");
		setQtd(sc.nextInt());
	}
	
	public void setExiste(boolean existe) {
		this.existe = existe;
	}
	
	public boolean getExiste() {
		return existe;
	}
	
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public int getQtd() {
		return qtd;
	}
	
	public void Fibonacci() {
		int num1 = 1, num2 = 0;
        
        System.out.print(num2 + " ");
        System.out.print(num1 + " ");
        
        for(int i = 0; i < getQtd(); i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.print(" " + num1 + " ");
            if (num1 == getQtd()) {
            	setExiste(true);
            	break;
            }
            else
            {
            	continue;
            }
        }
	}
	
	
	
	
}
