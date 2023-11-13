public class ResidentialSite extends Site{

    private double units;
    private double rates;
    public ResidentialSite()
    {
        super();
    }

    public double getBillableAmount()
    {
        double base = units * rates;
        double tax = base * TAX_RATE;
        return base + tax;
    }

}
