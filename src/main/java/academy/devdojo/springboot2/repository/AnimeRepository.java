package academy.devdojo.springboot2.repository;

import academy.devdojo.springboot2.domain.AnimeDTO;
import academy.devdojo.springboot2.service.AnimeService;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimeRepository {
    List<AnimeService> listAll();
}
