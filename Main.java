import java.util.Scanner;
/**
 *
 * @author Erkam
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     final int SMALL_PIZZA = 10;
     final int MEDIUM_PIZZA = 20;
     final int LARGE_PIZZA = 40;
     
     
     System.out.println("Enter Cm");
     int Cm =input.nextInt();
     
      if (Cm >= SMALL_PIZZA ) {
     System.out.println("We are going to make you a cute little pizza! And it will be 7.47");
  
     } else if (Cm >= MEDIUM_PIZZA ) {
     System.out.println("This will be delicious and it will be 13.32");
    } else 
    System.out.println("“Whoa, big pizza! You might need a truck to get this home!");
    
    

     
     
    




  }
}
