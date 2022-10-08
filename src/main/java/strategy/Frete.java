package strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Frete {
    private double valor;

    public double calculaFreteComum(){
        return getValor() * 0.5;
    }

    public double calculaFreteExpresso(){
        return getValor() * 0.10;
    }
}
