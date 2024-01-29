package org.sysbancario.entity;

public class CuentaCorriente extends Cuenta{

    private double interes;

    public CuentaCorriente(Persona owner, double saldo, double interes) {
        super(owner, saldo);
        this.interes = interes;
    }

    public CuentaCorriente(double interes) {
        this.interes = interes;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public void verInfo(){
        super.verInfo();
        System.out.println("Interés: "+interes);
    }


    @Override
    public void retirar(double monto){
        if (monto > saldo){
            System.out.println("Saldo insuficiente, el monto tendrá un interés de 100$ por cada extracción");
            double saldoActual = saldo;
            saldo -= monto;
            double intereMasSaldo = saldoActual + interes;
            System.out.println("Su saldo actual es: "+saldo+". Por lo tanto, usted debe: "+intereMasSaldo);
        }
    }
}
