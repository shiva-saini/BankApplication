import java.util.UUID;

public class SBIAccount implements BankInterface{
    private String name;
    private String password;
    private String accountNo;
    private int balance;
    private double rateOfInterest;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public SBIAccount(String name,int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.rateOfInterest = 6.5;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String depositMoney(int amount) {
        this.balance += amount;
        return "Your account is credited with" + amount + " Current balance is " + this.balance;
    }

    @Override
    public String withdraw(int amount,String currentPassword) {
        if(currentPassword.equals(this.password)){
            if(this.balance < amount){
                return "Not enough balance to withdraw";
            }
            this.balance -= amount;
            return "Your account is debited with " + amount + " Current balance is " + this.balance;
        }else{
            return "Authentication Failed";
        }

    }

    @Override
    public double calculateInterest(int time) {
        return (balance * time * rateOfInterest) / 100.0;
    }
}
