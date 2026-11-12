package com.theozitos2007.backend.Controller;

import com.theozitos2007.backend.Dto.AlunoRequest;
import com.theozitos2007.backend.Dto.AlunoResponse;
import com.theozitos2007.backend.Model.Aluno;
import com.theozitos2007.backend.Service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<Aluno> getAll(){
        return alunoService.search();
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody AlunoRequest alunoRequest){
        alunoService.create(alunoRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(
        @PathVariable Long id,
        @RequestBody AlunoRequest alunoRequest){

        alunoService.update(id, alunoRequest);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        alunoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public AlunoResponse getById(@PathVariable Long id){
        return alunoService.findById(id);
    }
}