package com.alibou.security.RendezVous;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value ="/api/rendezvous")
@CrossOrigin(origins = "http://localhost:4200")
public class RendezVousController {

    @Autowired
    private RendezVousServices rendezVousServices;

    @GetMapping("/all")
    public ResponseEntity<List<RendezVous>> getAllRendezVous() {
        List<RendezVous> rendezVousList = rendezVousServices.getAllRendezVous();
        return ResponseEntity.ok(rendezVousList);
    }

    @PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RendezVous> addRendezVous(@RequestBody RendezVous rendezVous) {
        RendezVous addedRendezVous = rendezVousServices.addRendezVous(rendezVous);
        return ResponseEntity.ok(addedRendezVous);
    }

}