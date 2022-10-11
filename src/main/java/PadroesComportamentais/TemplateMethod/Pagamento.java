package PadroesComportamentais.TemplateMethod;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Pagamento {

    protected double valor;
    protected Gateway gateway;

    public double calcularTaxa(){
        return 0;
    }

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
