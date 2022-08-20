package edu.umg.models;

public class Catedratico extends Empleado{

    private int noCursos; // 6

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

    public double calcularSalario(){

        double salarioBase = getSalario();// 1000
        double nuevoSalario = noCursos * salarioBase;// 6000
        double porcentaje = ( noCursos < 3 ? 0.1 : 0.25 );
        nuevoSalario = nuevoSalario + nuevoSalario * porcentaje; // 6000  +  1500  = 7500

        return nuevoSalario;
    }


}
