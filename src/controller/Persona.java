package controller;

public class Persona implements Precedable<Persona>{
    String nombre;
    int dni;
    public Persona(String nombre, int dni){
        this.nombre=nombre;
        this.dni=dni;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getDni(){
        return this.dni;
    }
    public void setDni(int dni){
        this.dni=dni;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    @Override
    public String toString() {
        return nombre + " - " + dni;
    }

    @Override
    public int precedeA(Persona t) {
        int difference=this.dni-t.dni;
        if (difference == 0) {
            return 0;
        }
        else if (difference < 0) {
            return -1;
        }
        else {
            return 1;
        }
    }
}
