package edu.umg.modelo;

public class Catedratico extends Empleado{
    private int noCursos;

    public Catedratico(int idEmpleado, String nombre, double salario, int noCursos) {
        super(idEmpleado, nombre, salario);
        this.noCursos = noCursos;
    }

    public int getNoCursos() {
        return noCursos;
    }

    public void setNoCursos(int noCursos) {
        this.noCursos = noCursos;
    }

    public double calculoSalario() {

        double salarioBase = super.calculoSalario();
        double nuevoSalario = salarioBase * noCursos;
        double porcentaje = ( noCursos < 3 ? 0.1 : 0.25 );
        nuevoSalario = nuevoSalario + nuevoSalario * porcentaje;

        return nuevoSalario;

    }
}
