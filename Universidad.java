
package guia3poo;
public class Universidad {
    String NIT, nombre, direccion ;
    public Universidad() {
    }
    public Universidad(String NIT, String nombre, String direccion) {
        this.NIT = NIT;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Universidad UMB = new Universidad("123456", "Universidad Mauela", "Calle 60");
        System.out.println(UMB.NIT);
         System.out.println(UMB.nombre);
          System.out.println(UMB.direccion);
    }
    
    
}
