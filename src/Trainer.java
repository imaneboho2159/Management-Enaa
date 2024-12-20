import java.util.ArrayList;
import java.util.Scanner;

class Trainer extends Person {
    private String Speciality;
    private double salary;
    private Classes clase;
    Trainer trainer= new Trainer();
    private ArrayList<Trainer>trainers= new ArrayList<>();

    public Trainer(int id, String name, String email, String phoneNumber) {
        super(id, name, email, phoneNumber);
        this.Speciality = Speciality;
        this.salary = 0;
    }



    public Trainer(int id, String name, String email, String phoneNumber, String speciality, Double salary) {
        super(id, name, email, phoneNumber);
    }

    public Trainer() {

    }


    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Classes getClase() {
        return clase;
    }

    public void setClase(Classes clase) {
        this.clase = clase;
    }
    public void addTrainer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter trainer ID: ");
        this.setId(scanner.nextInt());
        System.out.print("Enter trainer  name: ");
        this.setName(scanner.nextLine());
        System.out.print("Enter trainer email: ");
        this.setEmail(scanner.nextLine());
        System.out.print("Enter trainer phone number: ");
        this.setPhoneNumber(scanner.nextLine());
        System.out.print("Enter trainer Speciality: ");
        this.setSpeciality(scanner.nextLine());
        System.out.print("Enter trainer salary: ");
        this.setSalary(scanner.nextDouble());
        Trainer trainer = new Trainer(this.getId(), this.getName(), this.getEmail(), this.getPhoneNumber(),this.getSpeciality(),this.getSalary());
        System.out.print(" Trainer added  ");
    }
    public void displayTrainer() {
        if (trainers.isEmpty()){
            System.out.println("No Trainer found");
            return;
        }
        System.out.println("\n List of trainers : ");
        for (int i = 0; i < trainers.size(); i++){
            System.out.println("-----------------------------------");
            System.out.println("Trainer ID: " + trainers.get(i).getId());
            System.out.println("Trainer Name: " + trainers.get(i).getName());
            System.out.println("Trainer Email: " + trainers.get(i).getEmail());
            System.out.println("Trainer Phone Number: " + trainers.get(i).getPhoneNumber());
            System.out.println("Trainer Speciality: " + trainers.get(i).getSpeciality());
            System.out.println("Trainer Salary: " + trainers.get(i).getSalary());

        }

    }

    public void updateTrainer(){
        Scanner scanner = new Scanner(System.in);
        if(trainers.isEmpty()){
            System.out.print("no trainer found ! ");
            return;
        }

        for(int i=0; i< trainers.size(); i++){
            if(trainer.getId() == this.getId()){

                System.out.print("\n Trainer name: " + trainers.get(i).getName() );
                System.out.print("\n Trainer email: " + trainers.get(i).getEmail() );
                System.out.print("\n Trainer phone number: " + trainers.get(i).getPhoneNumber() );
                System.out.print("\n Trainer Speciality: " + trainers.get(i).getSpeciality() );
                System.out.print("\n Trainer Salary: " + trainers.get(i).getSalary());
                System.out.print("\n Trainer is updated " );
                return;
            }

        }
        System.out.print("\n Trainer not found ! ");
    }
    public void deleteTrainer (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter trainer ID to delete: ");
        this.setId(scanner.nextInt());
        for(int i=0; i< trainers.size(); i++){
            if(trainers.get(i).getId() == this.getId()){
                trainers.remove(i);
                System.out.println("Trainer deleted  ");
                return;

            }
        }
        System.out.print("\n Trainer not found ! ");
    }

}