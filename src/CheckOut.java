import java.util.Scanner;


    public class CheckOut {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            double totalCost = 0.0;
            boolean moreItems = false;

            do {
                double price = 0.0;
                price = SafeInput.getRangedDouble(in, "What is the price of your item?", 00.50, 10.00);
                moreItems = SafeInput.getYNConfirm(in, "Do you have more items? [Y or N]");
                if (moreItems) {
                    totalCost = price + SafeInput.getRangedDouble(in, "What is the price of your item?", 00.50, 10.00);
                    moreItems = SafeInput.getYNConfirm(in, "Do you have more items? [Y or N]");
                } else {
                    totalCost = price;
                }
            } while (moreItems);
            System.out.printf("\nYour total is: $%.2f%n", totalCost);
        }
    }

