package exercicios;

public class TestandoAvi�o {
	public static void main(String args[]) {
		
		Avi�o voo1 = new Avi�o();
		
		voo1.setMarcaAviao("TAM");
		voo1.setDestinoViagem("NEW JERSEY");
		voo1.setNumeroPassageiros(125);
		voo1.setHorarioSaida(12.30);
		
		System.out.println("Marca do avi�o: " + voo1.getMarcaAviao());
		System.out.println("Destino da viagem: " + voo1.getDestinoViagem());
		System.out.println("Numero de passageiros: " + voo1.getNumeroPassageiros());
		System.out.println("Hor�rio de sa�da: " + voo1.getHorarioSaida());
	}
			

}
