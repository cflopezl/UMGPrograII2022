package edu.umg.models;

public class Decano extends Empleado{


    public Decano(int idEmpleado, String nombre, double salario) {
        super(idEmpleado, nombre, salario);
    }

    public double calcularSalario(){

        double salarioFinal = getSalario() + 5000;

        return salarioFinal;
    }


}
