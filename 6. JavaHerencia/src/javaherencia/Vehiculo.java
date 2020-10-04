package javaherencia;

public class Vehiculo {
    protected String marca = "Ford"; //atributo vehiculo
    
    public void bocina(){ //método vehículo
        System.out.println("tuuu, tuuu!!!!");
    }

    public Vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
