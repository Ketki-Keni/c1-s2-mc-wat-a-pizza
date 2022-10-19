public class PizzaOrder {
    public static void main(String[] args){

        // Task #1
        String customerName = "Gray" ;
        String customerEmail =  "gary@123.com";
        long phoneNo = 412312345L;
        String address = "20, Marble Drive, Eville";
        int noOfPizzasOrdered = 5;
        float pizzaPriceIn$ = 12.5f;
        char pizzaSize = 'M';
        int noOfGarlicBreadOrdered = 3;
        float garlicBreadPriceIn$ = 5.99f;
        int noOfBeveragesOrdered = 3;
        float beveragePriceIn$ = 1.99f;

        System.out.println("----------------------");
        System.out.println("   Customer Details   ");
        System.out.println("----------------------");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Customer Phone Number : " + phoneNo);
        System.out.println("Customer email : " + customerEmail);
        System.out.println("Customer Address : " + address);
        System.out.println();
        System.out.println();
        System.out.println();

        // Task #2
        System.out.println("--------------------");
        System.out.println("   Order Summary   ");
        System.out.println("--------------------");
        System.out.println();
        System.out.println("Sr no. \t ItemName \t\t ItemQuantity \t $Price/Unit \t $TotalPrice");
        System.out.println("----------------------------------------------------------------------");
        float totalPriceOfPizzasOrdered = pizzaPriceIn$ * noOfPizzasOrdered;
        System.out.println("1 \t\t Pizza \t\t\t\t " + noOfPizzasOrdered + "\t\t\t\t" + pizzaPriceIn$ + "\t\t\t" + totalPriceOfPizzasOrdered );
        float totalPriceOfGarlicBreadOrdered = garlicBreadPriceIn$ * noOfGarlicBreadOrdered;
        System.out.println("2 \t\t Garlic Bread \t\t " + noOfGarlicBreadOrdered + "\t\t\t\t" + garlicBreadPriceIn$ + "\t\t\t" + totalPriceOfGarlicBreadOrdered);
        float totalPriceOfBeveragesOrdered = beveragePriceIn$ * noOfBeveragesOrdered;
        System.out.println("3 \t\t Beverages \t\t\t " + noOfBeveragesOrdered + "\t\t\t\t" + beveragePriceIn$ + "\t\t\t" + totalPriceOfBeveragesOrdered);
        System.out.println("----------------------------------------------------------------------");

        // Task #3
        float totalBillAmount = totalPriceOfPizzasOrdered + totalPriceOfGarlicBreadOrdered + totalPriceOfBeveragesOrdered;
        System.out.println("Total Bill Amount : $" + totalBillAmount);
        boolean isTotalBillGreaterThan100 = totalBillAmount >= 100 ? true:false;
        //System.out.println(isTotalBillGreaterThan100);

        // Task #4
        int discountInPercent = 10;
        float discount = 10/100f;
        float discountAmount = totalBillAmount * discount;
        System.out.println("Discount offered : " + discountInPercent + "%");
        Float amountToPay = totalBillAmount - discountAmount;
        System.out.println("Amount to be paid : " + amountToPay);
        System.out.println("----------------------------Thank You---------------------------------");
    }
}
