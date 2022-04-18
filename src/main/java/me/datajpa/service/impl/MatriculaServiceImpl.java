package me.datajpa.service.impl;

import me.datajpa.entity.Aluno;
import me.datajpa.entity.Matricula;
import me.datajpa.entity.form.MatriculaForm;
import me.datajpa.service.IMatriculaService;
import me.datajpa.repository.AlunoRepository;
import me.datajpa.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

  @Autowired
  private MatriculaRepository matriculaRepository;

  @Autowired
  private AlunoRepository alunoRepository;

  @Override
  public Matricula create(MatriculaForm form) {
    Matricula matricula = new Matricula();
    Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

    matricula.setAluno(aluno);

    return matriculaRepository.save(matricula);
  }

  @Override
  public Matricula get(Long id) {
    return matriculaRepository.findById(id).get();
  }

// usando o JPQL ou Querys Sql nativas
  @Override
  public List<Matricula> getAll(String bairro) {
    if(bairro == null){
      return matriculaRepository.findAll();
    }else{
      return matriculaRepository.findAlunosMatriculadosBairro(bairro);
    }
  }

//  Usando 'findBy' do Jpa
//  @Override
//  public List<Matricula> getAll(String bairro) {
//    if(bairro == null){
//      return matriculaRepository.findAll();
//    }else{
//      return matriculaRepository.findByAlunoBairro(bairro);
//    }
//  }

  @Override
  public void delete(Long id) {}



}
