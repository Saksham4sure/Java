package threads;

class Bank {
    int balance = 0;

    public void deposit() {
        balance = balance + 100;
    }
}

class BankDeposit extends Thread {
    Bank bank = new Bank();

    public void run() {
        bank.deposit();
    }
}
