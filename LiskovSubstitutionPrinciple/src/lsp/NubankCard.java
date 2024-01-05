package lsp;

abstract public class NubankCard implements IPaymentInstrument{

    @Override
    public void collectPayment() {
        System.out.println("Pagamento Realizado");
    }

    @Override
    public void validate() throws Exception {
      //validação básica
    }
}
