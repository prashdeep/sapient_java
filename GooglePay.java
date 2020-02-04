public class GooglePay implements PaymentGateway {

    public  void pay(String from, String to, double amount, String comments){
        System.out.println("Paid "+amount+" from "+from+" to : "+to+ " comments: "+comments +" : using Google Pay");
    }
    
    public  void acceptPayment(String from, String to, double amount){
        System.out.println("Accepting Payment from "+from +" to "+to+" amount : "+amount);
    }
}