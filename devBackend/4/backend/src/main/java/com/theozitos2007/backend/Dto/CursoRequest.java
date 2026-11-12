package com.theozitos2007.backend.Dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class CursoRequest {

        String nome;

        // 0 = matutino, 1 = vespertino, 2 = noturno
        int turno;
    }

