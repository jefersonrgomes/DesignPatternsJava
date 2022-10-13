package academy.devdojo.springboot2.controller;

import academy.devdojo.springboot2.domain.AnimeDTO;
import academy.devdojo.springboot2.service.AnimeService;
import academy.devdojo.springboot2.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("animes")
@Log4j2
@RequiredArgsConstructor
@Controller
public class AnimeControler {
    private final DateUtil dateUtil;
    private final AnimeService animeService;

    @GetMapping
    public List<AnimeDTO> list(){
    log.info("Iniciando o projeto Spring - " +
            dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now())+
            "\nEm http://localhost:8080/anime/listar#");
    return animeService.listAll();
    }
}
