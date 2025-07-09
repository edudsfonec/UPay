package api.upay.dto;

import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;

public class TransactionDto {

    @NotNull
    private Double valor;

    @NotNull
    private OffsetDateTime dataHora;

    public OffsetDateTime getDataHora() {
        return dataHora;
    }

    public Double getValor() {
        return valor;
    }
}
