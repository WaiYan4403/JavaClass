public class BankAccount {
    int balance = 300;

    BankAccount(){

    }

    public void checkBalance(){
        System.out.print("Your balance is: $" + balance);
    }

    public void withdraw(int amount){
        balance -= amount;
    }

    public void deposit(int amount){
        balance += amount;
    }
}
