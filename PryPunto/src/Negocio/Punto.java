
package Negocio;

public class Punto {
    //ATRIBUTOS
    private int _cordx;
    private int _cordy;
    
    //CONSTRUCTORES
    public Punto(int a, int b){
        this._cordx=a;
        this._cordy=b;
    }
    public Punto(){
        this._cordx=0;
        this._cordy=0;
    }
    public Punto(int c){
        this._cordx=c;
        this._cordy=0;
    }
    
    //METODOS
    public void moverx(int a){
        this._cordx=_cordx+a;
    }
    public void movery(int a){
        this._cordy=_cordy+a;
    }
    public float angulo(){
        float resul=0;
        resul=(float)Math.tan(this._cordy/this._cordx);
        return resul;
    }
    public float magnitud(){
        float mag=(this._cordx*_cordx)+(this._cordy*_cordy);
        return (float)Math.pow(2, mag);
    }
    public String ver(){
        String ver="(";
        ver=ver+_cordx+","+_cordy+")";
        return ver;
    }
}
