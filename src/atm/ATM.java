package atm;

/**
 * This is an Interface for an ATM
 */
public interface ATM {
    // NOTE: Since all the methods that are declared inside an Interface in Java are
    // `public abstract` already (by default), we do not need to add any modifiers.

    /**
     * method: verifyPin, this method will verify the user's ATM PIN     *
     *
     * @param atmPin the ATM PIN of the user
     * @return whether or not the PIN was verified
     * Since this method is declared in an Interface, we do not need to give it a body
     * and we can end the declaration of the method with a semicolon.
     */
    boolean verifyPin(short atmPin);

    /**
     * method: selectAccount, this method will select a Bank Account (probably from the database)
     *
     * @return A String representation of the selected Account's object or empty string if nothing
     * selected
     */
    String selectAccount();

    /**
     * method: withdraw, this method will allow the user to withdraw money from their account
     *
     * @param account is the account from which the transaction is to be done
     * @param amount  is the total amount that is to be withdrawn
     * @return whether or not this transaction was successful
     */
    boolean withdraw(String account, double amount);

    /**
     * method: display, this method will display the result of an operation
     *
     * @param account is the account from which the transaction is to be done
     * @param amount  is the amount of money
     * @param success whether or not the operation was successful
     */
    void display(String account, double amount, boolean success);
}
