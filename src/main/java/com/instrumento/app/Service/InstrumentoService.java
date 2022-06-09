package com.instrumento.app.Service;


import com.instrumento.app.Model.Instrumento;
import com.instrumento.app.Repository.InstrumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class InstrumentoService {
    @Autowired
    InstrumentoRepository instrumentoRepository;

    public List<Instrumento> getInstrumentos(){
        return instrumentoRepository.findAll();
    }

    public Optional<Instrumento> getInstrumentoById(int id){
        return instrumentoRepository.findById(id);
    }

    public Instrumento saveInstrumento(Instrumento instrumento){
        return instrumentoRepository.save(instrumento);
    }

    public void deleteInstrumentoById(int id){
         instrumentoRepository.deleteById(id);
    }

    public Instrumento updateInstrumento(Instrumento instrumento){
        return instrumentoRepository.save(instrumento);
    }
    public List<Instrumento> findByTermino(String termino){
        return instrumentoRepository.findByTermino(termino);
    }

}
