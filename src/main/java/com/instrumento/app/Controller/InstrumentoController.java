
package com.instrumento.app.Controller;

import com.instrumento.app.Model.Instrumento;
import com.instrumento.app.Service.InstrumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins ="*", allowedHeaders="*")
@RestController
public class InstrumentoController {
    @Autowired
    InstrumentoService instrumentoService;

    @GetMapping("/instrumentos")
    public List<Instrumento> getInstrumentos(){
        return instrumentoService.getInstrumentos();
    }

    @GetMapping("/instrumento/{id}")
    public Optional<Instrumento> getInstrumentoById(@PathVariable("id") int id){
        return instrumentoService.getInstrumentoById(id);
    }

    @PostMapping("/create")
    public Instrumento createInstrumento(@RequestBody Instrumento instrumento){
            return instrumentoService.saveInstrumento(instrumento);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") int id){
        instrumentoService.deleteInstrumentoById(id);
    }

    @PutMapping("/update")
    public Instrumento updateInstrumento(@RequestBody Instrumento instrumento){
        return instrumentoService.updateInstrumento(instrumento);
    }
    @GetMapping("/find/{termino}")
    public List<Instrumento> getInstrumentoByTermino(@PathVariable("termino") String termino){
        return instrumentoService.findByTermino(termino);
    }

}
