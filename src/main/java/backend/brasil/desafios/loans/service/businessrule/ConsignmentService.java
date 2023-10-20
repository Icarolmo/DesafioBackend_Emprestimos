package backend.brasil.desafios.loans.service.businessrule;

public class ConsignmentService implements LoanService{

    public static boolean requirements(double income){
        /*
        Conceder o empréstimo consignado se o salário do cliente for igual ou superior a R$ 5000.
        */

        return income >= 5000;
    }

}
