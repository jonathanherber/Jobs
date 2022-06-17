package Prova;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("-------------------------------");
		System.out.println("Questao 2:");
		Questao2 q2 = new Questao2();
		System.out.print("Sequencia de Fibonacci: " );
		q2.Fibonacci();
		System.out.println();
		if (q2.getExiste() == true) {
			System.out.println("Numero informado esta presente na sequencia");
		}
		else 
		{
			System.out.println("Numero informado nao esta presente na sequencia");
		}
		
		System.out.println("-------------------------------");
	
		System.out.println("Questao 4:");
		Questao4 q4 = new Questao4();
		System.out.printf("Total: %.2f\n", q4.getTotal());
		System.out.printf("Media SP: %.2f\n", q4.getMediaSp());
		System.out.printf("Media RJ: %.2f\n",q4.getMediaRj());
		System.out.printf("Media ES: %.2f\n",q4.getMediaEs());
		System.out.printf("Media MG: %.2f\n",q4.getMediaMg());
		System.out.printf("Media Outros: %.2f\n",q4.getMediaOutros());
		
		System.out.println("-------------------------------");
		
		System.out.println("Questao 5:");
		Questao5 q5 = new Questao5();
		System.out.println(q5.getPalavra());
		q5.invertePalavra();
		System.out.println();
		System.out.println("-------------------------------");
	}

}
