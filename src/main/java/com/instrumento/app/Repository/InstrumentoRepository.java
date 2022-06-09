package com.instrumento.app.Repository;

import com.instrumento.app.Model.Instrumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface InstrumentoRepository extends JpaRepository<Instrumento, Integer> {

    @Query(value="SELECT * FROM persona WHERE nombre LIKE %:texto%", nativeQuery=true)
    List<Instrumento> findByTermino(String texto);


}
