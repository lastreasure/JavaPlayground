package Udemy2Classes;
public class Bank {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Bank() {
        //constructor chaining - using another constructor from another constructor
        // must be first line that's called
        this("1234", 2.50, "default name", "default email",
                "342342");
        System.out.println("empty constructor called");
    }

    // constructor overloading
    public Bank (String number, double balance, String customerName, String email, String phone) {
        System.out.println("Bank constructor with params called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phone;

    }

    public Bank(String customerName, String customerEmail, String customerPhone) {
        // adding default options
        this("99999", 100.55, customerName, customerEmail, customerPhone);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhone = customerPhone;
    }

    public void depositFunds(double depositAmount) {

        balance += depositAmount;
        System.out.println("Deposit of £" + depositAmount + " made. New balance is £" +
                balance);
    }

    public void withdrawFunds(double withdrawalAmount) {

        if (balance - withdrawalAmount < 0) {
            System.out.println("Insufficient Funds! You only have £" + balance +
                    " in your account.");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of £" + withdrawalAmount +
                    " processed, Remaining balance = £" + balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}

//public class Bank {
//    private int amount = 200;
//
//    public int getAmount() {
//        return amount;
//    }
//
//    public void setAmount(int amount) {
//        this.amount = amount;
//    }
//
//    public void depositFunds(int depositAmount) {
//        this.amount += depositAmount;
//    }
//
//    public String withdrawFunds(int withdrawalAmount) {
//        if (this.amount - withdrawalAmount < 0) {
//            return "Insufficient funds";
//        } else {
//            this.amount -= withdrawalAmount;
//            return "Withdrawal success, new balance is: £" + this.amount;
//        }
//    }
//}
