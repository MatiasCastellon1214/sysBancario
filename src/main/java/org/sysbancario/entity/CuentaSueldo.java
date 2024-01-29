package org.sysbancario.entity;

public class CuentaSueldo extends Cuenta{

    private double limite;

    public CuentaSueldo(Persona owner, double saldo, double limite) {
        super(owner, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void verInfo(){
        super.verInfo();
        System.out.println("Límite: "+limite);
    }

    @Override
    public void ingresar(double monto){
        if (monto > saldo){
            System.out.println("Excede su límite");
            System.out.println("Su límite es: "+limite);
        } else {
            saldo += monto;
        }
    }

    @Override
    public void retirar(double monto){
        if (monto > saldo){
            System.out.println("Saldo insuficiente, ingrese un monto menor");
            System.out.println("Su saldo actual es: "+saldo);
        } else {
            saldo -= monto;
        }
    }

}
