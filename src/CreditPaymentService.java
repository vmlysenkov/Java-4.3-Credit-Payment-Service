public class CreditPaymentService {
    public double calculate(double interest_rate, int loan_terms, int credit_amount) {

        double monthlyPayment = credit_amount * (interest_rate / 1200 + interest_rate / 1200 / (Math.pow((1 + interest_rate / 1200), loan_terms) - 1));
        return (int) monthlyPayment;

    }
}
