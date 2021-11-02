public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        double salaryMultiplier = (daysSkipped>5) ?.85:1;
        return salaryMultiplier;
    }

    public int multiplierPerProductsSold(int productsSold) {
        int productMultiplier = (productsSold>20)?13:10;
        return productMultiplier;
    }

    public double bonusForProductSold(int productsSold) {
        return productsSold * multiplierPerProductsSold(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = 1000*multiplierPerDaysSkipped(daysSkipped)+bonusForProductSold(productsSold);
        if(salary>2000) return 2000;
        else return salary;
    } 
}
