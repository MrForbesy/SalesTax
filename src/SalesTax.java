public class SalesTax
{
    public static void main(String[] args)
    {
        double purchasePrice = 180;
        double SALES_TAX = .05;
        double totalPrice = purchasePrice + (purchasePrice * SALES_TAX);

        System.out.println("Your purchase price is " + purchasePrice + " and your sales tax is " + SALES_TAX + ". Your total is " + totalPrice);



    }
}