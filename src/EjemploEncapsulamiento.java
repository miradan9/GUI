public class EjemploEncapsulamiento {
        public static void main(String[] args) {

            clothesShop a1=new clothesShop();
            clothesShop a2= new clothesShop();
            clothesShop a3= new clothesShop();

            a1.setNoArticulo(0123);
            a1.setClasificacion("Pantalon");
            a1.setTemporada("verano");
            a1.setPrecio(800);

            a2.setNoArticulo(0124);
            a2.setClasificacion("chamarra");
            a2.setTemporada("invierno");
            a2.setPrecio(1500);

            a3.setNoArticulo(0125);
            a3.setClasificacion("zapatos");
            a3.setTemporada("verano");
            a3.setPrecio(1200);

            System.out.println("Número de articulo: " + a1.getNoArticulo() + "\nClasificación: " + a1.getClasificacion() +
                    "\nTemporada: " + a1.getTemporada() + "\nPrecio: " + a1.getPrecio());
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("Número de articulo: " + a2.getNoArticulo() + "\nClasificación: " + a2.getClasificacion() +
                    "\nTemporada: " + a2.getTemporada() + "\nPrecio: " + a2.getPrecio());
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("Número de articulo: " + a3.getNoArticulo() + "\nClasificación: " + a3.getClasificacion() +
                    "\nTemporada: " + a3.getTemporada() + "\nPrecio: " + a3.getPrecio());
            System.out.println("---------------------------------------------------------------------------------------");
        }
    }
    class clothesShop{

        private int noArticulo;
        private String Talla;
        private String temporada;
        private String clasificacion;
        private double precio;

        public int getNoArticulo(){
            return noArticulo;
        }
        public void setNoArticulo(int noArticulo) {
            this.noArticulo = noArticulo;
        }
        public String getTalla() {
            return Talla;
        }
        public void setTalla(String talla) {
            Talla = talla;
        }
        public String getTemporada() {
            return temporada;
        }
        public void setTemporada(String temporada) {
            this.temporada = temporada;
        }
        public String getClasificacion() {
            return clasificacion;
        }
        public void setClasificacion(String clasificacion) {
            this.clasificacion = clasificacion;
        }
        public double getPrecio() {
            return precio;
        }
        public void setPrecio(double precio) {
            this.precio = precio;
        }
}
