package rabiscando.padroesdeprojeto.PadroesComportamentais.TemplateMethod;

public class PagamentoCredito extends Pagamento {
    public PagamentoCredito(double valor, Gateway gateway) {
        super(valor, gateway);
    }
    public double calcularTaxa(){
        return getValor() * 0.05;//50
    }
    public double calcularDesconto(){
       return (getValor() > 300.00 ? (getValor() * 0.02): 0);
    }
}