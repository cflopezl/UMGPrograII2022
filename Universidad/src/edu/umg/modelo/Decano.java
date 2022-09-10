package edu.umg.modelo;

public class Decano extends Empleado {

    public Decano(int idEmpleado, String nombre, double salario) {
        super(idEmpleado, nombre, salario);
    }

    @Override
    public double calculoSalario() {
        return super.calculoSalario() + 5000;
    }

}
