package Controller;

import Model.Aluno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    private Aluno aluno =
            new Aluno(1, "Maria", 22, 123123);
    @GetMapping
    public Aluno buscarAluno() {
        return aluno;
    }
    @GetMapping("/nome")
    public String buscarNome() {
        return aluno.getNome();
    }
}