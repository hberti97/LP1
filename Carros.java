package CARROS;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *

 */
public class Carros {
    private String modelo;
    private String marca;
    private String cor;
    private boolean velocidade;
    
     //METODO CONSTRUTOR
    public Carros() {
    }
    
    public Carros(String marca, String modelo, String cor, boolean velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocidade = velocidade;
    }
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
        
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
    }
    
    void acelerar(){
        this.velocidade = true;
    }

    void frear(){
        this.velocidade = false;
    }
    void marcha(){
        if (this.velocidade == true) {
            System.out.println("Mudando de marcha");
        } else {
            System.out.println("Mudar de marcha sem pisar na embreagem estraga o câmbio");
        }
        
    }
}
