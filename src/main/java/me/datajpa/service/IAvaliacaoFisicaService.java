package me.datajpa.service;

import me.datajpa.entity.AvaliacaoFisica;
import me.datajpa.entity.form.AvaliacaoFisicaForm;
import me.datajpa.entity.form.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface IAvaliacaoFisicaService {
  AvaliacaoFisica create(AvaliacaoFisicaForm form);

  AvaliacaoFisica get(Long id);

  List<AvaliacaoFisica> getAll();

  AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

  void delete(Long id);
}
