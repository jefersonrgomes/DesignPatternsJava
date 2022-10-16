package rabiscando.padroesdeprojeto.PadroesComportamentais.Observer;

import rabiscando.padroesdeprojeto.PadroesComportamentais.Observer.interfaces.Observer;

public class Email
{
    public static void enviarEmail(Observer observer, String mensagem){
        System.out.println("--- --- --- --- ---");
        System.out.printf("Email enviado para %s - %s%n",
                observer.getNome(),
                observer.getEmail());
        System.out.printf("Mensagem: %s%n", mensagem);
    }
}
