
package retoproductos;
import java.util.Scanner;
/*
Implementa un menú por consola para: a
-Agregar productos al carrito de compras
-Ver los productos agregados al carrito
-Limpiar el carrito de compras
Implementa la lógica para permitir a los usuarios agregar productos en un programa por consola 
al carrito de compras (nombre, precio unitario y cantidad). 
Puedes usar un arreglo para representar el carrito de compras 
Implementa la lógica para calcular el costo total de una transacción de compra
(Tenga en cuenta el número de productos y el costo unitario de cada uno)

Finalmente, si se compran más de 5 unidades (no importa de qué mercancía) 
el valor total de la compra recibe un descuento del 10%

*/



public class RetoProductos {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objread = new Scanner(System.in);
        boolean entrada = true;
        int opcion;
        Producto p1 = new Producto();
        
        
        
        while(entrada == true){
            System.out.println("Carrito de compras! ");
            System.out.println("1. Agregar productos al carrito de compras");
            System.out.println("2. Ver los productos agregados al carrito");
            System.out.println("3. Calcular costo");
            System.out.println("4. Limpiar carrito");
            System.out.println("5. Salir");
            
            System.out.println("Selecciona una opcion del menu: ");
            opcion = objread.nextInt();
            
            switch(opcion){
                case 1:
                    p1.agregarProducto();
                    break;
                case 2:
                    p1.verProductos();
                    break;
                case 3:
                    p1.total();
                    break;
                case 4:
                    p1.limpiar();
                    break;
                case 5:
                    entrada = false;
                    break;
                default:
                    System.out.println("Ingresaste una opcion equivocada");
            }
        }
    }
    
}
