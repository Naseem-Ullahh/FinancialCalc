class FinancialCalc {

    // V = P * (1 + I)^Y
    public static double computeFinalValue(double principal, double interestRate, int numOfYears) {
        return principal * Math.pow(1 + interestRate, numOfYears);
    }

    public static void main(String[] args) {
        double principal = 1000.00;     // $1000 initial investment
        double interestRate = 0.035;    // 3.5% interest rate
        int numOfYears = 7;             // investment length is 7 years

        double finalValue = computeFinalValue(principal, interestRate, numOfYears);

        System.out.println("Investing $" + principal +
                " at an interest rate of " + (interestRate * 100) + "%" +
                " for " + numOfYears + " years" +
                " will have a final worth of $" + finalValue);
    }
}