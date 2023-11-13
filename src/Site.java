public class Site {
    protected double TAX_RATE;
    protected double units;
    protected double rates;
    public Site(double u, double r) {
        TAX_RATE = 0.13;
        units = u;
        rates = r;
    }

    public double getBaseAmount() {
        return 0;
    }

    public double getTaxAmount()
    {
        return 0;
    }

    public double getBillableAmount()
    {
        return getBaseAmount() + getTaxAmount();
    }
}
