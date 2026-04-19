public class PaymentMethod {
    public static void main(String[] args)
    {
        CashPayment cashPayment = new CashPayment();
        cashPayment.pay(50);
        Upi upi = new Upi();
        upi.pay(100);
        CreditCard creditCard = new CreditCard();
        creditCard.pay(1000);

        

    }
}

interface Payment
{
    void pay(double amount);
}

class CashPayment implements Payment{
    public void pay(double amount)
    {
        System.out.println("Rupees "+amount+" is payed using Cash");
    }
}
class Upi implements Payment{
    public void pay(double amount)
    {
        System.out.println("Rupees "+amount+" is payed using UPI");
    }
}class CreditCard implements Payment
{
    public void pay(double amount)
    {
        System.out.println("Rupees "+amount+" is payed using CreditCard");
    }
}

