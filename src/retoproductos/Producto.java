
package retoproductos;
import java.util.Scanner;

/**
 *
 * @author Globant
 */
public class Producto {
    
    String []nombre;
    double []precioUnitario;
    int[]cantidadProd;
    int cont;
    private static final int maxProductos = 100;

    public Producto() {
        nombre = new String[maxProductos];
        precioUnitario = new double[maxProductos];
        cantidadProd = new int[maxProductos];
        cont = 0;
        
    }
    
    
   
    public void agregarProducto(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: ");
        String nom = scanner.next();
        System.out.println("Ingrese la cantidad de productos a agregar: ");
        int cant = scanner.nextInt();
        System.out.print("Ingrese el precio unitario: ");
        double precio = scanner.nextInt();

        nombre[cont] = nom;
        precioUnitario[cont] = precio;
        cantidadProd[cont] = cant;

        cont++;

        System.out.println("Producto agregado al carrito.");
    }
    
    public void verProductos(){
        
        if(cont== 0){
            System.out.println("No hay productos en el carrito");
                    
        }
        System.out.println("Productos en el carrito:");
            for (int i = 0; i < cont; i++) {
                System.out.println("Nombre: " + nombre[i] +
                        ", Precio unitario: " + precioUnitario[i] +
                        ", Cantidad: " + cantidadProd[i]);
            }
    }
    
    public void limpiar(){
        cont = 0;
        System.out.println("El carrito ha sido limpiado");
    }
    public void total(){
        double totalPagar = 0;
        for(int i = 0; i<cont;i++){
            totalPagar += precioUnitario[i]*cantidadProd[i];
            
        }
        if (cont > 5) {
            double descuento = totalPagar * 0.1;
            totalPagar -= descuento;
        }

        System.out.println("El costo total de la transacción es: " + totalPagar);
    }
   
    
    
    
}
