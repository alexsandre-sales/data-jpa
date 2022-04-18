package me.datajpa.service;

import me.datajpa.entity.Aluno;
import me.datajpa.entity.AvaliacaoFisica;
import me.datajpa.entity.form.AlunoForm;
import me.datajpa.entity.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {
  Aluno create(AlunoForm form);

  Aluno get(Long id);

  List<Aluno> getAll(String dataDeNascimento);

  Aluno update(Long id, AlunoUpdateForm formUpdate);

  void delete(Long id);

  List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);

}
