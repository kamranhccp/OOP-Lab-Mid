/* ======= RUNNER/MAIN CLASS ========*/

package LabMidMain;
import java.util.Date;
import java.util.Scanner;
import static LabMidMain.Enchanted.*;

public class Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner Object

        // ORDERING SYSTEM CALLING for...
        int choice;
        // for ISLAMABAD Branch
        do {
            System.out.println("\n\n<==== ENCHANTED ICE-CREAM PARLOUR ====>");
            System.out.print("""
                Select Your Branch or Exit:
                  1: Islamabad.
                  2: Rawalpindi.
                  3: COMSATS.
                  4. Exit. 
                """ + ">>>CHOICE: ");
            choice = input.nextInt();
            switch (choice){
                case 1: {
                    System.out.println("\n<== Welcome to ENCHANTED, Islamabad ==>");
                    System.out.print(">>>Enter No. of Persons: ");
                    noOfPersons = input.nextInt();
                    if (noOfPersons > 3) {
                        System.out.println("Per Person Limits Exceeds! \nThankYou.");
                        System.exit(0);
                    }

                    Islamabad.islOrderSystem(); // Method for Dine-in/takeaway
                    Islamabad iec = new Islamabad();

                    for (int i = 0; i < noOfPersons; i++)
                    {
                        // flavour selection == Order in Progress...
                        orderPlacing();
                        // Display
                        iec.Display();
                    }

                    break;

                }


                // for RAWALPINDI
                case 2: {
                    System.out.println("\n<== Welcome to ENCHANTED, Rawalpindi ==>");
                    System.out.print("Enter No. of Persons: ");
                    noOfPersons = input.nextInt();
                    if (noOfPersons > 3) {
                        System.out.println("Per Person Limits Exceeds! \nThankYou.");
                        System.exit(0);
                    }

                    Rawalpindi.rwlOrderSystem();
                    Rawalpindi rec = new Rawalpindi();

                    for (int i = 0; i < noOfPersons; i++)
                    {
                        // flavour selection == Order in Progress...
                        orderPlacing();
                        // Display
                        rec.Display();
                    }
                    break;
                }


                // for COMSATS
                case 3: {
                    System.out.println("\n<== Welcome to ENCHANTED, COMSATS University ==>");
                    System.out.print("Enter No. of Persons: ");
                    noOfPersons = input.nextInt();
                    if (noOfPersons > 3) {
                        System.out.println("Per Person Limits Exceeds! \nThankYou.");
                        System.exit(0);
                    }

                    Comsats cec = new Comsats();
                    Comsats.cuiOrderSystem(); //dine-in

                    for (int i = 0; i < noOfPersons; i++)
                    {
                        // flavour selection == Order in Progress...
                        orderPlacing();
                        // Display
                        cec.Display();
                    }

                    break;
                }


                // for System Closed
                case 4: {
                    System.out.println(
                            """


                                    System Closed!
                                    ThankYou for using @kamran_hccp Products.
                                    Regards: Kamran Mansoor.""");
                    System.exit(0);
                }
            }
        } while (choice != 0);
    }
}



/* ======= ENCHANTED CLASS ========*/
//import java.util.Scanner;

class Enchanted {
    static String dineIn;
    static int flavour;
    static int totalOrderAllBranch;
    static int noOfPersons;
    static int orderID;
    static int totalCupsSold;
    public static String flvName;
    static int maxOrder = 3;
    static int minOrder = 1;
    public Enchanted(String dineIn, int flavour, int totalOrderAllBranch, int noOfPersons){
        Enchanted.dineIn = dineIn;
        Enchanted.flavour = flavour;
        Enchanted.totalOrderAllBranch = totalOrderAllBranch;
        Enchanted.noOfPersons = noOfPersons;
    }

    // constructor
    Enchanted(){

    }

    public static void setFlvName(String flvName) {
        Enchanted.flvName = flvName;
    }

    public void setMaxOrder(int maxOrder) {
        Enchanted.maxOrder = maxOrder;
    }

    public static int getTotalCupsSold() {
        return totalCupsSold;
    }

    public static void setTotalCupsSold(int totalCupsSold) {
        Enchanted.totalCupsSold = totalCupsSold;
    }

    public String isDineIn() {
        return dineIn;
    }


    public int getMaxOrder() {
        return maxOrder;
    }

    public static int getOrderID() {
        return orderID;
    }

    public static void setOrderID(int orderID) {
        Enchanted.orderID = orderID;
    }

    public void setDineIn(String dineIn) {
        Enchanted.dineIn = dineIn;
    }

    public int getFlavour() {
        return flavour;
    }

    public void setFlavour(int flavour) {
        Enchanted.flavour = flavour;
    }

    public int getTotalOrderAllBranch() {
        return totalOrderAllBranch;
    }

    public void setTotalOrderAllBranch(int totalOrderAllBranch) {
        Enchanted.totalOrderAllBranch = totalOrderAllBranch;
    }

    public int getNoOfPersons() {
        return noOfPersons;
    }

