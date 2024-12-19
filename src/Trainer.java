

public class trainer extends Person {
    private int trainerName;
    private Double salary;
    private Classes Tclass;


    public trainer(int id, String firstName, String lastName, int age, String email, String phoneNumber, int trainer, Double salary,Classes Tclass) {
        super(id, firstName, lastName, age, email, phoneNumber);
        this.trainer = trainer;
        this.salary = salary;
        this.Tclass = Tclass;

    }

    @Override
    void add() {

    }

    @Override
    void remove() {

    }

    @Override
    void display() {

    }

    @Override
    void update() {

    }
}

