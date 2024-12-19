
class Trainer extends Person {
    private String Speciality;
    private double salary;
    private Classes clase;

    public Trainer(int id, String name, String email, String phoneNumber, String speciality, double salary) {
        super(id, name, email, phoneNumber);
        this.Speciality = speciality;
        this.salary = salary;
    }


    public Classes getClase() {
        return clase;
    }

    public void setClase(Classes clase) {
        this.clase = clase;
    }
}