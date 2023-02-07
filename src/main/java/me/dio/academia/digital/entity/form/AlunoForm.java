package me.dio.academia.digital.entity.form;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  
  @NotEmpty(message = "Preencha o campo corretamente.")
  @Size(min = 2, max = 30, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String nome;
  
  @NotEmpty(message = "Preencha o campo corretamente.")
  private String cpf;

  @NotEmpty(message = "Preencha o campo corretamente.")
  private String bairro;

  @NotNull(message = "Prencha o campo corretamente.")
  @Past(message = "Data '${validatedValue}' é inválida.")
  private LocalDate dataDeNascimento;
}
