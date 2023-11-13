public class LifelineSite extends Site{
    public LifelineSite()
    {
        super(30,18);
    }

    @Override
    public double getBaseAmount() {
        return this.units * this.rates * 0.5;
    }

    @Override
    public double getTaxAmount() {
        return this.getBaseAmount() * super.TAX_RATE * 0.2;
    }
}
