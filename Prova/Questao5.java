package Prova;

import java.util.Scanner;

public class Questao5 {
	
	private String palavra;
	public Scanner sc = new Scanner(System.in);
	
	public Questao5() {
		System.out.print("Digite uma palavra: ");
		setPalavra(sc.nextLine());
		
	}
	
	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	
	public String getPalavra() {
		return palavra;
	}
	
	public void invertePalavra() {
		for (int i=getPalavra().length();i>0;i--) {
			System.out.print(getPalavra().charAt(i-1)); 
		}
	}
}
