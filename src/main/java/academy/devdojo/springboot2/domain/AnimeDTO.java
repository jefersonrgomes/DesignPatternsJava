package academy.devdojo.springboot2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnimeDTO {

    private long id;
    private String nomeAnime;
    private String produtora;
    private int numeroEpisodios;
    private int numeroTemporadas;
}
