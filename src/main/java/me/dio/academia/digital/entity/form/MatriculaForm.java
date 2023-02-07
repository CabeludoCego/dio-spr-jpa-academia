package me.dio.academia.digital.entity.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class MatriculaForm {

  @NotNull(message = "Prencha o campo corretamente.")
  @Positive(message = "ID é inválida.")
  private Long alunoId;

  public Long getAlunoId() {
    return this.alunoId;
  }

  public void setAlunoId(Long alunoId) {
    this.alunoId = alunoId;
  }

}
