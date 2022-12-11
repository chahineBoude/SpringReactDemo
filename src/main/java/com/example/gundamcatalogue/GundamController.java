package com.example.gundamcatalogue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/gundam")
@CrossOrigin
public class GundamController {

    @Autowired
    private PilotRepository pilotRepository;
    @Autowired
    private MobileSuitRepository mobileSuitRepository;

    @GetMapping(value ="/MobileSuits" ,produces = {"application/json","application/xml"})
    public ResponseEntity<Iterable<MobileSuit>> getAllMs() { return ResponseEntity.ok().body(mobileSuitRepository.findAll()); }

    @GetMapping(value = "MobileSuits/{id}", produces = {"application/json","application/xml"})
    public ResponseEntity<MobileSuit> getMsById(@PathVariable long id ) { return ResponseEntity.ok().body(mobileSuitRepository.findById(id).get()); }

    @GetMapping(value = "MobileSuits/universe/{universe}", produces = {"application/json","application/xml"})
    public ResponseEntity<List<MobileSuit>> getMsByUniverse(@PathVariable String universe){
        List<MobileSuit> msList = mobileSuitRepository.findByUniverse(universe);
        return ResponseEntity.ok().body(msList);
    }



    @GetMapping(value ="/Pilots" ,produces = {"application/json","application/xml"})
    public ResponseEntity<Iterable<Pilot>> getAllPilots() { return ResponseEntity.ok().body(pilotRepository.findAll()); }

    @GetMapping(value = "/Pilots/{id}", produces = {"application/json","application/xml"})
    public ResponseEntity<Pilot> getPilotById(@PathVariable long id) {return ResponseEntity.ok().body(pilotRepository.findById(id).get());}

    @GetMapping(value = "/Pilots/{universe}", produces = {"application/json","application/xml"})
    public ResponseEntity<List<Pilot>> getPilotByUniverse(@PathVariable String universe){
        return ResponseEntity.ok().body(pilotRepository.findByUniverse(universe));
    }

    @PutMapping(value = "/Pilot/AddMobileSuit/{id}", consumes = {"application/json","application/xml"}, produces = {"application/json","application/xml"})
    public ResponseEntity<Void> addMobileSuit(@PathVariable long pilotId, @RequestBody MobileSuit mobileSuit){
        if (pilotRepository.existsById(pilotId)){
            Pilot pilot = pilotRepository.findById(pilotId).get();
            if (mobileSuitRepository.existsById(mobileSuit.id)){
                pilot.getMsList().add(mobileSuit);
                pilotRepository.save(pilot);
                return ResponseEntity.ok().build();
            }
            else return ResponseEntity.notFound().build();
        }
        else return ResponseEntity.notFound().build();
    }

}
