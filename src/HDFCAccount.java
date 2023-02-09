import java.util.UUID;

public class HDFCAccount implements BankInterface {
    private String name;
    private String password;
    private int balance;
    private String accountNo;

    public HDFCAccount(String name, int balance,String password) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.accountNo = String.valueOf(UUID.randomUUID());
        this.rateOfInterest = 5.5;
    }

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

    public void setBalance(int balance) {
        this.balance = balance;
    }



    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    private double rateOfInterest;
    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String depositMoney(int amount) {
        this.balance += amount;
        return "Your account has been credited with " + amount;
    }

    @Override
    public String withdraw(int amount,String currentPassword) {
        if(currentPassword.equals(this.password)){
            if(this.balance < amount){
                return "You don't have enough amount in your accont";
            }else{
                this.balance -= amount;
                return "Your account has been debited with " + amount;
            }
        }else{
            return "Authentication Failed";
        }
    }

    @Override
    public double calculateInterest(int time) {
        return (this.balance * this.rateOfInterest * time) / 100.0;
    }
}
