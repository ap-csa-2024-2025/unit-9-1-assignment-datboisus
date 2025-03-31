public class SpecialtyCoffee extends Coffee
{
    private String flavor;

    public SpecialtyCoffee (String size, boolean isSkinny, int shots, String type, String flavor)
    {
        super (size, isSkinny, shots, type);
        this.flavor = flavor;

        public SpecialtyCoffee()
        {
            super("small",false, 1, "latte");
            flavor = "vanilla";
        }
    }
}