package csc251_group3;
import java.text.DecimalFormat;
import java.util.Scanner;


public class CSC251_Group3 {

    public static void main(String[] args) 
    {
       mainMenu();
    }
    
    public static void mainMenu()
    {
        //The main loop
        int endLoop = 0; //Keeps the program in a loop
        
        while(endLoop !=1){
            
            //Scanner for user input
            Scanner keyboard = new Scanner(System.in); 

            System.out.print("//Header//");
            System.out.print("\n(1)Bricks \n(2)Project Area \n(3)Mortar Mix \n(4)Concete Arch \n(5)Run All \n(6)Exit \nPlease enter an option: ");

            int input = keyboard.nextInt();

            switch(input){
                case 1:
                    getBricks();
                    System.out.println("");
                    break;
                case 2:
                    getProjectArea();
                    System.out.println("");
                    break;
                case 3:
                    getMortarMix();
                    System.out.println("");
                    break;
                case 4:
                    getConcreteArch();
                    break;
                case 5:
                    runAll();
                    System.out.println("");
                    break;
                case 6:
                    endLoop = 1 ; //End loop
                    System.out.print("Good bye! \n");
                    break;
                default:
                    System.out.println("This is an incorrect input. Try again! \n");
                    break;
                    
            }
            
        }
        
    }
    
    
    public static void getBricks()
    {
        //Formating for decimals
        DecimalFormat normalFormat = new DecimalFormat("0.0");
        DecimalFormat moneyFormat = new DecimalFormat("0.00");
        
        
        System.out.println("");

        //Scanner for user input
        Scanner keyboard = new Scanner(System.in);
        Double input;
        
  
        //Enter the length of a brick
        double bLength = 8;
        
        System.out.print("Please enter the length of the brick in inches: ");
        bLength = keyboard.nextDouble();
        
        //Enter the width of a brick
        double bWidth = 4;
        
        System.out.print("Please enter the width of the brick in inches: ");
        bWidth = keyboard.nextDouble();
        

        //Get total of square inches (ex. 8 x 4 = 32)
        double sqInch = bLength * bWidth;
        System.out.println("The brick is " + normalFormat.format(sqInch) + " sq inches");
        
        
        // Divide the total square inches into 144 (total number of inches in a square foot)
        // Example 144/32(total brick square inches) = 4.5 bricks
        double numBricks = 144/sqInch;
        System.out.println("Out of one square foot you will need " +normalFormat.format(numBricks)+ " bricks.");
        
        System.out.println("");
        
        //Enter the cost of the brick ($6 - 10/50 per square foot)
        
        double bCost;
        System.out.print("Please enter the cost of a single brick: $");
        bCost = keyboard.nextDouble();
        
        System.out.println("Assuming the brick cost is $"+moneyFormat.format(bCost)+ "...");
        
        double bTotal = numBricks * bCost;
        
        System.out.println("One square foot will cost you: $"+moneyFormat.format(bTotal)   );
        
    }
    
    public static void getProjectArea()
    {
        //Formating for decimals
        DecimalFormat normalFormat = new DecimalFormat("0.0");
        DecimalFormat moneyFormat = new DecimalFormat("0.00");
        
        System.out.println("");

        //Scanner for user input
        Scanner keyboard = new Scanner(System.in);
        Double input;
        
        //Enter the length of the space in feet
        double spaceLength; 
        System.out.print("Please enter the length of building project in ft: ");
        spaceLength = keyboard.nextDouble();
        
        
        //Enter the width of the space in feet
        double spaceWidth;
        System.out.print("Please enter the width of building project in ft: ");
        spaceWidth = keyboard.nextDouble();
        
        //Calculate total square footage of space (ex. 10 x 12 = 120 square feet)
        double spaceSqFeet = spaceLength * spaceWidth;
        System.out.println("The total space is " +spaceSqFeet+ " sq feet");
        
        
        System.out.println("");
        
        //Take total space square footage and multply by number of bricks in squre foot 
        //(ex. 120 x 4.5 = 540 bricks)
        
        
        double numBricks; 
        
        System.out.print("How many bricks in a sq foot do you need?: ");
        numBricks = keyboard.nextDouble();
 
        double bCost;
        
        System.out.print("Please enter the cost of a single brick: $");
        bCost = keyboard.nextDouble();
        
        
        double bTotal = numBricks * bCost;
        
        double overagePercent = 0.05;
        double totalBricks = spaceSqFeet * numBricks; 
        double totalBricksPercent = totalBricks * overagePercent;
        
        double totalBricksOverage = totalBricks + totalBricksPercent;
   
        System.out.println("To cover an area of "+spaceSqFeet+" sq ft you will need "+normalFormat.format(totalBricks)+" bricks in total");
        
        totalBricks = totalBricksOverage;
        
        //Display total bricks with and without the overage vaule
        System.out.println("In case of damaged bricks you should buy "+normalFormat.format(totalBricks)+" bricks");
        
        System.out.println("");
        
        bTotal = totalBricks * bCost;
        
        //Display total cost
        System.out.println("The total cost of bricks including overage comes to $"+moneyFormat.format(bTotal));

        System.out.println("");
    }
    
