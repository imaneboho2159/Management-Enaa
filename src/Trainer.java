import java.util.ArrayList;
import java.util.Scanner;

public class Trainer extends Person {
    private String Speciality;
    private Double Salary;
    ArrayList<Trainer> trainer = new ArrayList<>();

    public Trainer(int id, String name, String email, String phoneNumber, String speciality, Double salary) {
        super(id, name, email, phoneNumber);
        Speciality = speciality;
        Salary = salary;
    }

    public Trainer() {

    }


    public String getSpeciality() {
        return Speciality;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public void setTrainer(ArrayList<Trainer> trainer) {
        this.trainer = trainer;
    }

    public ArrayList<Trainer> getTrainer() {
        return trainer;
    }

    public void addTrainer(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Trainer ID: ");
        this.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Enter Trainer name: ");
        this.setName(scanner.nextLine());
        System.out.print("Enter Trainer email: ");
        this.setEmail(scanner.nextLine());
        System.out.print("Enter Trainer phone number: ");
        this.setPhoneNumber(scanner.nextLine());
        System.out.print("Enter Trainer Speciality :");
        this.setSpeciality(scanner.nextLine());
        System.out.print("Enter Trainer Salary :");
        this.setSalary(scanner.nextDouble());
        scanner.nextLine();
        Trainer trainers = new Trainer(this.getId(), this.getName(), this.getEmail(), this.getPhoneNumber(),this.getSpeciality(),this.getSalary());
        trainer.add(trainers);
        System.out.print(" Trainer added  ");

    }
    public void displayTrainer(){
        if (trainer.isEmpty()){
            System.out.println("No students found");
            return;
        }
        System.out.println("\n List of students: ");
        for (int i = 0; i < trainer.size(); i++){
            System.out.println("-----------------------------------");
            System.out.println("Student ID: " + trainer.get(i).getId());
            System.out.println("Student Name: " + trainer.get(i).getName());
            System.out.println("Student Email: " + trainer.get(i).getEmail());
            System.out.println("Student Phone Number: " + trainer.get(i).getPhoneNumber());

        }
    }


    public void updateTrainer() {
        Scanner scanner = new Scanner(System.in);

        if(trainer.isEmpty()) {
            System.out.println("No trainer found!");
            return;
        }

        System.out.print("Enter trainer ID for updating: ");
        this.setId(scanner.nextInt());
        scanner.nextLine();

        for(int i = 0; i < trainer.size(); i++) {
            if(trainer.get(i).getId() == this.getId()) {
                System.out.print("Enter new Trainer name: ");
                String newName = scanner.nextLine();

                System.out.print("Enter new Trainer email: ");
                String newEmail = scanner.nextLine();

                System.out.print("Enter new phone number: ");
                String newPhoneNumber = scanner.nextLine();

                System.out.print("Enter new Salary :");
                Double newSalary =scanner.nextDouble();



                trainer.get(i).setName(newName);
                trainer.get(i).setEmail(newEmail);
                trainer.get(i).setPhoneNumber(newPhoneNumber);
                trainer.get(i).setSalary(newSalary);

                System.out.println("Trainer information has been updated successfully!");
                return;
            }
        }

        System.out.println("Trainer not found!");
    }
    public void deleteTrainer(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID to delete: ");
        this.setId(scanner.nextInt());
        for(int i=0; i< trainer.size(); i++){
            if(trainer.get(i).getId() == this.getId()){
                trainer.remove(i);
                System.out.println("Student deleted  ");
                return;

            }
        }
        System.out.print("\n Student not found ! ");
    }


}
