package com.theozitos2007.backend.Repository;

import com.theozitos2007.backend.Model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
