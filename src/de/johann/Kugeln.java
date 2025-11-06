package de.johann;
public class Kugeln {

    static int[] radien = {5, 7, -21};

    public static void printInfo(Kugel kugel) {
        String informationKugel = "Kugel mit Radius = %.2f [LE], Durchmesser = %.2f [LE], Volumen = %.2f [LE³], Oberfläche = %.2f [LE²]"
            .formatted(
                kugel.getRadius(),
                kugel.getDurchmesser(),
                kugel.getVolumen(),
                kugel.getOberflaeche()
            );
        System.out.println(informationKugel);
    }

    public static void main(String[] args) throws Exception {

        for (int i = 0; i < radien.length; i++) {
                Kugel kugel = new Kugel(radien[i]);
                printInfo(kugel);
        }
    }
}
