
public class Dinossauro {
	private int energia = 50;
	private int velocidade = 5;
	private int temperatura = 30;
	private int humor = 20;
	
	public int getEnergia() {
		return energia;
	}
	
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public int getTemperatura() {
		return temperatura;
	}
	
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
	public int getHumor() {
		return humor;
	}
	
	public void setHumor(int humor) {
		this.humor = humor;
	}
	
	public void pular() {
		System.out.println("Dinossauro pulando...");
		this.humor = this.humor + 5;
		this.energia = this.energia -5;
		this.velocidade = this.velocidade -5;
	}
	
	public void tomarSol() {
		System.out.println("Dinossauro tomando sol...");	
		this.velocidade = this.velocidade + 5;
		this.temperatura = this.temperatura + 2;
		this.humor = this.humor + 5;
	}
	
	public void comer() {
		System.out.println("Dinossauro comendo...");
		this.energia = this.energia + 5;
		this.velocidade = this.velocidade -3;
		this.humor = this.humor + 2;
	}
	
	public void correr() {
		System.out.println("Dinossauro correndo...");
		this.energia = this.energia -3;
		this.humor = this.humor + 5;
	}
	
	public void ficarNaSombra() {
		System.out.println("Dinossauro na sombra...");
		this.temperatura = this.temperatura -5;
		this.energia = this.energia + 5;
		this.humor = this.humor -2;
	}
	
	public void cantar() {
		System.out.println("Dinossauro cantando...");
		this.energia = this.energia -2;
		this.humor = this.humor + 3;
	}
}
