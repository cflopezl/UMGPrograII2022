package edu.umg.models;

public class Empleado {

    private int idEmpleado;
    private String nombre;
    private double salario;

    public Empleado(int idEmpleado, String nombre, double salario) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.salario = salario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalario(){
        return this.salario;
    }

}
