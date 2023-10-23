package backend.brasil.desafios.loans.controller;

import backend.brasil.desafios.loans.model.RequestLoan;
import backend.brasil.desafios.loans.service.LoanOptionsService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer-loans")
public class LoanController {

    @PostMapping
    public ResponseEntity loanOptions(@RequestBody @Validated RequestLoan data){
        try {
            return ResponseEntity.ok().body(LoanOptionsService.getOptions(data));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e);
        }
    }


}
