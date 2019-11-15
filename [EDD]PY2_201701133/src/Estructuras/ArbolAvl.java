/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.util.*;

/**
 *
 * @author Aragon Perez
 */
class NodoArbol{
    int Altura;
    int Equilibrio;
    String NombreArchivo;
    String Contenido;
    String TimeStamp;
    String Propetario;
    
    NodoArbol Izquierda;
    NodoArbol Derecha;
    
    public NodoArbol(String Nombre,String Content,String tiempo,String dueño) {
        this.Izquierda=null;
        this.Derecha=null;
        this.NombreArchivo=Nombre;
        this.Contenido=Content;
        this.TimeStamp=tiempo;
        this.Propetario=dueño;
    }
    
}
public class ArbolAvl {
    
    String CadenaImprimir;
    NodoArbol Raiz;
    int size;
    int AlturaMax;
    public ArbolAvl() {
        Raiz=null;
        CadenaImprimir="";
        AlturaMax=0;
        size=0;
    }
        //ROTACIONES
    //Rotacion simple a la Izquierda
    public NodoArbol  RotacionSimpleIzquierda(NodoArbol n,NodoArbol n1){
        n.Izquierda = n1.Derecha;
        n1.Derecha = n;
        //Actualizar
        return n1;
    }
        //Rotacion Izquierda Derecha
    public NodoArbol  RotacionIzquierdaDerecha(NodoArbol n,NodoArbol n1){
        NodoArbol n2 = n1.Derecha;
        n1.Derecha = n2.Izquierda;
        n2.Izquierda = n1;
        n.Izquierda = n2.Derecha;
        n2.Derecha= n;
        //Actualizar
        return n2;
    }

        //Rotacion simple a la Derecha
    public NodoArbol  RotacionSimpleDerecha(NodoArbol n,NodoArbol n1){
        n.Derecha = n1.Izquierda;
        n1.Izquierda = n;
        //Actualizar
        return n1;
    }
    
        //Rotacion DerechaIzquierda
    public NodoArbol  RotacionDerechaIzquierda(NodoArbol n,NodoArbol n1){
        NodoArbol n2 = n1.Izquierda;
        n.Derecha = n2.Izquierda;
        n2.Izquierda= n;
        n1.Izquierda = n2.Derecha;
        n2.Derecha = n1;
        //Actualizar
        return n2;
    }
    
    public void InsertarArbol(String Nombre,String Content,String dueño){
            Calendar calendario = new GregorianCalendar();
            int hora =calendario.get(Calendar.HOUR_OF_DAY);
            int minutos = calendario.get(Calendar.MINUTE);
            int segundos = calendario.get(Calendar.SECOND);
            String tiempo=hora + ":" + minutos + ":" + segundos;
            InsertarData(this.Raiz,Nombre, Content, tiempo, dueño);
    }
    public void InsertarData(NodoArbol raiz,String Nombre,String Content,String tiempo,String dueño){
        if(raiz!=null){
            this.Raiz=new NodoArbol(Nombre, Content, tiempo, dueño);
        }else{
            
        }
        
    }
}
