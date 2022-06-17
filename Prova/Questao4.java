package Prova;

public class Questao4 {
	private double sp = 67836.43;
	private double rj = 36678.66;
	private double mg = 29229.88;
	private double es = 27165.48;
	private double outros = 19849.53;
	
	public double getSp() {
		return sp;
	}
	
	public double getRj() {
		return rj;
	}
	
	public double getMg() {
		return mg;
	}
	
	public double getEs() {
		return es;
	}
	
	public double getOutros() {
		return outros;
	}
	
	public double getTotal() {
		return getSp()+getRj()+getMg()+getEs()+getOutros();
	}
	
	
	public double getMediaSp() {
		return (getSp()/getTotal())*100;
	}
	
	public double getMediaRj() {
		return (getRj()/getTotal())*100;
	}
	
	public double getMediaMg() {
		return (getMg()/getTotal())*100;
	}
	
	public double getMediaEs() {
		return (getEs()/getTotal())*100;
	}
	
	public double getMediaOutros() {
		return (getOutros()/getTotal())*100;
	}
	
	
}
