public class LifelineSite extends Site{
    public LifelineSite()
    {
        super(30,18);
    }

    public double getBillableAmount()
    {
        double base = units * rates * 0.5;
        double tax = base * TAX_RATE;
        return base + tax;
    }
}
