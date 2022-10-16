package rabiscando.padroesdeprojeto.PadroesComportamentais.Observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import rabiscando.padroesdeprojeto.PadroesComportamentais.Observer.interfaces.Observer;
import rabiscando.padroesdeprojeto.PadroesComportamentais.Observer.interfaces.Subject;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente implements Observer {
    private String nome;
    private String email;
    private Subject subject;
    private Email email_;

    public Cliente(String nome, String email, Subject subject) {
        this.nome = nome;
        this.email = email;
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(String mensagem) {
       Email.enviarEmail(this, mensagem);
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getEmail() {
        return this.email;
    }
}
