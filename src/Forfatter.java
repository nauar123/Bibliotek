public class Forfatter extends Person {

    protected String nationalitet;

    public Forfatter()
    {}
    public Forfatter( String navn, String nationalitet)
    {
        super(navn);
        this.nationalitet = nationalitet;

    }

    public String getNationalitet()
    {
        return nationalitet;
    }

}
