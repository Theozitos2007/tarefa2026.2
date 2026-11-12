package Controller;

import Model.Aluno;
import Repository.AlunoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class AlunoController implements AlunoRepository {

    //@GetMapping
    //public Aluno buscarAluno() { return aluno; }
    //@GetMapping("/nome")
    //public String buscarNome() {return aluno.getNome();}
}