import java.util.Scanner;
import java.util.*;
public class Main{
  public static void main(String[] args){
    Product pen = new Product(0.20, 1, 20);
    Product stickyNotes = new Product(0.30, 2, 20);
    Product tape = new Product(0.50, 3, 20);
    Product folder = new Product(0.60, 4, 20);
    Product holePuncher = new Product(2, 5, 20);
    Product oneReam = new Product(3, 6, 20);
    Product tapeDispenser = new Product(4, 7, 20);
    Product stapler = new Product(5, 8, 20);
    Product calculator = new Product(6, 9, 20);
    Product twoReams = new Product(6, 10, 20);
    System.out.println("");
    System.out.println("");
    System.out.println("Thank You For Choosing The Michael Scott Paper Company as Your #1 Office Supply Shop!!");
    System.out.println("");
    System.out.println("If you want two of the same product, input the product twice.");
    System.out.println("");
    System.out.println("Seperate the Products With an Enter.");
    System.out.println("");
    System.out.println("Input done When You Are Done With Your Cart.");
    System.out.println("");
    System.out.println("1. Pen - $1");
    System.out.println("2. Sticky Notes - $2");
    System.out.println("3. Tape - $3");
    System.out.println("4. Folder - $4");
    System.out.println("5. Hole Puncher - $5");
    System.out.println("6. One Ream of Paper - $6");
    System.out.println("7. Tape Dispenser - $7");
    System.out.println("8. Stapler - $8");
    System.out.println("9. Calculator - $9");
    System.out.println("10. Two Reams of Paper -$10");
    System.out.println("");
    System.out.println("");

    String n;
    int amount;
    int quantity;
    ArrayList<String> addProduct = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    while (true) {
      System.out.println("Which Product Do You Wish For?(If you are done, write done.)");
      n = input.nextLine();
      if (n.equals("done")) {
        break;
      }
      else if (!(n.equals("pen")) && !(n.equals("sticky notes")) && !(n.equals("tape")) && !(n.equals("folder")) && !(n.equals("hole puncher")) && !(n.equals("one ream of paper")) && !(n.equals("tape dispenser")) &&!(n.equals("stapler")) && !(n.equals("calculator")) && !(n.equals("two reams of paper"))){
        System.out.println("Invalid Product. Please check your spelling and try again.");
      }
      addProduct.add(n);
    }
    String[] nums = new String[addProduct.size()];
    for (int i = 0; i < addProduct.size(); i++) {
      nums[i] = addProduct.get(i);
    }
    int price = 0;
    for (int i = 0; i < nums.length; i++){
      if(nums[i].equals("pen")){
        int j = pen.getsellPrice();
        price = price + j;
      }
      else if(nums[i].equals("sticky notes")){
        int j = stickyNotes.getsellPrice();
        price = price + j;
      }
      else if(nums[i].equals("tape")){
        int j = tape.getsellPrice();
        price = price + j;
      }
      else if(nums[i].equals("folder")){
        int j = folder.getsellPrice();
        price = price + j;
      }
      else if(nums[i].equals("hole puncher")){
        int j = holePuncher.getsellPrice();
        price = price + j;
      }
      else if(nums[i].equals("one ream of paper")){
        int j = oneReam.getsellPrice();
        price = price + j;
      }
      else if(nums[i].equals("tape dispenser")){
        int j = tapeDispenser.getsellPrice();
        price = price + j;
      }
      else if(nums[i].equals("stapler")){
        int j = stapler.getsellPrice();
        price = price + j;
      }
      else if(nums[i].equals("two reams of paper")){
        int j = twoReams.getsellPrice();
        price = price + j;
      }
      else{
        int j = calculator.getsellPrice();
        price = price + j;
      }
    }
    System.out.println("Your Total Price: $" + price + ".00");
  }
}
