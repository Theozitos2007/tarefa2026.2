package com.theozitos2007.backend.Service;

import com.theozitos2007.backend.Dto.CursoRequest;
import com.theozitos2007.backend.Dto.CursoResponse;
import com.theozitos2007.backend.Model.Curso;
import com.theozitos2007.backend.Repository.CursoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> search(){
        return cursoRepository.findAll();
    }

    public void create(CursoRequest cursoRequest) {
        Curso entity = new Curso();

        BeanUtils.copyProperties(cursoRequest, entity);

        cursoRepository.save(entity);
    }

    public CursoResponse findById(Long id) {
        Curso curso = cursoRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("ID NOT FOUND"));
        return new CursoResponse(curso.getId(), curso.getNome(), curso.getTurno());
    }

    public void update(Long id, CursoRequest cursoRequest) {
        Curso entity = cursoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ERRO"));
        entity.setNome(cursoRequest.getNome());
        entity.setTurno(cursoRequest.getTurno());

        cursoRepository.save(entity);
    }

    public void deleteById(Long id) {
        if (!cursoRepository.existsById(id)) {
            throw new RuntimeException("ERRO");
        }
        cursoRepository.deleteById(id);
    }


}