    public void setNoOfPersons(int noOfPersons) {
        Enchanted.noOfPersons = noOfPersons;
    }


    static Scanner input = new Scanner(System.in);
    public static String orderPlacing() {
        totalCupsSold++;

        System.out.print("""
                Flavour: 
                   1: Mango.
                   2. Strawberry.
                   3. Vanilla. 
                """ + ">>>Option(1/2/3): ");
        flavour = input.nextInt();

        if (flavour == 1) {
            System.out.println("Mango");
            flvName = "Mango";
        } else if (flavour == 2) {
            System.out.println("Strawberry");
            flvName = "Strawberry";
        } else if (flavour == 3) {
            System.out.println("Vanilla");
            flvName = "Vanilla";
        }
        return flvName;


    }

    private static void extraCups(){
        if (noOfPersons > minOrder) {
            // Maximum cups per Person == 3 Cups
            for (int x = 0; x > noOfPersons & noOfPersons <= maxOrder; x++){
                System.out.print("""
                Flavour: 
                   1: Mango.
                   2. Strawberry.
                   3. Vanilla. 
                """ + ">>>Option(1/2/3): ");
                flavour = input.nextInt();


            }
        }
    }

    public void Display(){
        System.out.println("<=== ENCHANTED Ice-Cream Parlour ===>" + "\n" +
                "Branch Name: " + "\n" +
                "Persons: " + noOfPersons + "\n" +
                "Flavour: " + flavour + "\n" +
                "Dine-in: " + dineIn);
    }



    // for dine-in
    public static void isDineTrue(){
        if (dineIn.equalsIgnoreCase("True")) {
            validation();
            System.out.println("Your order in Progress for Dine-in...");
        }
        // if takeaway == dine-in False
        else if (dineIn.equalsIgnoreCase("False")){
            validation();
            // okay = false; // for wrong input, it'll loop
            System.out.println("Your Order in Progress for Takeaway...");
        }
    }

    // Validation for true/false
    public static void validation() {
        while ((!dineIn.equalsIgnoreCase("true")) && (!dineIn.equalsIgnoreCase("false")))
        {
            // for DINE-In facility
            System.out.print("Wrong Input! Enter Again." + "\n"
                    + "  Do you Want to Dine-In(true/false): ");
            dineIn = input.nextLine();
        }
    }
}



/* ======= ISLAMABAD CLASS ========*/
//package LabMidMain;
//import java.util.Date;
//import java.util.Scanner;

class Islamabad extends Enchanted{
    public static String idtPrint;


    public Islamabad(String dineIn, int flavour, int totalOrderAllBranch, int noOfPersons) {
        super(dineIn, flavour, totalOrderAllBranch, noOfPersons);
    }

    Islamabad() {
        orderID++;
        totalOrderAllBranch++;
    }


    // flavours
    void getFlavourDetails(){
    }

    static Scanner input = new Scanner(System.in);

    static void islOrderSystem() {
        // for DINE-In facility
        System.out.print("Dine-in Available. " + "\n"
                + ">>>Do you Want to Dine-In(true/false): ");
        dineIn = input.nextLine();
        // if dine-in true
        // for DINE-In facility
        if (true) {
            isDineTrue();
        }

    }


    // date Constructor
    Date date = new Date();

    public void Display() {
        System.out.println(
                "<=============================================>" + "\n" +
                        "        ENCHANTED ORDER DETAILS" + "\n" +
                        "        _______________________" + "\n" +
                        "Order Placed: " + "\n" +
                        "   Order ID: " + orderID + "\n" +
                        "   Branch Name: " + "Enchanted ISLAMABAD Branch" + "\n" +
                        "   Total Persons: " + noOfPersons + "\n" +
                        "   Flavour: " + flvName + "\n" +
                        "   Dine-in: " + dineIn.toUpperCase() + "\n" +
                        "   Order Placed on: " + date.toString() + "\n\n" +
                        "   Total Orders for Today: " + totalOrderAllBranch + "\n" +
                        "   Total Cups Sold Today: " + totalCupsSold + "\n" +
                        "<=============================================>" + "\n");
    }


    // Dine-in/Takeaway Print Proper
    public static String dtPrint(){
        if (dineIn.equalsIgnoreCase("true")){
            System.out.println("Dine-in Selected at Enchanted.");
            idtPrint = "Dine-in Selected at Enchanted.";
        }
        else if (dineIn.equalsIgnoreCase("false")){
            System.out.println("Takeaway Selected from Enchanted.");
            idtPrint = "Takeaway Selected from Enchanted.";
        }
        return idtPrint;
    }
}




/* ======= RAWALPINDI CLASS ========*/
//package LabMidMain;
//        import java.util.Date;
//        import java.util.Scanner;

class Rawalpindi extends Enchanted{
    private static String getFlavourDetails;
    public static String rdtPrint;
    int noOfOrderPindi;

    public Rawalpindi(String dineIn, int flavour, int totalOrderAllBranch,
                      int noOfPersons, int noOfOrderPindi) {
        super(dineIn, flavour, totalOrderAllBranch, noOfPersons);
        this.noOfOrderPindi = noOfOrderPindi;
    }

