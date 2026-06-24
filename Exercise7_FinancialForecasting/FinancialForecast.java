public class FinancialForecast {
    
    
    static double predictValue(double amount, double rate, int yearsLeft) {
        
        // base case - no more years to calculate
        if (yearsLeft == 0) {
            return amount;
        }
        
        
        double grownAmount = amount + (amount * rate / 100);
        return predictValue(grownAmount, rate, yearsLeft - 1);
    }
    
    public static void main(String[] args) {
        
        double investment = 10000;
        double growthRate = 8;   
        int totalYears = 5;
        
        double finalAmount = predictValue(investment, growthRate, totalYears);
        
        System.out.println("Starting investment: Rs." + investment);
        System.out.println("Growth rate per year: " + growthRate + "%");
        System.out.println("Number of years: " + totalYears);
        System.out.println("Final amount after " + totalYears + " years: Rs." + Math.round(finalAmount));
    }
}