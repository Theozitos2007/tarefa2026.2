package com.theozitos2007.backend.Repository;

import com.theozitos2007.backend.Model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
