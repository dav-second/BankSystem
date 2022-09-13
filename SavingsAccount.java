public class SavingsAccount implements Accounts{


    private int pin;

    private int accountNumber;

    @Override
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

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public SavingsAccount(int pin){
        this.pin = pin;
    }

}
