package org.sysbancario;

import org.sysbancario.entity.CuentaCorriente;
import org.sysbancario.entity.CuentaSueldo;
import org.sysbancario.entity.Persona;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Jaimito", "Garcia", "12345555", "jaimito@garcia.com");

        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(persona1, 32000.00, 100.00);
        cuentaCorriente1.verInfo();
        cuentaCorriente1.ingresar(1000);
        cuentaCorriente1.verInfo();
        System.out.println("---------------------");
        cuentaCorriente1.retirar(34000);
        cuentaCorriente1.verInfo();

        CuentaSueldo cuentaSueldo1 = new CuentaSueldo(persona1, 320000.00, 350000.00);
        cuentaSueldo1.verInfo();
        cuentaSueldo1.ingresar(400);
        cuentaSueldo1.verInfo();
        cuentaSueldo1.retirar(700);
        cuentaSueldo1.verInfo();
        System.out.println("----------------------");
        cuentaSueldo1.ingresar(400.0);
        cuentaSueldo1.verInfo();
        System.out.println("----------------------");
        cuentaSueldo1.retirar(400000000.0);
        cuentaSueldo1.verInfo();
    }


}


