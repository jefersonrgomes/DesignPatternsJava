package PadroesComportamentais.Strategy.Interfaces.Imp_Interfaces;

import PadroesComportamentais.Strategy.Interfaces.Frete;

public class FreteComum implements Frete {

    @Override
    public double calculaFrete(double valor) {
        return valor * 0.5;
    }
}
