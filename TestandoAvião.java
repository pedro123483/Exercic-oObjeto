package exercicios;

public class TestandoAvião {
	public static void main(String args[]) {
		
		Avião voo1 = new Avião();
		
		voo1.setMarcaAviao("TAM");
		voo1.setDestinoViagem("NEW JERSEY");
		voo1.setNumeroPassageiros(125);
		voo1.setHorarioSaida(12.30);
		
		System.out.println("Marca do avião: " + voo1.getMarcaAviao());
		System.out.println("Destino da viagem: " + voo1.getDestinoViagem());
		System.out.println("Numero de passageiros: " + voo1.getNumeroPassageiros());
		System.out.println("Horário de saída: " + voo1.getHorarioSaida());
	}
			

}
