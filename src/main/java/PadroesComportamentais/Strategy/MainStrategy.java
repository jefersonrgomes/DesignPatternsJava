package PadroesComportamentais.Strategy;

import PadroesComportamentais.Strategy.Interfaces.Imp_Interfaces.FreteComum;
import PadroesComportamentais.Strategy.Interfaces.Imp_Interfaces.FreteExpresso;

public class MainStrategy {
    public static void main(String[] args) {

        //Criação do tipos de frete - Instanciação.
        FreteComum freteComum = new FreteComum();
        FreteExpresso freteExpresso = new FreteExpresso();

        //Criação de um pedido do tipo setor Eletronicos.
        PedidoFreteEletronicos pedidoFreteEletronicos = new PedidoFreteEletronicos();
        //Atribuição do valor
        pedidoFreteEletronicos.setValor(2100);
        //Definição do frete comum como sendo o frete escolhido.
        pedidoFreteEletronicos.setFrete(freteComum);

        //Calculo do frete comum.
        System.out.println("DESIGN PATTERNS JAVA\n" +
                "*** STRATEGY ***");
        System.out.println("Setor: " + pedidoFreteEletronicos.getSETOR());
        System.out.println("Frete Comun: R$: " + pedidoFreteEletronicos.calculaFrete());
        //Calculo do frete expresso.
        pedidoFreteEletronicos.setFrete(freteExpresso);
        System.out.println("Frete Expresso: R$: " + pedidoFreteEletronicos.calculaFrete());
        System.out.println("--- --- ---");
        //--- --- --- --- ---

        PedidoFreteMoveis pedidoFreteMoveis = new PedidoFreteMoveis();
        pedidoFreteMoveis.setValor(1100);
        pedidoFreteMoveis.setFrete(freteComum);
        System.out.println("DESIGN PATTERNS JAVA\n" +
                "*** STRATEGY ***");
        System.out.println("Setor: " + pedidoFreteMoveis.getSETOR());
        System.out.println("Frete Comun: R$: " + pedidoFreteMoveis.calculaFrete());
        pedidoFreteMoveis.setFrete(freteExpresso);
        System.out.println("Frete Expresso: R$: " + pedidoFreteMoveis.calculaFrete());
        System.out.println("--- --- ---");
    }
}
/*** CONSEQUENIAS:
 *
 -> Familia de Algoritmo: Permite a criação de uma hierarquia de classes do tipo
 STRATEGY em um mesmo contexto.
 O encapsulamento dos algoritmos nas classes STRATEGY permite alterar o algoritmo
 independentemente do seu contexto, tornando mais fácil de efetuar possiveis
 alterações no código.

 -> É uma estratégia para remover operadores condicionais.

 -> Flexibilidade na escolha de qual STRATEGY utilizar.

 -> Clientes devem conhecer as classes STRATEGY, pois,
 se o cliente não compreender como essas classes funcionam,
 não poderá escolher o melhor comportamento.

 -> Custo entre a cominicação STRATEGY e CONTEXT, as classes que implementam a
 interface STRATEGY podem não utilizar as informações passadas por ela
 ou seja, pode acontecer da classe CONTEXTO criar e iniciar parâmetros que não
 serão utilizados.

 -> Aumento do número de classes na aplicação.
 * ***/
