import java.util.Scanner;
    public class FavNumbers
    {
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            int fav = 0;
            double favDouble = 0;

            fav = SafeInput.getInt(in, "Enter your favorite integer");
            favDouble = SafeInput.getDouble(in, "Enter your favorite double");
            System.out.println("Your favorite integer is " + fav + " and your favorite double is " + favDouble);
        }
    }

