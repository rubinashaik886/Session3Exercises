public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish

        String shirtPrice, taxRate, gibberish;
        shirtPrice = "15";
        taxRate = "0.05";
        gibberish = "0303jjdjdjd020";


        //Parse shirtPrice and taxRate, and print the total tax

        int shirtPrice1 = Integer.parseInt(shirtPrice);
        double taxRate1 = Double.parseDouble(taxRate);
        double totalPrice;
        totalPrice = shirtPrice1 * taxRate1;

        //Try to parse taxRate as an int

        //Try to parse gibberish as an int

    }

}
