package PackControl;

public class TestParking {
    public static void main(String[] args) {

        Vehicule[] v = new Vehicule[4];

        v[0] = new Voiture("A-1-A", "Dacia", 5);
        v[1] = new Voiture("B-2-B", "Audi", 3);
        v[2] = new Moto("C-3-C", "Honda", true);
        v[3] = new Camion("D-4-D", "Mercedes", 18.5);

        System.out.println(" Tous les véhicules : ");
        for (int i = 0; i < v.length; i++) {
            v[i].afficher();
            v[i].stationner();
            System.out.println();
        }

        System.out.println(" Uniquement les voitures : ");
        for (int i = 0; i < v.length; i++) {
            if (v[i] instanceof Voiture) {
                v[i].afficher();
                v[i].stationner();
                System.out.println();
            }
        }

        System.out.println("Test downcasting");
        Vehicule x = new Moto("11C22", "Yamaha", true);

        if (x instanceof Voiture) {
            Voiture v1 = (Voiture) x;
            System.out.println("Downcasting réussi !");
        } else {
            System.out.println("Erreur l'objet n'est pas une Voiture ; Downcasring impossible");
        }
    }
}