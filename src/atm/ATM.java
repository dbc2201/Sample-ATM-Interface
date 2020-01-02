package atm;

/**
 * This is an Interface for an ATM
 */
public interface ATM {
    // NOTE: Since all the methods that are declared inside an Interface in Java are
    // `public abstract` already (by default), we do not need to add any modifiers.

    /**
     * method: verifyPin, this method will verify the user's ATM PIN
     *
     * @param atmPin the ATM PIN of the user
     * @return whether or not the PIN was verified
     * Since this method is declared in an Interface, we do not need to give it a body
     * and we can end the declaration of the method with a semicolon.
     */
    boolean verifyPin(short atmPin);
}
