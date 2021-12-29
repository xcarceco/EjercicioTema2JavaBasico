public class EjercicioIVA {

        public static void main(String[] args) {
            double baseFactura1 = 12.54;
            double tipoFactura1 = 0.21;
            float ivaSoportado = (float) (baseFactura1 * tipoFactura1);
            float totalFactura = (float) (baseFactura1 + ivaSoportado);

            System.out.println("El IVA soportado es " + ivaSoportado);
            System.out.println("El total a pagar es " + totalFactura);}


    }

