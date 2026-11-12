package com.theozitos2007.backend.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AlunoResponse {

    Long id;
    String nome;
    int ra;
    int idade;

}
