package Heranca.Desafio;

public class ExecutaCarro {
	
    public static void main(String[] args) {
    	
        CarroCivic civic = new CarroCivic();
        CarroFerrari ferrari = new CarroFerrari();

        // Carro: CIVIC
        System.out.println("🚗 Civic:");
        System.out.println("Velocidade inicial: " + civic.getVelocidadeAtual() + "Km/h.");
        civic.acelerar(); // não acelera porque está parado
        civic.setVelocidadeAtual(100); // inicia movimento
        if (civic.getVelocidadeAtual() <= 0) {
        	System.out.println("Velocidade não pode ser menor que 0Km/h");
           }
        System.out.println("Velocidade atual: " + civic.getVelocidadeAtual() + "Km/h.");
        civic.acelerar();
        System.out.println("Velocidade após acelerar: " + civic.getVelocidadeAtual() + "Km/h.");
        civic.freiar();
        System.out.println("Velocidade após freiar: " + civic.getVelocidadeAtual() + "Km/h.");

        // Carro: Ferrari
        System.out.println("\n🏎️ Ferrari:");
        System.out.println("Velocidade inicial: " + ferrari.getVelocidadeAtual() + "Km/h.");
        ferrari.setVelocidadeAtual(-240);
        if (ferrari.getVelocidadeAtual() <= 0) {
        	System.out.println("Velocidade não pode ser menor que 0Km/h");
           }
        System.out.println("Velocidade atual: " + ferrari.getVelocidadeAtual() +"Km/h.");
        ferrari.acelerar(); // deve ir até 350
        System.out.println("Velocidade após acelerar: " + ferrari.getVelocidadeAtual() + "Km/h.");
        ferrari.freiar();
        System.out.println("Velocidade após freiar: " + ferrari.getVelocidadeAtual() + "Km/h.");
    }
}






