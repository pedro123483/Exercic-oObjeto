package exercicios;

public class TestandoCliente {
public static void main (String args[]) {
	Cliente cliente1 = new Cliente();
	
	cliente1.setNomeCliente("Carlos");
	cliente1.setNomeEmpresa("Apple");
	cliente1.setSalario(5000);
	
	System.out.println("O Nome do cliente é: " + cliente1.getNomeCliente());
	System.out.println("Empresa onde trabalha: " + cliente1.getNomeEmpresa());
	System.out.println("Salário: " + cliente1.getSalario());
	
	
	
}

}
