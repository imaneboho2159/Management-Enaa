import java.util.Scanner;
import java.util.ArrayList;


public class Main {
 public static void main(String[] args) {
     class Application {
         private  ArrayList<Student> student = new ArrayList<>();
         private ArrayList<Trainer> trainer = new ArrayList<>();
         private  ArrayList<Classes> classes = new ArrayList<>();
         private  Scanner scanner = new Scanner(System.in);

         public  void  ManagementAap(){
                 System.out.println("\n=== Menu Principal ===");
                 System.out.println("1. Management Student");
                 System.out.println("2. Management Trainer");
                 System.out.println("3. Management Class");
                 System.out.println("0. Get out");
                 System.out.print("Enter choice: ");
                 int choice = scanner.nextInt();

             while (true) {
                 switch (choice) {
                     case 1:
                         MenuApprenant();
                         break;
                     case 2:
                         MenuFormateur();
                         break;
                     case 3:

                         MenuClasse();
                         break;
                     case 0:
                         System.out.println("Goodbye!");
                         return;
                     default:
                         System.out.println("Choice invalid!");
                 }
             }
         }


     }

}}