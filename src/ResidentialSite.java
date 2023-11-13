public class ResidentialSite extends Site{
    public ResidentialSite()
    {
        super(10, 20);
    }

    @Override
    public double getBaseAmount() {
        return this.units * this.rates;
    }

    @Override
    public double getTaxAmount() {
        return this.getBaseAmount() * super.TAX_RATE;
    }
}
