/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PEREIRA
 */
public class Operaciones {
    
   private double ValorL, Resultado;
   private int moneda, monedafinal;


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getmoneda() {
        return moneda;
    }

    public void setmoneda(int moneda) {
        this.moneda = moneda;
    }

    public int getmonedafinal() {
        return monedafinal;
    }

    public void setmonedafinal(int monedafinal) {
        this.monedafinal = monedafinal;
    }

    public double getResultado() {
        return Resultado;
    }

    public void setResultado(double Resultado) {
        this.Resultado = Resultado;
    }
 //constructor
    public Operaciones() {
    }
 
    // operaciones 
    
    public double covertidorD(){
        
        if (moneda==0&& monedafinal==1){
            
            Resultado == ValorL *24.5;
        }
        else if (ValorL==&& monedafinal== 0){
            Resultado=ValorL;
        }
                
        return Resultado;
    }
    
 
}

