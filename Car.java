package carro;

public class Car {
	
	public int people;
	public int kilometer;
	public int gas;
	public boolean power; 
	
	public Car() {
		this.people = 0;
		this.kilometer = 0;
		this.gas = 0;
		this.power = true;
	}
	public void in() {
		if (this.people < 2) {
			this.people += 1;
			System.out.println("Sucess.");
		}else {
			System.out.println("Falure : Exesso de pessoas.");
		}
	}
	public void out() {
		if (this.people > 0) {
			this.people -= 1;
			System.out.println("Sucess.");
		}else {
			System.out.println("Falure : Sem pessoas a retirar.");
		}
	}
	public void run(String dist) {
		if(this.gas > 0 && this.people > 0 ) {
			int x = Integer.parseInt(dist);
			this.kilometer += x;
			this.people -= 1;
			
			x = x/10;
			this.gas -= x;
			
			System.out.println("Sucess.");
		}else if(this.gas == 0){
			System.out.println("Falure : Sem gasolina.");
		}else {
			System.out.println("Falure : Sem passageiros.");
		}
	}
	public void supply(String many) {
		if(this.gas < 10) {
			int x = Integer.parseInt(many);
			this.gas += x;
			System.out.println("Sucess.");
			if (this.gas > 10) { 
				this.gas = 10;
				System.out.println("Descartado exesso.");
			}
				
		}else {
			System.out.println("Falure : Tanque cheio.");
		}
	}
	public void turnOff() {
		this.power = false;
		System.out.println("Até a próxima.");
	}
}