    public static void getMortarMix()
    {
       //Formating for decimals
       DecimalFormat normalFormat = new DecimalFormat("0.0");
       DecimalFormat moneyFormat = new DecimalFormat("0.00");
       
       System.out.println("");
       
        Scanner keyboard = new Scanner(System.in);
        Double input;
        
        
       double totalBricks; 
          
       System.out.print("How many bricks in total is your project?: ");
       totalBricks = keyboard.nextDouble();
        
       
       //Divide to the total number of bricks by 30 to estimate how many 60lb bags of mortar mix you need.
       int mortarBags = (int)totalBricks/30;
        
        //Round this figure up to the nearest whole number before making your purchase
        //mortarBags++; 
        //!!Doesn't work for divisible numbers!!///
        
        System.out.println("You will need "+mortarBags+" bags of 60 pound mortar mix for "+totalBricks+" bricks");
        
        
        //Enter the cost of a bag
        double bagCost;
        System.out.print("How much does a 60lb bag cost?: $");
        bagCost = keyboard.nextDouble();

        System.out.println("Assuming the bag cost is $"+moneyFormat.format(bagCost)+ "...");
        
        //Display total cost (bags x cost ex. $6)
        double mortarTotal = mortarBags * bagCost;
        System.out.println("All together you will need $"+moneyFormat.format(mortarTotal)+" worth of mortar mix");  
    }
    
    public static void getConcreteArch()
    {
        //Formating for decimals
        DecimalFormat normalFormat = new DecimalFormat("0.0");
        DecimalFormat moneyFormat = new DecimalFormat("0.00");
        
        System.out.println("");

        //Scanner for user input
        Scanner keyboard = new Scanner(System.in);
        Double input;
        
        //Enter the span of the arch in feet
        double archSpan; 
        System.out.print("Please enter the span of the arch in ft: ");
        archSpan = keyboard.nextDouble();
        
        //Enter the height of the arch in feet
        double archHeight; 
        System.out.print("Please enter the height of the arch in ft: ");
        archHeight = keyboard.nextDouble();
        
        //Enter the thickness of the arch in feet
        double archThickness; 
        System.out.print("Please enter the thickness of the arch in ft: ");
        archThickness = keyboard.nextDouble();
        
        //Enter the breadth of the arch in feet
        double archBreadth; 
        System.out.print("Please enter the breadth of the arch in ft: ");
        archBreadth = keyboard.nextDouble();
        
        //Enter the central angle of the arch in degrees
        double archAngle; 
        System.out.print("Please enter the central angle of the arch in degrees: ");
        archAngle = keyboard.nextDouble();
        
        //Calculate the cross-section of the arch
        double archCrossSection = archThickness * archBreadth;
        
        //Calculate the radius of the arch
        double archRadius = (((archSpan / 2) * (archSpan / 2)) + 
                (archHeight * archHeight)) / (2 * archHeight);
        
        //Calculate the length of the arch
        double archLength = (archAngle * Math.PI * archRadius) / 180;
        
        //Calculate the volume of the arch
        double archVolume = archCrossSection * archLength;
        System.out.println("The total quantity of materials in the arch is "
                + moneyFormat.format (archVolume) +" cubic ft");
        
        //Display the typical yield from a 60 pound bag of concrete
        System.out.println("One 60lb bag of pre-mix concrete yields 0.45 cubic ft");
        
        //Calculate the number of bags of pre-mix concrete needed for the arch
        double concreteBagsRaw = archVolume / .45;
        int concreteBags = (int) concreteBagsRaw;
        
        System.out.println("You will need " + concreteBags + " bags of concrete for this concrete arch");
        
        //Enter the cost of a bag
        double bagCost;
        System.out.print("How much does a 60lb bag cost?: $");
        bagCost = keyboard.nextDouble();

        System.out.println("Assuming the bag cost is $"+moneyFormat.format(bagCost)+ "...");
        
        //Display total cost (bags x cost ex. $6)
        double concreteTotal = concreteBags * bagCost;
        System.out.println("All together you will need $"+moneyFormat.format(concreteTotal)+" worth of concrete mix");
    }
    
