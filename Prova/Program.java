package Prova;

public class Program {

	public static void main(String[] args) {
		
		Questao4 q4 = new Questao4();
		System.out.printf("Total: %.2f\n", q4.getTotal());
		System.out.printf("Media SP: %.2f\n", q4.getMediaSp());
		System.out.printf("Media RJ: %.2f\n",q4.getMediaRj());
		System.out.printf("Media ES: %.2f\n",q4.getMediaEs());
		System.out.printf("Media MG: %.2f\n",q4.getMediaMg());
		System.out.printf("Media Outros: %.2f\n",q4.getMediaOutros());
		
		
	}

}
