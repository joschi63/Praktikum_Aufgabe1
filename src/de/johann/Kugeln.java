package de.johann;
public class Kugeln {

    static int[] radien = {5, 7, -21};

    public static void printInfo(Kugel kugel) {
        String informationKugel = "Kugel mit Radius = %.2f [LE], Durchmesser = %.2f [LE], Volumen = %.2f [LE³], Oberfläche = %.2f [LE²]%n"
            .formatted(
                kugel.getRadius(),
                kugel.getDurchmesser(),
                kugel.getVolumen(),
                kugel.getOberflaeche()
            );
        
        System.out.printf(informationKugel);
    }

    public static void main(String[] args) throws Exception {

        for (int i = 0; i < radien.length; i++) {
            try {
            Kugel kugel = new Kugel(radien[i]);
                printInfo(kugel);
            } catch (IllegalArgumentException e) {
                System.out.println("Fehler beim Erstellen des Kreises mit dem Radius " + radien[i] + ": " + e.getMessage());
            }
        }

        /* 
        Kugel kugel5 = new Kugel(5.0);

        
        
        



        Kugel kugel7 = new Kugel(7.0);
        
        String informationKugel7 = "Kugel mit Radius = %.2f [LE], Durchmesser = %.2f [LE], Volumen = %.2f [LE³], Oberfläche = %.2f [LE²]%n"
        .formatted(
            kugel7.getRadius(),
            kugel7.getDurchmesser(), 
            kugel7.getVolumen(),
            kugel7.getOberflaeche() 
        );

        System.out.printf(informationKugel7);



        Kugel kugelm21 = new Kugel(-21.0);

        String informationKugelm21 = "Kugel mit Radius = %.2f [LE], Durchmesser = %.2f [LE], Volumen = %.2f [LE³], Oberfläche = %.2f [LE²]%n"
        .formatted(
            kugelm21.getRadius(),
            kugelm21.getDurchmesser(), 
            kugelm21.getVolumen(),
            kugelm21.getOberflaeche()
        );

        System.out.printf(informationKugelm21);
        */
    }
}
