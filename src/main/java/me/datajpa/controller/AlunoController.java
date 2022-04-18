package me.datajpa.controller;

import me.datajpa.entity.Aluno;
import me.datajpa.entity.AvaliacaoFisica;
import me.datajpa.entity.form.AlunoForm;
import me.datajpa.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

  @Autowired
  private AlunoServiceImpl service;

  @PostMapping//2
  public Aluno create(@Valid @RequestBody AlunoForm form) {
    return service.create(form);
  }

  @GetMapping("/avaliacoes/{id}")//3
  public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id) {
    return service.getAllAvaliacaoFisicaId(id);
  }

  @GetMapping//1 teste com busca personaliada
  public List<Aluno> getAll(@RequestParam(value = "dataDeNascimento", required = false)
                                    String dataDeNacimento) {
    return service.getAll(dataDeNacimento);
  }

}
