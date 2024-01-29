package org.sysbancario.entity;

public class Cuenta {

    protected Persona owner;

    protected double saldo;

    public Cuenta(Persona owner, double saldo) {
        this.owner = owner;
        this.saldo = saldo;
    }

    public Cuenta() {
    }

    public Persona getOwner() {
        return owner;
    }

    public void setOwner(Persona owner) {
        this.owner = owner;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresar (double monto){
        saldo += monto;
    }

    public void retirar (double monto){
        saldo -= monto;
    }

    public void verInfo(){
        System.out.println("Titular: "+owner.getApellido()+", "+owner.getNombre());
        System.out.println("Saldo: "+saldo);
    }
}
