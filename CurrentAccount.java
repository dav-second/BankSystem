public class CurrentAccount implements Accounts {
    private int pin;

    private int accountNumber;
//GETTER and setters
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPin() {
        return pin;
    }

    @Override
    public boolean withdrawl() {
        return false;
    }

    @Override
    public boolean deposit() {
        return false;
    }

    @Override
    public void createpin(int pin) {

    }

    @Override
    public void editPin(int newpin) {

    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public CurrentAccount(int pin, int accountNumber) {
        this.pin = pin;
        this.accountNumber = accountNumber;
    }
}
