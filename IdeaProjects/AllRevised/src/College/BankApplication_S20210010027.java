package College;
class Account{
    private long accountNumber;
    private String accountName;
    private String password;
    private float balance;
    private boolean login;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void creation(long accountNumber, String accountName, String password) {
         setAccountNumber(accountNumber);
         setAccountName(accountName);
         setPassword(password);
         setBalance(0.0f);
    }

    public void login(long accountNumber, String password){
        if(getAccountNumber() != accountNumber){
            System.out.println("Invalid account number!");
            this.login = false;
            return;
        } else{
            if(getPassword().compareTo(password) != 0){
                System.out.println("Invalid password!");
                this.login = false;
                return;
            }
        }
        this.login = true;
    }

    public float balanceCheck(){
        if(this.login){
            return getBalance();
        } else return 0.0f;
    }

    public void credit(float amount){
        if(this.login) this.balance += amount;
        else return;
    }
    public void debit(float amount){
        if(this.login)this.balance -= amount;
        else return;
    }

    public void printAccountDetails(){
        if(this.login){
            System.out.println("Account name:   "+getAccountName());
            System.out.println("Account number: "+getAccountNumber());
            System.out.println("Balance:        "+getBalance());
        } else return;
    }
}

public class BankApplication_S20210010027{
    public static void main(String[] args){
        // 3 users, input hard coded
        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();

        account1.creation(001, "Anushthan", "2001");
        account2.creation(002, "Nikunj", "2004");
        account3.creation(003, "Raj", "2002");

        account1.login(001, "2001");
        account2.login(002, "2004");
        account3.login(003, "2002");

        account1.credit(22000);
        account2.credit(20000);
        account3.credit(10000);

        account1.printAccountDetails();
        account2.printAccountDetails();
        account3.printAccountDetails();

        account1.debit(3000);
        account1.printAccountDetails();
    }
}