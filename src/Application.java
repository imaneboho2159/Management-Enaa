import java.util.Scanner;
import java.util.ArrayList;


public  class Application {

    ArrayList<Student>student= new ArrayList<>();
    ArrayList<Trainer>trainer =new ArrayList<>();
    Scanner scanner= new Scanner(System.in);
    Student students = new Student();
    Trainer trainers =new Trainer();
    ClassRoom classRooms = new ClassRoom();


    public static void main(String[] args) {
        Application application = new Application();
        application.ManagementAap();


    }

    public  void ManagementAap() {

        System.out.println("\n=== Menu Principal ===");
        System.out.println("1. Management Student");
        System.out.println("2. Management Trainer");
        System.out.println("3. Management Class");
        System.out.println("0. Get out");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        while (choice!=0) {
            switch (choice) {
                case 1:
                    MenuStudent();
                    break;
                case 2:
                    MenuTrainer();
                    break;
                case 3:

                    MenuClassRoom();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Choice invalid!");
            }
        }
    }

    public void MenuStudent() {
        int choice=1;
        while (choice!=0) {
            System.out.println("\n=== Management of students  ===");
            System.out.println("1. Add student");
            System.out.println("2. Display students");
            System.out.println("3. Update student");
            System.out.println("4. Delete student");
            System.out.println("0. Get out");
            System.out.print("Enter  choice: ");
            Scanner scanner = new Scanner(System.in);
            try{
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {

                    case 1:
                        students.addStudent();
                        break;
                    case 2:
                        students.displayStudent();
                        break;
                    case 3:
                        students.updateStudent();
                        break;
                    case 4:
                        students.deleteStudent();
                        break;
                    case 0: return;
                    default:
                        System.out.println("choice invalid!");
                }}
            catch (Exception e){
                scanner.nextLine();
                System.out.println("Error: Invalid input!.");
            }
        }
    }

    public void MenuTrainer() {
        int choice=1;
        while (choice!=0) {
            System.out.println("\n=== Management of Trainer  ===");
            System.out.println("1. Add Trainer");
            System.out.println("2. Display Trainer");
            System.out.println("3. Update Trainer");
            System.out.println("4. Delete Trainer");
            System.out.println("0. Get out");

            System.out.print("Enter  choice: ");
            Scanner scanner = new Scanner(System.in);
            try{
                 choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        trainers.addTrainer();
                        break;
                    case 2:
                        trainers.displayTrainer();
                        break;
                    case 3:
                        trainers.updateTrainer();
                        break;
                    case 4:
                        trainers.deleteTrainer();
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("choice invalid!");
                }}
            catch (Exception e){
                scanner.nextLine();
                System.out.println("Error: Invalid input!.");
            }
        }
    }

    public void MenuClassRoom() {
        int choice=1;

        while (choice!=0) {
            System.out.println("\n=== Management of Classes ===");
            System.out.println("1. Add Class");
            System.out.println("2. Display Class");
            System.out.println("3. Update Class");
            System.out.println("4. Delete Class");
            System.out.println("0. Get out");
            System.out.print("Enter  choice: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    classRooms.addClassRoom();
                    break;
                case 2:
                    classRooms.displayClassRoom();
                    break;
                case 3:
                    classRooms.updateClassRoom();
                    break;
                case 4:
                    classRooms.deleteClassRoom();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("choice invalid!");
            }
        }

    }}