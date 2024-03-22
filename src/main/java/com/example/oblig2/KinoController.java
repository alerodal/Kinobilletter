package com.example.oblig2;

import com.example.oblig2.Kino;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class KinoController {
    public final List<Kino> kinoBilletter = new ArrayList<>();

    @GetMapping("/billetter")
    public List <Kino> getKinoBilletter(){
        return kinoBilletter;
    }
    @PostMapping("/billetter")
    public void setKinoBilletter(Kino billett){
        kinoBilletter.add(billett);
    }

    @GetMapping("/slett")
    public void slettBillett(){
        kinoBilletter.clear();
    }
}
