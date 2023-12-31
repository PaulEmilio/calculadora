/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Darwin
 */
public class pCajero {
    
    public String nombre;
    public Double saldo;
    public Double monto;

    public pCajero(String nombre, Double saldo, Double monto) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.monto = monto;
    }

    public pCajero(Double saldo, Double monto) {
        this.saldo = saldo;
        this.monto = monto;
    }

    public pCajero(String nombre) {
        this.nombre = nombre;
    }

    public pCajero() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getMonto() {
        return monto;
    }
    
    public Double retiro(){
        saldo=saldo-monto;
        return saldo;
                
                
    }
    
     public Double deposito(){
            saldo=saldo+monto;
            if(           saldo>monto);
            
        return saldo;
                
                 
     }public void mostrarDatos(){
         

}                  
}

