package rabiscando.padroesdeprojeto.PadroesComportamentais.TemplateMethod;

public class PagamentoDebito  extends Pagamento{
    public PagamentoDebito(double valor, Gateway gateway) {
        super(valor, gateway);
    }
    public double calcularTaxa(){
        return 4;
    }
    public double calcularDesconto(){
        return valor * 0.05;
    };
}