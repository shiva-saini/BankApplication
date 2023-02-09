public interface BankInterface {
     int getBalance();
     String depositMoney(int amount);

     String withdraw(int amount,String currentPassword);
     double calculateInterest(int time);
}
