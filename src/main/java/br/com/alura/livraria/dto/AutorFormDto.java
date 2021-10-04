package br.com.alura.livraria.dto;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
public class AutorFormDto {
	@NotBlank
	@Size(min=5)
	private String nome;
	@Email
	private String email;
	@Past
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate dataNascimento;
	@NotBlank
	@Size(min=20, max=250)
	private String miniCurriculo;
}