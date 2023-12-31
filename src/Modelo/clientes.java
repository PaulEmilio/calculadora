/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Scanner;


public class clientes {
 public  int   idCliente  ;
 public String nombre;
 public String apellido; 
 public String direccion;
 public String telefono;
 public String correo;
  public  int  numeroHijos  ;
   public  int eda  ;

    public clientes(int idCliente, String nombre, String apellido, String direccion, String telefono, String correo, int numeroHijos, int eda) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.numeroHijos = numeroHijos;
        this.eda = eda;
    }

    public clientes(String nombre, String apellido, String direccion, String telefono, String correo, int numeroHijos, int eda) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.numeroHijos = numeroHijos;
        this.eda = eda;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDirecion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public int getEda() {
        return eda;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direcion) {
        this.direccion = direcion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public void setEda(int eda) {
        this.eda = eda;
    }

    
 public void ingresarDatos() {
     
     Scanner t = new Scanner(System.in);
        System.out.println("Ingrese idcliente: ");
        setIdCliente(t.nextInt());
      System.out.println("Ingrese Nombres: ");
        setNombre(t.nextLine());
        
      
        System.out.println("Ingrese Apellido: ");
        setApellido(t.nextLine());
      
        System.out.println("Ingrese Dirección: ");
        setDireccion(t.nextLine());
        System.out.println("Ingrese Telefono: ");
        setTelefono(t.nextLine());
                System.out.println("Ingrese correo: ");
                
        setCorreo(t.nextLine());
                System.out.println("Ingrese numero de hijos: ");
        setNumeroHijos(t.nextInt());
                   

              System.out.println("Ingrese La edad: ");
        setEda(t.nextInt());
                   

    }
 }
