package br.com.alurafood.pagamentos.dto;

import br.com.alurafood.pagamentos.model.Status.Status;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Getter
@Setter
public class PagamentoDto {
    private Long id;
    @NotNull
    @Positive
    private BigDecimal valor;

    @NotBlank
    @Size(max = 100)
    private String nome;

    @NotBlank
    @Size(max = 19)
    private String numero;

    private String expiracao;

    private String codigo;

    private Status status;

    private Long pedidoId;

    @NotNull
    private Long formaDePagamentoId;
}
