package backend.brasil.desafios.loans.service.businessrule;

public class PersonalService implements LoanService{

    public static boolean requirements(int age, double income, String location){
        /*
        Conceder o empréstimo pessoal se o salário do cliente for igual ou inferior a R$ 3000.
        Conceder o empréstimo pessoal se o salário do cliente estiver entre R$ 3000 e R$ 5000, se o cliente tiver menos de 30 anos e residir em São Paulo (SP).
        */

        return (income <= 3000 || (income < 5000 && age < 30 && location.equals("SP")));
    }

}
