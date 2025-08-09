package bank;

public class banking {
    private int accNo;
    private float balance;
    private int pin;

    // Account Number
    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    // Balance
    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    // PIN
    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    // Verify account credentials
    public boolean verifyAccount(int accNo, int pin) {
        return (this.accNo == accNo && this.pin == pin);
    }
}
