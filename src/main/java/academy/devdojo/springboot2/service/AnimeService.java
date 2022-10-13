package academy.devdojo.springboot2.service;

import academy.devdojo.springboot2.domain.AnimeDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {

    public List<AnimeDTO> listAll(){
        return List.of(
                new AnimeDTO(
                    1L,
                    "DBZ Super",
                    "Toei Animation",
                    325,
                    8),
                new AnimeDTO(
                        2L,
                        "Bleac La Guerra dos Mil Anos",
                        "Fun Animation",
                        263,
                        5));
    }
}
