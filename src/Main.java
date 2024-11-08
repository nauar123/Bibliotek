public class Main {
    public static void main(String[] args) {


        Eksemplar eksemplar = new Eksemplar(); // man skal skrive eksemplar og ikke Eksemplar nedenunder. Ellers får man problemer med static og non static.
        // Eksemplar er nemlig en klasse og er static.

        eksemplar.getudgivelsesAar();
        eksemplar.getudgivelsesAar();
        eksemplar.getStregKode();






        }
    }
