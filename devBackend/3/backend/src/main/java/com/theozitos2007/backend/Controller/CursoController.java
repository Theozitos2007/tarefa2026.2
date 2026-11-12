package com.theozitos2007.backend.Controller;

import com.theozitos2007.backend.Dto.CursoRequest;
import com.theozitos2007.backend.Dto.CursoResponse;
import com.theozitos2007.backend.Model.Curso;
import com.theozitos2007.backend.Service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/curso")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<Curso> getAll() {
        return cursoService.search();
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody CursoRequest cursoRequest) {
        cursoService.create(cursoRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(
            @PathVariable Long id,
            @RequestBody CursoRequest cursoRequest) {

        cursoService.update(id, cursoRequest);
        return ResponseEntity.noContent().build();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        cursoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public CursoResponse getById(@PathVariable Long id) {
        return cursoService.findById(id);
    }
}
