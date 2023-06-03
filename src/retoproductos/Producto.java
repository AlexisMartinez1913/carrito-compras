
package retoproductos;
import java.util.Scanner;

/**
 *
 * @author grupo 5
 */
public class Producto {
    
    String []nombre;
    double []precioUnitario;
    int[]cantidadProd;
    int cont;
    double descuento;
    int cant;
    private static final int maxProductos = 100;
    
  //contsructor
    public Producto() {
        nombre = new String[maxProductos];
        precioUnitario = new double[maxProductos];
        cantidadProd = new int[maxProductos];
        cant = 0;
        cont = 0;
        descuento = 0;
        
    }
    
    
   
    public void agregarProducto(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: ");
        String nom = scanner.next();
        System.out.println("Ingrese la cantidad de productos a agregar: ");
        cant = scanner.nextInt();
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
    
    //calcular costos totales
    public void total(){
        double totalPagar = 0;
        for(int i = 0; i<cont;i++){
            totalPagar += precioUnitario[i]*cantidadProd[i];
           
        }
          if (cant > 5) {
                 descuento = totalPagar *0.1;
                 totalPagar -= descuento;
           }
        
        System.out.println("El descuento es: " + descuento);
        System.out.println("El costo total  es: " + totalPagar);
        
       
    }
   
    
    
    
}
