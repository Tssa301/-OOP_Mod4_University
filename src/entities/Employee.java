package entities;

public class Employee {

    private String name;
    private String position;
    private Integer hoursPerWeek;
    private Double valuePerHora;

    public Employee(){
    }

    public Employee(String name, String position, Integer hoursPerWeek, Double valuePerHora) {
        this.name = name;
        this.position = position;
        this.hoursPerWeek = hoursPerWeek;
        this.valuePerHora = valuePerHora;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(Integer hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public Double getValuePerHora() {
        return valuePerHora;
    }

    public void setValuePerHora(Double valuePerHora) {
        this.valuePerHora = valuePerHora;
    }

    public double payment(){
        return hoursPerWeek * valuePerHora * 4;
    }
}
