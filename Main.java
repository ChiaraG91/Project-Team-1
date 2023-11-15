public class Main {
    public static void main(String[] args){
        String[] nomeCognomeStudenti = new String[6];

        System.out.println("Roccaldo Digrisolo");
        System.out.println("Ubaldo Capalbo");
        nomeCognomeStudenti[1] = "Agostino Arcadi";
        System.out.println("Chiara Giovoni");
        nomeCognomeStudenti[0] = "Chiara Giovoni";
        nomeCognomeStudenti[3] = "Roccaldo digrisolo";
        nomeCognomeStudenti[2] = "Gianluca Mulieddi";
        for (String nomiCognomi : nomeCognomeStudenti) {
            System.out.println(nomiCognomi);
        }
    }
}
