package Heranca.Desafio;

public class Carro {
	
    private int velocidadeAtual = 0;

    protected void setVelocidadeAtual(int novaVelocidade) {
        if (novaVelocidade >= 0) {
            this.velocidadeAtual = novaVelocidade;
        }
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public boolean estaParado() {
        return velocidadeAtual == 0;
    }

    public void acelerar() {
        // Método genérico, sobrescrito nas subclasses
    }

    public void freiar() {
        // Método genérico, sobrescrito nas subclasses
    }
}

