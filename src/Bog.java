import java.util.ArrayList;

public class Bog {



    private String titel;
    private Forfatter forfatter;
    private int udgivelsesAar;

    public Bog()
    {}


    public Bog(String ti, Forfatter f, int u)
    {
        titel = ti;
        forfatter = f;
        udgivelsesAar = u;
    }

    public String getTitel()
    {
      return titel;
    }

    public Forfatter getForfatter()
    {
        return forfatter;
    }

    public int getUdgivelsesAar()
    {
        return udgivelsesAar;
    }


}
