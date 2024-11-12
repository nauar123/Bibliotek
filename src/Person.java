public abstract class Person {

    protected String Navn;

    public Person() {}

    public Person(String navn)
    {
        this.Navn = navn;
    }

    public String getNavn()
    {
        return Navn;
    }
}
