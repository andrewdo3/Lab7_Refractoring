public class ResidentialSite extends Site{
    public ResidentialSite()
    {
        super(10, 20);
    }

    public double getBillableAmount()
    {
        double base = units * rates;
        double tax = base * TAX_RATE;
        return base + tax;
    }

}
