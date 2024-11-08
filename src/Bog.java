public class Bog {


    private String genre;
    private String titel;
    private int aarstal;

    public Bog()
    {}

    public Bog(String g, String t, int aarsT)
    {
        genre = g;
        titel = t;
        aarstal = aarsT;
    }

    public String getGenre()
    {
      return genre;
    }

    public String getTitel()
    {
        return titel;
    }

    public int getAarstal()
    {
        return aarstal;
    }
}
