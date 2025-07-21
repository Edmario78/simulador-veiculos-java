package Heranca.Desafio;

public class CarroFerrari extends Carro {
	
    private final int VELOCIDADE_MAXIMA = 350;

    @Override
    public void acelerar() {
        if (!estaParado()) {
            int novaVelocidade = getVelocidadeAtual() + 15;
            if (novaVelocidade > VELOCIDADE_MAXIMA) {
                novaVelocidade = VELOCIDADE_MAXIMA;
            }
            setVelocidadeAtual(novaVelocidade);
        }
    }

    @Override
    public void freiar() {
        if (!estaParado()) {
            int novaVelocidade = getVelocidadeAtual() - 25;
            if (novaVelocidade < 0) novaVelocidade = 0;
            setVelocidadeAtual(novaVelocidade);
        }
    }
}

