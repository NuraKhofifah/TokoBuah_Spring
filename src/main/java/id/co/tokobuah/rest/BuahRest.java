package id.co.tokobuah.rest;

import id.co.tokobuah.model.Buah;
import id.co.tokobuah.response.DtoResponse;
import id.co.tokobuah.service.BuahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/buahs")
public class BuahRest {
    @Autowired
    private BuahService buahService;

    public BuahRest(BuahService buahService){
        this.buahService = buahService;
    }

    @GetMapping("/getBuahs")
    public DtoResponse getBuahs(){
        return buahService.getAllBuahs();
    }

    @GetMapping("/getBuahActive")
    public DtoResponse getBuahActive(){
        return buahService.getBuahActive();
    }

    @PostMapping("/saveBuah")
    public DtoResponse createBuah(@RequestBody Buah buah){
        return buahService.saveBuah(buah);
    }

    @PostMapping("/updateBuah")
    public DtoResponse updateBuah(@RequestBody Buah buah){
        return buahService.updateBuah(buah);
    }

    @PostMapping("/deleteBuah")
    public DtoResponse deleteBuah(@RequestBody Buah buah){
        return buahService.deleteBuah(buah);
    }
}
