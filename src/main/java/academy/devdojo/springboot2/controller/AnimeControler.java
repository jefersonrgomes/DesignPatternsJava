package academy.devdojo.springboot2.controller;

import academy.devdojo.springboot2.domain.AnimeDTO;
import academy.devdojo.springboot2.service.AnimeService;
//import academy.devdojo.springboot2.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("animes")
@Log4j2
@RequiredArgsConstructor
@Controller
public class AnimeControler {
    //private final DateUtil dateUtil;
    private final AnimeService animeService;

    @GetMapping
        public ResponseEntity<List<AnimeDTO>> list(){
        return ResponseEntity.ok(animeService.listAll());
    }

    @GetMapping(path = "/{id}")
        public ResponseEntity<AnimeDTO> findById(@PathVariable long id){
        return ResponseEntity.ok(animeService.findById(id));
    }

    @PostMapping
    public ResponseEntity save(@RequestBody AnimeDTO animeDTO){
        return new ResponseEntity(animeService.save(animeDTO), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
        public ResponseEntity<Void> delete(@PathVariable long id){
            animeService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
}
