package PadroesComportamentais.Strategy.Interfaces.Imp_Interfaces;
import PadroesComportamentais.Strategy.Interfaces.Frete;

public class FreteExpresso implements Frete {
    @Override
    public double calculaFrete(double valor) {
        return valor * 0.1;
    }
}
