/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carros;

/**
 *

 */
public class Carros {
    private String Fabricante;
    private String Modelo;
    private String Ano;
    private String Cor;
    private boolean velocidade;
    
     //METODO CONSTRUTOR
    public Carros() {
    }
    
    public Carros(String Fabricante, String Modelo, String Ano, boolean velocidade, String Cor) {
        this.Fabricante = Fabricante;
        this.Modelo = Modelo;
        this.Cor = Cor;
        this.velocidade = velocidade;
        this.Ano = Ano;

        
    }
    
    public String getFabricante(){
        return Fabricante;
    }
    public void setModelo(String Modelo){
        this.Modelo = Modelo;
    }
    public String getAno(){
        return Ano;
    }
    public void setMarca(String Ano){
        this.Ano = Ano;
        
    }
    public String getCor(){
        return Cor;
    }
    public void setCor(String Cor){
        this.Cor = Cor;
    }  
    public void status(){
        System.out.println("Fabricante: " + this.Fabricante);
        System.out.println("Modelo: " + this.Modelo);
        System.out.println("Cor: " + this.Cor);
        System.out.println("Ano: " + this.Ano);
    }
    
    void acelerar(){
        System.out.println("Pronto para acelerar.");
        this.velocidade = true;
    }

    void frear(){
        this.velocidade = false;
    }
    void marcha(){
        if (this.velocidade == true) {
            System.out.println("Mudando de marcha");
        } else {
            System.out.println("Mudar de marcha estando parado, pode danificar seu carro");
        }
        
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "Fabricante: " + Fabricante + "\nModelo: " + Modelo + "\nCor: " + Cor + "\nAno: " + Ano;
    }

	public void setFabricante(String text) {
		// TODO Auto-generated method stub
		
	}

	public void setAno(String text) {
		// TODO Auto-generated method stub
		
	}
    
}
