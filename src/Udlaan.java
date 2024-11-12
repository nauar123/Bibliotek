public class Udlaan {

    private Laaner laaner;
    private Eksemplar eksemplar;
    private Dato udlaansDato;


    public Udlaan()
    {}
    public Udlaan(Laaner l, Eksemplar e, Dato u)
    {
        laaner = l;
        eksemplar = e;
        udlaansDato = u;

    }


    public Laaner getLaaner()
    {
        return laaner;
    }

    public Eksemplar getEksemplar()
    {
        return eksemplar;
    }

    public Dato getUdlaansDato()
    {
        return udlaansDato;
    }
}

//datoen de har lånt låneren der har lånt og eksemplaret ved hjælp af stregkoden