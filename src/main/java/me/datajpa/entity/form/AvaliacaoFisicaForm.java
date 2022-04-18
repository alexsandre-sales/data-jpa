package me.datajpa.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

  //@Positive(message = O Id do aluno deve ser diferente do número negativo e
  // zero.")
  private Long alunoId;

  //@NotNull(message = "Preencha o campo corretamente.")
  //@Positive(message = "O valor do peso ${validatedValue}' deve ser diferente de número negativo e zero.")
  private double peso;

  //@NotNull(message = "Preencha o campo corretamente.")
  //@Positive(message = "O valor da altura ${validatedValue}' deve ser
  // diferente do número negativo e zero.")
  //@DecimalMin(value = "140", message = "'${validatedValue}' precisa ser no
  // mínimo {value}.")
  private double altura;
}
