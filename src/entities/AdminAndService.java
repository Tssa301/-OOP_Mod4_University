package entities;

public class AdminAndService extends Employee{

    private Double totalOvertime;

    public AdminAndService(String name, String position, Integer hoursPerWeek, Double valuePerHora, Double totalOvertime) {
        super(name, position, hoursPerWeek, valuePerHora);
        this.totalOvertime = totalOvertime;
    }

    public Double getTotalOvertime() {
        return totalOvertime;
    }

    public void setTotalOvertime(Double totalOvertime) {
        this.totalOvertime = totalOvertime;
    }

    //Calculation of overtime. Base value for overtime - 6.00 euros/hour.
    @Override
    public double payment() {
        double overtime = totalOvertime * 6.0;
        return super.payment() + overtime;
    }
}
