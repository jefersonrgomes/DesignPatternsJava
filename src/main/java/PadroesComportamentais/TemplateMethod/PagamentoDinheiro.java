package PadroesComportamentais.TemplateMethod;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagamentoDinheiro {
    private double valor;
    private Gateway gateway = new Gateway();
    public double calcularTaxa(){
        return 0;
    }
    public double calcularDesconto(){
        return valor * 0.1;
    };
    public boolean realizarCobrança(){
        double valorFinal = valor + (calcularTaxa() - calcularDesconto());
        return gateway.cobrar(valorFinal);
    }
}