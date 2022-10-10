package PadroesComportamentais.TemplateMethod;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagamentoDebito {
    private double valor;
    private Gateway gateway = new Gateway();
    public double calcularTaxa(){
        return 4;
    }
    public double calcularDesconto(){
        return valor * 0.05;
    };
    public boolean realizarCobrança(){
        double valorFinal = valor + (calcularTaxa() - calcularDesconto());
        return gateway.cobrar(valorFinal);    }
}