import java.util.Scanner;

import javax.sql.rowset.spi.SyncFactoryException;

 public class DatosUsuario {
     Scanner sc = new Scanner(System.in);
     System.out.println("datosDeUsuario: ");
     
     String nombreDeUsuario= nombreDeUsuario();
     System.out.println("nombreDeUsuario: ");
    
     String edad =edad();
     System.int.print ("edad= " + edad);
     
     String correoElectronico= correoElectronico();
     System.out.println(correoElectronico+"correoElectronico: ");
     sc.close();
    }