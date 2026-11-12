package com.theozitos2007.backend.Controller;

import com.theozitos2007.backend.Dto.CursoRequest;
import com.theozitos2007.backend.Dto.CursoResponse;
import com.theozitos2007.backend.Model.Curso;
import com.theozitos2007.backend.Service.CursoService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/curso")
public class CursoController {

   @Autowired
   private CursoService cursoService;

   @GetMapping
   public List<Curso> getAll(){
       return cursoService.search();
   }

   @PostMapping
   public void create(@RequestBody CursoRequest cursoRequest){
         cursoService.create(cursoRequest);
    }

   @GetMapping("/{id}")
   public CursoResponse getById(@PathVariable Long id){
        return cursoService.findById(id);
    }
}
