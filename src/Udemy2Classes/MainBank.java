package Udemy2Classes;

public class MainBank {

    public static void main(String[] args) {

//        //// Setting without a constructor
//        Bank grootAccount = new Bank();

//        grootAccount.setNumber("12345");
//        grootAccount.setBalance(1000.00);
//        grootAccount.setCustomerName("Bob Brown");
//        grootAccount.setCustomerEmail("myemail@bob.com");
//        grootAccount.setCustomerPhone("(087) 123-4567");

//        // Setting with a constructor
        Bank grootAccount = new Bank("1234", 1000.00,
                "Groot Groot", "groot@groot","03429342432");

        grootAccount.withdrawFunds(100.0);
        grootAccount.depositFunds(250);
        grootAccount.withdrawFunds(50);

        grootAccount.withdrawFunds(200);

        grootAccount.depositFunds(100);
        grootAccount.withdrawFunds(45.55);
        grootAccount.withdrawFunds(54.46);

        grootAccount.withdrawFunds(54.45);

//        Bank bank = new Bank();
//
//        System.out.println(bank.getAmount());
//        bank.depositFunds(50);
//        System.out.println(bank.getAmount());
//        System.out.println(bank.withdrawFunds(50));
//        System.out.println(bank.getAmount());
//        System.out.println(bank.withdrawFunds(250));
//        System.out.println(bank.getAmount());
    }
}
