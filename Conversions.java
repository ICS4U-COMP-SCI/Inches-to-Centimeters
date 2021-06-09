import java.util.Scanner;

public class methodsAssignment {
  
  //method for centimeters to inches
  static void cmToin(){ //George Contribution
    
    //defining the variables used
    double centimeter, inches;
    System.out.println("How many centimeters? ");
    Scanner input = new Scanner (System.in);
    
    //define centimeter as the next user input. double since they can be decimal values
    centimeter = input.nextDouble();
    //define inches as the division of centimeters by 2.54 to make the conversion
    inches = centimeter/2.54;
    
    //output the conversion result
    System.out.println("The length in inches is " + inches + "in");
  }
  static void inTocm() {  //Rzez Contribution
    
    double centimeter, inches;
    System.out.println("How many inches? ");
    Scanner input = new Scanner (System.in);
    inches = input.nextDouble();
    
    //define centimeter as the multiplication of inches by 2.54
    centimeter = inches*2.54;
    
    //output the result of the conversion
    System.out.println("The length in centimeters is " + centimeter + "cm");
   
  }      



public static void main(String[] args) { //Both of us worked on this, worked on it on call so work was evenly distributed
    
    //define the selection for user to choose which conversion they want
    int selection;
    

    //add the scanner for user input
    Scanner input = new Scanner (System.in);
    
    
    //options for user's conversions
    System.out.println("What conversion would you like to make?");
    System.out.println("1.)Centimeters to Inches");
    System.out.println("2.)Inches to Centimeter");
   
    
    //define the selection int as a user input
    selection = input.nextInt();
    
    
    //switch case for all the user's possible choices
    switch(selection) {
      case 1:
        //call the appropriate method per case
        cmToin();
        break;
      case 2:
        inTocm();
        break;

      }
    }
  }
