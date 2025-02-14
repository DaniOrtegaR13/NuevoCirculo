package es.uah.matcomp.mp.e1.ejerciciosclases.e1a.Account;
//1.6.

public class ClaseAccount {

    private String id;

    private String name;

    private int balance;


// Como me está dando dos perosnas distintas en el ejemplo, necesito tener dos informaciones disitnas entonces:

    public ClaseAccount(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public ClaseAccount(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        // Add amount to balance, return balance
        balance = balance + amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Amount exceed balance");
        }
        return balance;
    }

    // espera

    public int transferTo(ClaseAccount another, int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            another.balance += amount;

        } else {
            System.out.println("Amount exceeded balance");

        }
        return balance;
    }
        public String toString () {
            return "ClaseAccount[id = " + id + " name = " + name + " balance = " + balance + " ]";
        }
    }




