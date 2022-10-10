package PadroesComportamentais.Strategy.Interfaces;
/*** STRATEGY:
 Contrato que as EstrategiasConcretas devem respeitar.
 Tal conrato será exigido pela classe Contexto
 ***/
public interface Frete {
    double calculaFrete(double valor);
}
