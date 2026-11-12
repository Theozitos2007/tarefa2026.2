package com.theozitos2007.backend.Service;

import com.theozitos2007.backend.Dto.AlunoRequest;
import com.theozitos2007.backend.Dto.AlunoResponse;
import com.theozitos2007.backend.Model.Aluno;
import com.theozitos2007.backend.Repository.AlunoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> search(){
        return alunoRepository.findAll();
    }

    public void create(AlunoRequest alunoRequest) {
        Aluno entity = new Aluno();

        BeanUtils.copyProperties(alunoRequest, entity);

        alunoRepository.save(entity);
    }

    public AlunoResponse findById(Long id) {
        Aluno aluno = alunoRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
        return new AlunoResponse(aluno.getId(), aluno.getNome(), aluno.getIdade(), aluno.getRa());
    }


    public void update(Long id, AlunoRequest alunoRequest) {
        Optional<Aluno> optionalAluno = alunoRepository.findById(id);
        if (optionalAluno.isPresent()) {
            Aluno entity = optionalAluno.get();
            entity.setNome(alunoRequest.getNome());
            entity.setIdade(alunoRequest.getIdade());
            entity.setRa(alunoRequest.getRa());
            alunoRepository.save(entity);
        } else {
            throw new RuntimeException("Aluno não encontrado");
        }
    }

    public void deleteById(Long id) {
        if (!alunoRepository.existsById(id)) {
            throw new RuntimeException("Aluno não encontrado");
        }else{
            alunoRepository.deleteById(id);
        }

    }


}