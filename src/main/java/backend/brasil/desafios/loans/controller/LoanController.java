package backend.brasil.desafios.loans.controller;

import backend.brasil.desafios.loans.model.RequestLoan;
import backend.brasil.desafios.loans.service.LoanOptionsService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer-loans")
public class LoanController {

    @PostMapping
    public ResponseEntity loanOptions(@RequestBody @Valid RequestLoan data){
        return ResponseEntity.ok().body(LoanOptionsService.getOptions(data));
    }


}