    Rawalpindi() {
        orderID++;
        totalOrderAllBranch++;
    }

    Date date = new Date(); // for date

    static Scanner input = new Scanner(System.in);
    static void rwlOrderSystem(){
        System.out.println("Sorry! We are Closed for Dine-in. \n" +
                "Only Takeaway."); // No dine-in facility for Rawalpindi Branch

    }


    // flavours == never used method> Practise
    void getFlavourDetails(){
        if (flavour == 1){
            System.out.println("Mango");
        }
        else if (flavour == 2){
            System.out.println("Strawberry");
        }
        else if (flavour == 3){
            System.out.println("Vanilla");
        }
    }


    public void Display() {
        System.out.println(
                "<=============================================>" + "\n" +
                        "        ENCHANTED ORDER DETAILS" + "\n" +
                        "        _______________________" + "\n" +
                        "Order Placed: " + "\n" +
                        "   Order ID: " + orderID + "\n" +
                        "   Branch Name: " + "Enchanted RAWALPINDI Branch" + "\n" +
                        "   Total Persons: " + noOfPersons + "\n" +
                        "   Flavour: " + flvName + "\n" +
                        "   Order Placed on: " + date.toString() + "\n\n" +
                        "   Total Orders for Today: " + totalOrderAllBranch + "\n" +
                        "   Total Cups Sold Today: " + totalCupsSold + "\n" +
                        "<=============================================>" + "\n");
    }


    // LOGIC::Dine-in/Takeaway Print Proper
    public static String dtPrint(){
        if (dineIn.equalsIgnoreCase("true")){

            // HERE>>>:: String rdtPrint = ("Dine-in Selected at Enchanted.");
        }
        else if (dineIn.equalsIgnoreCase("false")){
            String rdtPrint = ("Takeaway Selected from Enchanted.");
        }
        return rdtPrint;
    }
}



/* ======= COMSATS CLASS ========*/
//package LabMidMain;
//        import java.util.Scanner;
//        import java.util.Date;

class Comsats extends Enchanted{
    private static String cdtPrint;
    private String openingDiscount = "with Chocolate Mix";
    private static String getFlavourDetails;
    static int noOfOrderCui;

    public Comsats(String dineIn, int flavour, int totalOrderAllBranch,
                   int noOfPersons, int noOfOrderCui) {
        super(dineIn, flavour, totalOrderAllBranch, noOfPersons);
        Comsats.noOfOrderCui = noOfOrderCui;
    }

    Comsats() {
        orderID++;
        totalOrderAllBranch++;
    }

    static Scanner input = new Scanner(System.in); // for input
    Date date = new Date(); // for date

    static void cuiOrderSystem(){
        // for DINE-In facility
        System.out.print("Dine-in Available. " + "\n" +
                "Do you Want to Dine-In(true/false): ");
        dineIn = input.nextLine();


        // if dine-in true
        if (true){
            isDineTrue();
        }

    }

    public static String getGetFlavourDetails() {
        return getFlavourDetails;
    }

    public static void setGetFlavourDetails(String getFlavourDetails) {
        Comsats.getFlavourDetails = getFlavourDetails;
    }


    // flavours == never used method> Practise
    void getFlavourDetails(){
        if (flavour == 1){
            System.out.println("Mango with Chocolate Mix");
        }
        else if (flavour == 2){
            System.out.println("Strawberry with Chocolate Mix");
        }
        else if (flavour == 3){
            System.out.println("Vanilla with Chocolate Mix");
        }
    }


    public void Display() {
        System.out.println(
                "<=============================================>" + "\n" +
                        "        ENCHANTED ORDER DETAILS" + "\n" +
                        "        _______________________" + "\n" +
                        "Order Placed: " + "\n" +
                        "   Order ID: " + orderID + "\n" +
                        "   Branch Name: " + "Enchanted COMSATS Branch" + "\n" +
                        "   Total Persons: " + noOfPersons + "\n" +
                        "   Flavour: " + flvName + " " + getOpeningDiscount() + "\n" +
                        "   Dine-in: " + dineIn.toUpperCase() + "\n" +
                        "   Order Placed on: " + date.toString() + "\n\n" +
                        "   Total Orders for Today: " + totalOrderAllBranch + "\n" +
                        "   Total Cups Sold Today: " + totalCupsSold + "\n" +
                        "<=============================================>" + "\n");
    }

    public String getOpeningDiscount() {
        return openingDiscount;
    }

    public void setOpeningDiscount(String openingDiscount) {
        this.openingDiscount = openingDiscount;
    }


    // Dine-in/Takeaway Print Proper
    public static String dtPrint(){
        if (dineIn.equalsIgnoreCase("true")){
            System.out.println("Dine-in Selected at Enchanted.");
            cdtPrint = "Dine-in Selected at Enchanted.";
        }
        else if (dineIn.equalsIgnoreCase("false")){
            System.out.println("Takeaway Selected from Enchanted.");
            cdtPrint = "Takeaway Selected from Enchanted.";
        }
        return cdtPrint;
    }
}


