public class Debt {
    private Double balance;
    private Double interestRate;

    public  Debt (double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }

    public void printBalance() {
        System.out.println(balance);
        
    }

    public void waitOneYear(){
        this.balance *= interestRate;
    }


}
