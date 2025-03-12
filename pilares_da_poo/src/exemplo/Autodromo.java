package exemplo;

public class Autodromo {
	
	public static void main(String[] args) {
		
		Carro jeep = new Carro();
		jeep.setChassi("897254");		
		//jeep.ligar();
		
		Moto z400 = new Moto();
		z400.setChassi("453452");
		//z400.ligar();
		
		Veiculo coringa = z400;
		coringa.ligar();
		
		//System.out.println("CHASSI MOTO " + z400.getChassi());
		//System.out.println("CHASSI CARRO " + jeep.getChassi());
		
	}
	
	
	
	

}
