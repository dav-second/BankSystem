public interface Accounts {

    public int getAccountNumber();

    public void setAccountNumber(int accountNumber);

    public int getPin();

    public boolean withdrawl();

    public boolean deposit();

    public void createpin(int pin);

    public void editPin(int newpin);


}
