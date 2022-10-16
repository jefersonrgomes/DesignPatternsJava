package academy.devdojo.springboot2.service;

import academy.devdojo.springboot2.domain.AnimeDTO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class AnimeService {
    private static final List<AnimeDTO> animes;
    static {
       animes = new ArrayList<>(
                List.of(
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
                                5)));
    }
    public List<AnimeDTO> listAll(){
        return animes;
    }
    public AnimeDTO findById(long id){
        return animes
                .stream()
                .filter(anime -> anime.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not Found"));
    }
    public AnimeDTO save(AnimeDTO animeDTO){
        animeDTO.setId(ThreadLocalRandom.current().nextLong(3, 1000));
        animes.add(animeDTO);
        return animeDTO;
    }

    public  AnimeDTO replace(AnimeDTO animeDTO){
        animes.remove(findById(0));
        return animeDTO;
    }

    public void delete(long id) {
        animes.remove(findById(id));
    }
}
