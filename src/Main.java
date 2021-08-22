public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double monthlyPaymentPerYear = service.calculate(9.99, 12, 1_000_000);
        System.out.println("Платеж при займе на 1 год: " + monthlyPaymentPerYear);

        double monthlyPaymentPer2Years = service.calculate(9.99, 24, 1_000_000);
        System.out.println("Платеж при займе на 2 года: " + monthlyPaymentPer2Years);

        double monthlyPaymentPer3Years = service.calculate(9.99, 36, 1_000_000);
        System.out.println("Платеж при займе на 3 года: " + monthlyPaymentPer3Years);
    }
}
