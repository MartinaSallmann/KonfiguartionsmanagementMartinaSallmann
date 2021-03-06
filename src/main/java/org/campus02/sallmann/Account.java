/*
Name: Martina Sallmann
e-mail: s52113445@edu.campus02.at

 */


package org.campus02.sallmann;

public class Account {
    private String owner;
    private double amount;

    public Account(String accountOwner) {
        this.owner = accountOwner;

        amount = 100.0;

    }

    public double credit(double value) {

        if (amount < value){
            amount = amount + value;
        }

        return amount;
    }

    public boolean debit (double value) {
        /* Diese Methode überprüft, ob der Wert vollständig abgebucht werden kann.
            ja: Wenn ja, wird der Wert abgebucht und true retourniert.
            nein: Wenn der Betrag nicht vollständig abgebucht werden kann,
                wird der verfügbare Betrag nicht geändert und false retourniert. */



        if (amount > value) {

            amount = amount - value;
            return true;
        }else if (amount - value == 0){
            return true;
        }
        else {
            amount = amount - value;
            return false;
        }
    }

    public String getOwner() {
        return owner;
    }

    public double getAmount() {
        return amount;
    }
}
