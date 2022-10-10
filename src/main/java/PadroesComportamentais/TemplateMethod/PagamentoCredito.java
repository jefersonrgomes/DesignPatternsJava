package PadroesComportamentais.TemplateMethod;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagamentoCredito {
    private double valor;
    private Gateway gateway = new Gateway();
    public double calcularTaxa(){
        return getValor() * 0.05;//50
    }
    public double calcularDesconto(){
       return (getValor() > 300.00 ? (getValor() * 0.02): 0);
    }
    public boolean realizarCobrança(){
        double valorFinal = getValor() + (calcularTaxa() - calcularDesconto());
        return gateway.cobrar(valorFinal);    }
}