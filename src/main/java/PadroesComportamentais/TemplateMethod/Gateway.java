package PadroesComportamentais.TemplateMethod;

import java.util.Random;

public class Gateway {
    public boolean cobrar( double valorFinal){
        Random random = new Random();
        //Apenas para visualizar o valor final.
        System.out.println("Valor Cobrado R$: " + valorFinal);

        //Retorna um valor booleano aleatorio randomico.
        return random.nextBoolean();
    }
}
