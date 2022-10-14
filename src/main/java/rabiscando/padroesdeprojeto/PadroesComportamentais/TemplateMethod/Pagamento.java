package rabiscando.padroesdeprojeto.PadroesComportamentais.TemplateMethod;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Pagamento {

    protected double valor;
    protected Gateway gateway;

    //Hook (gancho) - Implementação Mínima. Pode ser sobreescrito pelas subclasses.
    public double calcularTaxa(){
        return 0;
    }

    //Sera implementado pelas subclasses.
    public abstract double calcularDesconto();

    final public boolean realizarCobranca(){
        double valorFinal = this.valor + (calcularTaxa()
 - calcularDesconto());
        System.out.println("Valor R$: " + this.valor);
        System.out.println("Taxa R$: " + calcularTaxa());
        System.out.println("Desconto R$: " + calcularDesconto());
        return this.gateway.cobrar(valorFinal);
    }
}
