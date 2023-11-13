public class LifelineSite extends Site{

    private double units;
    private double rates;
    public LifelineSite()
    {
        super();
    }

    public double getBillableAmount()
    {
        double base = units * rates * 0.5;
        double tax = base * TAX_RATE * 0.2;
        return base + tax;
    }
}
