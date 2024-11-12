public class Eksemplar {


    private Bog bog;
    private int stregKode;

    public Eksemplar()
    {}


    public Eksemplar( Bog b, int stregK)
    {
        bog = b;
        stregKode = stregK;
    }


    public Bog getBog()
    {
        return bog;
    }
    public int getStregKode()
    {
        return stregKode;
    }

}
