public class Main {
    public static void main(String[] args) {

        Forfatter mah = new Forfatter("Martin A. Hansen", "Dansk");
        Bog loegneren = new Bog("Løgneren",mah,1950);
        Eksemplar l1 = new Eksemplar(loegneren,123456);

        Laaner poul = new Laaner("Poul Thorsen", "Hirtshals", "pt@gmail.com",new CprNr("1206522129"));
        Udlaan u1 = new Udlaan(poul, l1, new Dato(20241108));

        System.out.println("Forfatter til udlån: "+u1.getEksemplar().getBog().getForfatter().getNavn());


    }
    }
