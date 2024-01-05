package lsp;

public class MainPayment {
    public static void main(String[] args) throws Exception {

        //CreditCard creditCard = new CreditCard();
        //DebitCard debitCard = new DebitCard();
        NubankRewards rewards = new NubankRewards();


        rewards.validate();
        rewards.collectPayment();
    }
}