package backend.brasil.desafios.loans.service.businessrule;


public interface LoanService {
    static boolean requirements(int age, double income, String location) {
        return false;
    }
}