    public static void runAll()
    {
        //Formating for decimals
        DecimalFormat normalFormat = new DecimalFormat("0.0");
        DecimalFormat moneyFormat = new DecimalFormat("0.00");
        
        
        System.out.println("");

        //Scanner for user input
        Scanner keyboard = new Scanner(System.in);
        Double input;
        
  
        //Enter the length of a brick
        double bLength = 8;
        
        System.out.print("Please enter the length of the brick in inches: ");
        bLength = keyboard.nextDouble();
        
        //Enter the width of a brick
        double bWidth = 4;
        
        System.out.print("Please enter the width of the brick in inches: ");
        bWidth = keyboard.nextDouble();
        

        //Get total of square inches (ex. 8 x 4 = 32)
        double sqInch = bLength * bWidth;
        System.out.println("The brick is " + normalFormat.format(sqInch) + " sq inches");
        
        
        // Divide the total square inches into 144 (total number of inches in a square foot)
        // Example 144/32(total brick square inches) = 4.5 bricks
        double numBricks = 144/sqInch;
        System.out.println("Out of one square foot you will need " +normalFormat.format(numBricks)+ " bricks.");
        
        System.out.println("");
        
        //Enter the cost of the brick ($6 - 10/50 per square foot)
        
        double bCost;
        System.out.print("Please enter the cost of a single brick: $");
        bCost = keyboard.nextDouble();
        
        System.out.println("Assuming the brick cost is $"+moneyFormat.format(bCost)+ "...");
        
        double bTotal = numBricks * bCost;
        
        System.out.println("One square foot will cost you: $"+moneyFormat.format(bTotal)   );
        
        System.out.println("");

        //Enter the length of the space in feet
        double spaceLength; 
        System.out.print("Please enter the length of building project in ft: ");
        spaceLength = keyboard.nextDouble();
        
        
        //Enter the width of the space in feet
        double spaceWidth;
        System.out.print("Please enter the width of building project in ft: ");
        spaceWidth = keyboard.nextDouble();
        
        //Calculate total square footage of space (ex. 10 x 12 = 120 square feet)
        double spaceSqFeet = spaceLength * spaceWidth;
        System.out.println("The total space is " +spaceSqFeet+ " sq feet");
        
        
        System.out.println("");
        
        //Take total space square footage and multply by number of bricks in squre foot 
        //(ex. 120 x 4.5 = 540 bricks)
              
        
        bTotal = numBricks * bCost;
        
        double overagePercent = 0.05;
        double totalBricks = spaceSqFeet * numBricks; 
        double totalBricksPercent = totalBricks * overagePercent;
        
        double totalBricksOverage = totalBricks + totalBricksPercent;
   
        System.out.println("To cover an area of "+spaceSqFeet+" sq ft you will need "+normalFormat.format(totalBricks)+" bricks in total");
        
        totalBricks = totalBricksOverage;
        
        //Display total bricks with and without the overage vaule
        System.out.println("In case of damaged bricks you should buy "+normalFormat.format(totalBricks)+" bricks");
        
        System.out.println("");
        
        bTotal = totalBricks * bCost;
        
        //Display total cost
        System.out.println("The total cost of bricks including overage comes to $"+moneyFormat.format(bTotal));

        System.out.println("");
        
             
        //Divide to the total number of bricks by 30 to estimate how many 60lb bags of mortar mix you need.
        int mortarBags = (int)totalBricks/30;
        
        //Round this figure up to the nearest whole number before making your purchase
        //mortarBags++; 
        //!!Doesn't work for divisible numbers!!///
        
        System.out.println("You will need "+mortarBags+" bags of 60 pound mortar mix for "+totalBricks+" bricks");
        
        
        //Enter the cost of a bag
        double bagCost;
        System.out.print("How much does a 60lb bag cost?: ");
        bagCost = keyboard.nextDouble();

        System.out.println("Assuming the bag cost is $"+moneyFormat.format(bagCost)+ "...");
        
        //Display total cost (bags x cost ex. $6)
        double mortarTotal = mortarBags * bagCost;
        System.out.println("All together you will need $"+moneyFormat.format(mortarTotal)+" worth of mortar mix");
        
         System.out.println("");
    }
    
}
