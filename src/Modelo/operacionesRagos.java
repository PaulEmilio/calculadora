package Modelo;

public class operacionesRagos {
    //Atributos
    private Double numeroUno;
    private Double numeroDos;
    private Double resultado;

    //Contructores
    public operacionesRagos(Double numeroUno, Double numeroDos, Double resultado) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
        this.resultado = resultado;
    }

    public operacionesRagos(Double numeroUno, Double numeroDos) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }
    
    public operacionesRagos() {
    }
    
    //Metodos Setters y Getters

    public Double getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(Double numeroUno) {
        this.numeroUno = numeroUno;
    }

    public Double getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(Double numeroDos) {
        this.numeroDos = numeroDos;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }
    
    //Metodos tipo
    public Double suma(){
        resultado = numeroUno + numeroDos;
        System.out.println("Suma: "+ resultado);
        return resultado;
    }
    
    public Double resta(){
        resultado = numeroUno - numeroDos;
        System.out.println("Resta: "+ resultado);
        return resultado;
    }
    
    public Double multiplicacion(){
        resultado = numeroUno * numeroDos;
        System.out.println("Multiplicacion: "+ resultado);
        return resultado;
    }
    
    public Double division(){
        resultado = numeroUno / numeroDos;
        System.out.println("Division: "+ resultado);
        return resultado;
    }

    public void setNumeroDos(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
