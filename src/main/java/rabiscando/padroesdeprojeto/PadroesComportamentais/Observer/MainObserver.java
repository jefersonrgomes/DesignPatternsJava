package rabiscando.padroesdeprojeto.PadroesComportamentais.Observer;

import rabiscando.padroesdeprojeto.PadroesComportamentais.Observer.interfaces.Subject;

public class MainObserver {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Carlos");
        cliente.setEmail("carlos@mail.com");


        System.out.println("DESIGN PATTERNS JAVA\n" +
                "*** OBSERVER ***");
        cliente.update("Nova NewsLater disponivel");
    }
}
