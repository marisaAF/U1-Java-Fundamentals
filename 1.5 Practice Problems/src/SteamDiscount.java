public class SteamDiscount {

    /*
    A game on Steam costs $60.00, but is currently on sale for 20% off. Create a program to display how much the game costs after the discount.
     */
    public static void main(String[] args) {

        double price = 60.00;
        double discount = price/100;
        double finalDiscount = price * 20;
        double finalPrice = 48;

        System.out.println("finalDiscount " + finalPrice);
    }
}