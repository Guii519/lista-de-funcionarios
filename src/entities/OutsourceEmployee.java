package entities;

public class OutsourceEmployee extends Employee {
    private Double additionalCharge;

    public OutsourceEmployee() {
        super();
    }

    public OutsourceEmployee(String name, Integer hour, Double valuePerHour, Double additionalCharge) {
        super(name, hour, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(String name, int hours, Double additionalCharge, double charge) {
        this.additionalCharge = additionalCharge;
    }
    @Override
    public double payment() {
        return super.payment() + ((additionalCharge * 110)/100);
    }
}
