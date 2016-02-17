//Michael McAteer
//hw02
//Arithmetic Calculations

public class Arithmetic {
    public static void main (String[] args) {
    double paSalesTax=.06; //PA tax rate
    //Number of items
    int numPants=3; //Number of pairs of pants
    int numShirts=2; //Number of shirts
    int numBelts=1; //Number of belts
    //Cost of items
    double pantsPrice=34.98; //Cost per pair of pants
    double shirtPrice=24.99; //Cost of shirt
    double beltPrice=33.99; //Cost of belt
    //Declaring variables
    double totalCostofPants, totalCostofSweatshirts, totalCostofBelts; //total cost of items before sales tax
    double pantsSalesTax, sweatshirtsSalesTax, beltsSalesTax; //total cost of sales tax on each item
    double totalSalestax; //Sales tax on all purchases
    double totalCostofPurchase; //Cost of entire purchase
    double purchaseWithTax; //Purchase cost including tax
    //Calculations for pants
    totalCostofPants=numPants*pantsPrice; //total cost of pants
    pantsSalesTax=paSalesTax*totalCostofPants; //total sales tax on pants
    //Calculations for sweatshirts
    totalCostofSweatshirts=numShirts*shirtPrice;  //total cost of sweatshirts
    sweatshirtsSalesTax=paSalesTax*totalCostofSweatshirts; //total sales tax on sweatshirts
    //Calculations for belts
    totalCostofBelts=numBelts*beltPrice; //total cost of belts
    beltsSalesTax=paSalesTax*totalCostofBelts; //total sales tax on belts
    //Total sales tax for transaction
    totalSalestax=pantsSalesTax+sweatshirtsSalesTax+beltsSalesTax;
    //Total cost of transaction before tax calculation
    totalCostofPurchase=totalCostofBelts+totalCostofSweatshirts+totalCostofBelts;
    //Total cost of transaction after tax calculation
    purchaseWithTax=totalCostofPurchase+totalSalestax;
    //Print out cost of each item
    System.out.println("Total cost of pants is " +totalCostofPants+ " dollars"); 
    System.out.println("Total cost of sweatshirts is "+totalCostofSweatshirts+" dollars");
    System.out.println("Total cost of belts is "+totalCostofBelts+" dollars");
    //Print out sales tax on each item
    System.out.println("Total sales tax on pants is "+pantsSalesTax+" dollars");
    System.out.println("Total sales tax on sweatshirts is "+sweatshirtsSalesTax+" dollars");
    System.out.println("Total sales tax on belts is "+beltsSalesTax+" dollars");
    //Print out total sales tax of entire transaction
    System.out.println("Total sales tax of purchaes is "+totalSalestax+" dollars");
    //Print out cost of transaction before tax
    System.out.println("Total cost of purchase before tax is "+totalCostofPurchase+" dollars");
    //Print out total cost of transaction cost after tax
    System.out.println("Total cost of purchase including tax is "+purchaseWithTax+" dollars");
    }
}
    