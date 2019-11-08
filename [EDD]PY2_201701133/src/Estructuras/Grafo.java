/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Aragon Perez
 */
class NodoGrafo{
    String NombreCarpeta;
    String TimeStamp;
    NodoTabla Siguiente;
    
    public NodoGrafo(String NombreC) {
        this.NombreCarpeta=NombreC;
        this.Siguiente=null;
    }
    
}
public class Grafo {
    
    public NodoGrafo Raiz;
    public NodoGrafo Ultimo;
    int size;
    
    public Grafo() {
        this.Raiz=null;
        this.Ultimo=null;
        this.size=0;
    }
    
    public void InsertarListaCabecera(String Ubicacion,String NombreC){
        NodoGrafo nuevo=new NodoGrafo(NombreC);
        if(Raiz==null){
            Raiz=nuevo;
            Ultimo=nuevo;
            size++;
        }else{
            //1 antes,0 igual, -1 despues
            System.out.println(Ubicacion.compareTo(NombreC));
            if(Ubicacion.compareTo(NombreC)==1){
                //antes
                
            }
        }
        
        
    }
    
}
