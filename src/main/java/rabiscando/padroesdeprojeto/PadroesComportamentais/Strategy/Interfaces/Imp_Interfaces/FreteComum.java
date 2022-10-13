package rabiscando.padroesdeprojeto.PadroesComportamentais.Strategy.Interfaces.Imp_Interfaces;
import rabiscando.padroesdeprojeto.PadroesComportamentais.Strategy.Interfaces.Frete;

public class FreteComum implements Frete {
    @Override
    public double calculaFrete(double valor) {
        return valor * 0.5;
    }
}
