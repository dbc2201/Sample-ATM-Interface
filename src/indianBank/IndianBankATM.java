/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 02/01/20
 *   Time: 10:41 PM
 */

package indianBank;

import atm.ATM;

public class IndianBankATM implements ATM {

    // Since the IndianBankATM class is inehriting the ATM Interface, it
    // is compulsory for the class to override all the methods of the Interface,
    // as shown below.
    @Override
    public boolean verifyPin(short atmPin) {
        return false;
    }

    @Override
    public String selectAccount() {
        return null;
    }

    @Override
    public boolean withdraw(String account, double amount) {
        return false;
    }

    @Override
    public void display(String account, double amount, boolean success) {

    }

    @Override
    public void display(short pin, boolean success) {

    }

    @Override
    public void showBalance(String account) {

    }
}
