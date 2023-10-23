package backend.brasil.desafios.loans.model;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseLoan {

    String customer;
    ArrayList<Loan> loans;

    public ResponseLoan(String name, boolean personal, boolean guaranteed, boolean consignment){
        this.customer = name;
        this.loans = new ArrayList<Loan>();
        if (personal){
            loans.add(new Loan("PERSONAL", 4));
        }
        if (guaranteed){
            loans.add(new Loan("GUARANTEED", 3));
        }
        if (consignment){
            loans.add(new Loan("CONSIGNMENT", 2));
        }
    }
}
