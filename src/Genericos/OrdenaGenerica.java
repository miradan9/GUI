package Genericos;
import java.lang.Comparable;
public class OrdenaGenerica <T extends Comparable> {
    public T a[];
    public T getA(){
        T mayor;
        if(a.length==0||a==null)
            return a[0];
        mayor=a[0];
        for(T e:a){
            if(e.compareTo(mayor)>0){
                mayor=e;
            }
        }
        return mayor;
    }
    public void setA(T[]a){this.a=a;}
}
