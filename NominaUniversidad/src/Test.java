import edu.umg.models.Catedratico;
import edu.umg.models.Decano;
import edu.umg.models.Empleado;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        //crear objetos de diferentes tipos de empleados
        Empleado objSeguridad = new Empleado(1, "Juan Perez", 2500);
        Empleado objDecano = new Decano(2, "Julio Medina", 20000);
        Empleado objProfesor = new Catedratico(3, "Axcel Hernandez", 1000, 2);
        Empleado objProfesor2 = new Catedratico(4, "Katherine Salazar", 1000, 6);

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
                    empleado.calcularSalario());
        }


    }

}
