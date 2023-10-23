package backend.brasil.desafios.loans.model;

import jakarta.validation.constraints.NotNull;

public record RequestLoan(
        @NotNull
        int age,
        @NotNull
        String cpf,
        @NotNull
        String name,
        @NotNull
        double income,
        @NotNull
        String location){}
