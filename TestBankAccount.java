class BankAccount{
    long accNo;
    int balance;
int amt;
BankAccount(int amt){
        this.amt=amt;
}
    void depositAmt(int amt){
        balance=balance+amt;
        System.out.println(balance);
                         }


    void withdrawAmt(int amt){
        if (balance<0){
        System.out.println("insuffient balance");
                         }
        

        else{
        balance=balance-amt;
        System.out.println(balance);
        }
}
}
public class TestBankAccount{
public static void main(String[] args){
       BankAccount a1=new BankAccount(5000);
       BankAccount a2=new BankAccount(500);
       a1.balance=5000;
       a2.balance=500;
       a1.depositAmt(15000);
       a2.withdrawAmt(300);
       }

}
