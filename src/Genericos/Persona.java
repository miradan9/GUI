package Genericos;

public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private String direccion;

    public Persona(String nombre, int edad, String sexo, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDireccion() {
        return direccion;
    }

@Override
    public String toString(){
        return "Nombre "+nombre+"\nEdad: "+edad+"\nSexo: "+sexo+"\nDirección: "+direccion;
    }
}
