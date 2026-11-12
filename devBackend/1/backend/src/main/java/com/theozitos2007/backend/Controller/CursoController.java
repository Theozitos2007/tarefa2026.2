package com.theozitos2007.backend.Controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CursoController {

    String nome;
    // 0 = matutino, 1 = vespertino, 2 = noturno
    int turno;
}
