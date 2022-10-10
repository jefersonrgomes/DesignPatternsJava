package PadroesComportamentais.Strategy;
import PadroesComportamentais.Strategy.Interfaces.Frete;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class PedidoFrete {
    private double valor;
    private Frete frete;
    public double calculaFrete(){
        return frete.calculaFrete(valor);
    }
}
