package project_1_mcdonalddarin;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Project_1_McDonaldDarin {

    public static void main(String[] args) 
    {
        DecimalFormat fmt = new DecimalFormat("0.0");
        
        Scanner scanner = new Scanner(System.in);
        Double input;
        
        //////////////
        //The Bricks//
        //////////////
        
        //Enter the length of a brick
        double bLength = 8;
        System.out.println("The current brick length is "+ fmt.format(bLength)+" inches");
        
        //Enter the width of a brick
        double bWidth = 4;
        System.out.println("The current brick width is "+fmt.format(bWidth)+" inches");
        
         System.out.println("");
        
        //Get total of square inches (ex. 8 x 4 = 32)
        double sqInch = bLength * bWidth;
        System.out.println("The brick is " + fmt.format(sqInch) + " sq inches");
          
        
        // Divide the total square inches into 144 (total number of inches in a square foot)
        // Example 144/32(total brick square inches) = 4.5 bricks
        double numBricks = 144/sqInch;
        System.out.println("Out of one square foot you will need 8" + fmt.format(numBricks)+ " bricks.");
        
        System.out.println("");
        
        //Enter the cost of the brick ($6 - 10/50 per square foot)
        double bCost = 6;
        System.out.println("Assuming the brick cost is $"+fmt.format(bCost)+ "...");
        
        double bTotal = numBricks * bCost;
        
        System.out.println("One square foot will cost you: $"+fmt.format(bTotal));
        
        
        ///////////////////////
        //Area of the project//
        ///////////////////////
        System.out.println("");
        
        //Enter the length of the space in Square Feet
        double spaceLength = 10; 
        System.out.println("The length of the building project is " + fmt.format(spaceLength) + " sq feet");
        
        //Enter the width of the space in Square Feet
        double spaceWidth = 12;
        System.out.println("The width of the building project is " + fmt.format(spaceWidth) + " sq feet");
        
        //Calculate total square footage of space (ex. 10 x 12 = 120 square feet)
        double spaceSqFeet = spaceLength * spaceWidth;
        System.out.println("The total space is " + fmt.format(spaceSqFeet) + " sq feet");
        
        
        System.out.println("");
        
        //Take total space square footage and multply by number of bricks in squre foot 
        //(ex. 120 x 4.5 = 540 bricks)
        double overagePercent = 0.05;
        double totalBricks = spaceSqFeet * numBricks; 
        double totalBricksPercent = totalBricks * overagePercent;
        
        double totalBricksOverage = totalBricks + totalBricksPercent;
   
        System.out.println("To cover an area of "+spaceSqFeet+" sq ft you will need "+totalBricks+" bricks in total");
        
        totalBricks = totalBricksOverage;
        
        //Display total bricks with and without the overage vaule
        System.out.println("In case of damaged bricks you should buy "+totalBricks+" bricks");
        
        System.out.println("");
        
        bTotal = totalBricks * bCost;
        
        //Display total cost
        System.out.println("The total cost of bricks including overage comes to $"+bTotal);

        System.out.println("");
        
        //////////////
        //Mortar Mix//
        //////////////
        
        //Divide to the total number of bricks by 30 to estimate how many 60lb bags of mortar mix you need.
        double mortarBags = totalBricks/30;
        System.out.println("You will need "+mortarBags+" bags of 60 pound mortar mix for "+totalBricks+" bricks");
        
        //Round this figure up to the nearest whole number before making your purchase
        ///// TO DO //////////
        
        //Enter the cost of a bag
        double bagCost = 6;
        System.out.println("Assuming the bag cost is $"+fmt.format(bagCost)+ "...");
        
        //Display total cost (bags x cost ex. $6)
        double mortarTotal = mortarBags * bagCost;
        System.out.println("All together you will need $"+fmt.format(mortarTotal)+" worth of mortar mix");
      
        
        ///////////////////
        //Arch Calculator//
        ///////////////////
        
        ///// TO DO //////////
       
    }
    
}
