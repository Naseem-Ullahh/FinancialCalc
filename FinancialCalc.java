class FinancialCalc {

    // V = P * (1 + I)^Y
    public static double computeFinalValue(double principal, double interestRate, int numOfYears) {
        return principal * Math.pow(1 + interestRate, numOfYears);
    }

    // P = V / (1 + I)^Y
    public static double computePrincipal(double finalValue, double interestRate, double numOfYears) {
        return finalValue / Math.pow(1 + interestRate, numOfYears);
    }

    // I = (V / P)^(1/Y) - 1
    public static double computeInterestRate(double principal, double finalValue, double numOfYears) {
        return Math.pow(finalValue / principal, 1.0 / numOfYears) - 1;
    }

    // Y = ln(V / P) / ln(1 + I)   (result is not necessarily an integer)
    public static double computeYears(double principal, double finalValue, double interestRate) {
        return Math.log(finalValue / principal) / Math.log(1 + interestRate);
    }

    public static void main(String[] args) {
        // Original demo (Task 2 output preserved)
        double principal = 1000.00;
        double interestRate = 0.035;
        int numOfYears = 7;
        double finalValue = computeFinalValue(principal, interestRate, numOfYears);

        System.out.println("Investing $" + principal +
                " at an interest rate of " + (interestRate * 100) + "%" +
                " for " + numOfYears + " years" +
                " will have a final worth of $" + finalValue);

        System.out.println();

        // 1. Principal needed: 5% rate, $1000 after 4 years
        double p = computePrincipal(1000.00, 0.05, 4);
        System.out.printf("1. Invest $%.2f today at 5%% to have $1000.00 in 4 years.%n", p);

        // 2. Interest rate needed: $500 -> $525 in 3 years
        double i = computeInterestRate(500.00, 525.00, 3);
        System.out.printf("2. You need an interest rate of %.2f%% to turn $500.00 into $525.00 in 3 years.%n", i * 100);

        // 3. Years needed: $100 -> $150 at 4.4%
        double y = computeYears(100.00, 150.00, 0.044);
        System.out.printf("3. You need %.2f years to turn $100.00 into $150.00 at 4.4%%.%n", y);
    }
}