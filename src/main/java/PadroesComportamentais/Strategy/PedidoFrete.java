package PadroesComportamentais.Strategy;

import PadroesComportamentais.Strategy.Interfaces.Frete;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class PedidoFrete {

    private Frete frete;
    private double valor;

    public void setFrete(Frete frete) {
        this.frete = frete;
    }

    public double calculaFrete(){
        return frete.calculaFrete(valor);
    }

}
