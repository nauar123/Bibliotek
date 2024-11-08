public class Eksemplar {


    private int udgivelsesAar;
    private int antalEksemplar = 0;
    private int stregKode;

    public Eksemplar()
    {}


    public Eksemplar(int udAar, int antalE, int stregK)
    {
        udgivelsesAar = udAar;
        antalEksemplar = antalE;
        stregKode = stregK;
    }

    public int getudgivelsesAar()
    {
        return udgivelsesAar;
    }

    public int getAntalEksemplar()
    {
        return antalEksemplar;
    }

    public int getStregKode()
    {
        return stregKode;
    }

}
