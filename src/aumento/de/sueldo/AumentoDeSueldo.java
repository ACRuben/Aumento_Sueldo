/*
 * aumento de Sueldo a un trabajador si su sueldo es inferior a 1000 y que aplique un aumento del 15%
 */
package aumento.de.sueldo;

/**
 *
 * @author Ruben AC(TACHI)
 */
import java.util.*;//El * nos pone todas las librerias
public class AumentoDeSueldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner cap=new Scanner(System.in);
        double sueldo,aumento,porc;
        String nom;
        System.out.print("Ingrese el nombre del trabajador=>");
        nom=cap.next();
        System.out.print(nom+"Ingrese su sueldo del trabajaror=>");
        sueldo=cap.nextDouble();
        
        if(sueldo<1000)
        {
            porc=sueldo*.15;
            aumento=sueldo+porc;
            System.out.println(nom+"tu sueldo ahora es de=>"+aumento);
        }
            else
        {
            System.out.println(nom+"Tu sueldo se Mantiene=>");
        }
    }
    
}
