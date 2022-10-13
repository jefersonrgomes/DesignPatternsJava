package rabiscando.padroesdeprojeto.PadroesComportamentais.Strategy;
import rabiscando.padroesdeprojeto.PadroesComportamentais.Strategy.Interfaces.Frete;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class PedidoFrete {
    private double valor;
    /***CONTEXTO:
    Classe que é composta por um objeto
    que implementa a interface STRATEGY.
    Ele é responsavel por orquestrar as classes EstrategisConcretas. Sempre que uma soliciação é feita a classe contexto ela é delegada ao objeto Strategy que a compõe.
   ***/
    private Frete frete;
    public double calculaFrete(){
        return frete.calculaFrete(valor);
    }
}
