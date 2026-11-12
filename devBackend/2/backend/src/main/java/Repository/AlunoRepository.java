package Repository;

import Model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@Repository
public interface AlunoRepository
        extends JpaRepository<Aluno, Long> {    List<Aluno> findByNome(String nome);
    // pronto! já vem com:
// save(), findAll(), findById(),
// deleteById(), e mais
// Spring Data cria a consulta
// a partir do nome do métoo!
}
