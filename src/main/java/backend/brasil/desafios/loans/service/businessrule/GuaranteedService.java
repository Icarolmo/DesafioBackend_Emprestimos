package backend.brasil.desafios.loans.service.businessrule;

public class GuaranteedService implements LoanService{

    public static boolean requirements(double income){
        /*
        Conceder o empréstimo com garantia se o salário do cliente for igual ou inferior a R$ 3000.
        */

        return income <= 3000;
    }
}
