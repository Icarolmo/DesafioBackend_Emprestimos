package backend.brasil.desafios.loans.service;

import backend.brasil.desafios.loans.model.RequestLoan;
import backend.brasil.desafios.loans.model.ResponseLoan;
import backend.brasil.desafios.loans.service.businessrule.ConsignmentService;
import backend.brasil.desafios.loans.service.businessrule.GuaranteedService;
import backend.brasil.desafios.loans.service.businessrule.PersonalService;

public class LoanOptionsService {

    public static ResponseLoan getOptions(RequestLoan data){
        String name = data.name();
        int age = data.age();
        double income = data.income();
        String location = data.location();

        boolean personal = PersonalService.requirements(age,income,location);
        boolean guaranteed = GuaranteedService.requirements(income);
        boolean consignment = ConsignmentService.requirements(income);

        return new ResponseLoan(name,personal,guaranteed,consignment);
    }
}
