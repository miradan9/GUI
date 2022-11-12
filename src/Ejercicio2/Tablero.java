package Ejercicio2;

public class Tablero {
    private int x;
    private int y;

    //constructor
    public Tablero(int argumento_x,int argumento_y){
        this.x=argumento_x;
        this.y=argumento_y;

    }

    public void moverArriba(int incremento){
        x+=incremento;
    }
    public void moverDerecha(int incremento){
        y+=incremento;
    }
    public void moverAbajo(int decremento){
        x-=decremento;
    }
    public void moverIzquierda(int decremento){
        y-=decremento;
    }
    public int getPosicionX(){
        return x;
    }

    public int getPosicionY(){
        return y;
    }
}
