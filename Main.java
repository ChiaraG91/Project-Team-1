public class Main {
    public static void main(String[] args){
        String[] nomeCognomeStudenti = new String[6];

        System.out.println("Roccaldo Digrisolo");
        nomeCognomeStudenti[5] = "Ubaldo Capalbo";
        nomeCognomeStudenti[1] = "Agostino Arcadi";
        System.out.println("Chiara Giovoni");
        nomeCognomeStudenti[0] = "Chiara Giovoni";
        nomeCognomeStudenti[3] = "Roccaldo digrisolo";
        nomeCognomeStudenti[2] = "Gianluca Mulieddi";
        nomeCognomeStudenti[4] = "Giovanni Manuel Palumbo";
        for (String nomiCognomi : nomeCognomeStudenti) {
            System.out.println(nomiCognomi);
        }
        String[] dataNascitaStudenti = new String[5];

        dataNascitaStudenti[4] = "28/11/2003";
        dataNascitaStudenti[5] = "12/03/2000";
    }
}
