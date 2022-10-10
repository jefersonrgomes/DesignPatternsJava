package PadroesComportamentais.Strategy;

import PadroesComportamentais.Strategy.Interfaces.Imp_Interfaces.FreteComum;
import PadroesComportamentais.Strategy.Interfaces.Imp_Interfaces.FreteExpresso;

public class MainStrategy {
    public static void main(String[] args) {

        FreteComum freteComum = new FreteComum();
        FreteExpresso freteExpresso = new FreteExpresso();

        PedidoFreteMoveis pedidoFreteMoveis = new PedidoFreteMoveis();
        pedidoFreteMoveis.setValor(1100);
        pedidoFreteMoveis.setFrete(freteExpresso);
        pedidoFreteMoveis.setFrete(freteComum);

        PedidoFreteEletronicos pedidoFreteEletronicos = new PedidoFreteEletronicos();
        pedidoFreteEletronicos.setValor(2100);
        pedidoFreteEletronicos.setFrete(freteExpresso);
        pedidoFreteEletronicos.setFrete(freteComum);

        System.out.println("DESIGN PATTERNS JAVA\n" +
                "*** STRATEGY ***\n" +
                "--- --- --- --- ---\n");

        System.out.println("Setor: " + pedidoFreteMoveis.getSETOR());
        System.out.println("Frete Comun: R$: " + pedidoFreteMoveis.calculaFrete());
        try {
            System.out.println("Frete Expresso: R$: " + pedidoFreteMoveis.calculaFrete());
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("--- --- ---");

        System.out.println("Setor: " + pedidoFreteEletronicos.getSETOR());
        System.out.println("Frete Comun: R$: " + pedidoFreteEletronicos.calculaFrete());
        System.out.println("Frete Expresso: R$: " + pedidoFreteEletronicos.calculaFrete());
        System.out.println("--- --- ---");

    }

}
