public class Account {
    private double balance;

    public Account(double balance){
        if(balance > 0){
            this.balance = balance;
        }
    }

    public double getBalance(){
        return balance;
    }

    public boolean deposit(double amt){
        if(amt > 0){
            this.balance += amt;
            return true;
        } else return false;
        
    }

    public boolean withdraw(double amt){
        if(this.balance < amt){
            return false;
        }else{
        this.balance -= amt;
        return true;
        }
    }
}
