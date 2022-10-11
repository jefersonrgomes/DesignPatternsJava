package PadroesComportamentais.TemplateMethod;

public class MainTemplateMethod {
    public static void main(String[] args) {

        double valor = 1000.00;
        Gateway gateway = new Gateway();
        PagamentoCredito pagamentoCredito = new PagamentoCredito(valor,gateway);
        PagamentoDebito pagamentoDebito = new PagamentoDebito(valor, gateway);
        PagamentoDinheiro pagamentoDinheiro = new PagamentoDinheiro(valor, gateway);

        System.out.println("DESIGN PATTERNS JAVA\n" +
                "*** TEMPLATE METHOD ***");
        System.out.println("--- --- --- --- ---\n");
        System.out.println("Pagamento Modo Credito");
        pagamentoCredito.realizarCobrança();
        System.out.println("--- --- --- --- ---\n");
        System.out.println("Pagamento Modo Debito");
        pagamentoDebito.realizarCobrança();
        System.out.println("--- --- --- --- ---\n");
        System.out.println("Pagamento Modo Dinheiro AVista");
        pagamentoDinheiro.realizarCobrança();
    }
}