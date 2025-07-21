package Heranca.Desafio;

public class CarroCivic extends Carro {
	
    private final int VELOCIDADE_MAXIMA = 220;

    @Override
    public void acelerar() {
        if (!estaParado()) {
            int novaVelocidade = getVelocidadeAtual() + 5;
            if (novaVelocidade > VELOCIDADE_MAXIMA) {
                novaVelocidade = VELOCIDADE_MAXIMA;
            }
            setVelocidadeAtual(novaVelocidade);
        }
    }

    @Override
    public void freiar() {
        if (!estaParado()) {
            int novaVelocidade = getVelocidadeAtual() - 10;
            if (novaVelocidade < 0) novaVelocidade = 0;
            setVelocidadeAtual(novaVelocidade);
        }
    }
}
