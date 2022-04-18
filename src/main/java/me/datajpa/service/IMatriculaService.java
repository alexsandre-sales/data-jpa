package me.datajpa.service;

import me.datajpa.entity.Matricula;
import me.datajpa.entity.form.MatriculaForm;

import java.util.List;

public interface IMatriculaService {
  Matricula create(MatriculaForm form);

  Matricula get(Long id);

  List<Matricula> getAll(String bairro);

  void delete(Long id);

}
