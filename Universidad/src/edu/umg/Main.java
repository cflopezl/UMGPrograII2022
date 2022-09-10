package edu.umg;

import edu.umg.modelo.Catedratico;
import edu.umg.modelo.Decano;
import edu.umg.modelo.Empleado;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Empleado objSeguridad = new Empleado(1,"Juan Perez", 2500);
        Empleado objDecano = new Decano(2, "Natanael Escobar", 20000);
        Empleado objProfesor = new Catedratico(3, "Angela Mejia", 1000, 2);
        Empleado objProfesor2 = new Catedratico(4, "Kimberly Salazar", 1000, 5);

        ArrayList<Empleado> nominaUMG = new ArrayList<>();

        nominaUMG.add(objSeguridad);
        nominaUMG.add(objDecano);
        nominaUMG.add(objProfesor);
        nominaUMG.add(objProfesor2);

        System.out.println("ROL\t\t\t\t\t\t\t\t\t\tID\t\tNOMBRE\t\t\tSALARIO");
        System.out.println("----------------------------------------------------------------------------");

        for(Empleado empleado : nominaUMG){
            System.out.format("%35s %5d %20s %,10.2f\n",
                                empleado.getClass().toString(),
                                empleado.getIdEmpleado(),
                                empleado.getNombre(),
                                empleado.calculoSalario());
        }


    }
}
