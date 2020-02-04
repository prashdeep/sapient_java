public class PaymentGatewayClient {
    public static void main(String[] args) {

        PaymentGateway gateway = new GooglePay();

        if (args[0].equals("1")){
            gateway = new GooglePay();
        }else {
            gateway = new Paytm();

        }
        gateway.pay("Kiram", "Vinay", 20000, "transfering money");
    }
}