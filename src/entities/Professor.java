package entities;

public class Professor extends Employee{

    public Professor(String name, String position, Integer hoursPerWeek, Double valuePerHora) {
        super(name, position, hoursPerWeek, valuePerHora);
    }

    //a salary complement is added in the fixed amount of €100.00
    @Override
    public double payment() {
        return super.payment() + 100.0;
    }
}
