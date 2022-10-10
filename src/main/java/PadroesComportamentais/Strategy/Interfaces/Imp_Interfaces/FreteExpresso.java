package PadroesComportamentais.Strategy.Interfaces.Imp_Interfaces;
import PadroesComportamentais.Strategy.Interfaces.Frete;

public class FreteExpresso implements Frete {
    /*** ESTRATEGIAS CONCRETAS:
     Lidam com as solicitações provenientes do contexto.
     Cada EstrategiaConcreta fornece a sua pr´pria implementação de uma solicitação.
     Deste modo, quando o contexto muda de estratédia o seu comportamento também muda.
     ***/
    @Override
    public double calculaFrete(double valor) {
        return valor * 0.1;
    }
}
