public class Customer extends Person {

    int customerID;

    private int accountNumber;

    //getter and setter
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Customer(int customerID) {
        super();
        this.customerID = customerID;
    }

}
