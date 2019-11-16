/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author Aragon Perez
 */
class verificador{
    boolean ValorB;
    public verificador(boolean valor) {
        ValorB=valor;
    }
    public void DarAVerificador(boolean valor){
        this.ValorB=valor;
    }
    public boolean RecibirAValor(){
        return ValorB;
    }
}
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
        if(n1.Equilibrio== -1){
            n1.Equilibrio=0;
            n.Equilibrio=0;
        }else{
            n1.Equilibrio= 1;
            n.Equilibrio= -1;
        }
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
        if(n2.Equilibrio==1){
            n1.Equilibrio=-1;
        }else{
            n1.Equilibrio=0;
        }
        if(n2.Equilibrio== -1){
            n1.Equilibrio= 1;
        }else{
            n.Equilibrio=0;
        }
        n2.Equilibrio=0;
        return n2;
    }

        //Rotacion simple a la Derecha
    public NodoArbol  RotacionSimpleDerecha(NodoArbol n,NodoArbol n1){
        n.Derecha = n1.Izquierda;
        n1.Izquierda = n;
        //Actualizar
        if(n1.Equilibrio==1){
            n.Equilibrio=0;
            n1.Equilibrio=0;
        }else{
            n.Equilibrio=1;
            n1.Equilibrio=-1;
        }
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
        if(n2.Equilibrio==1){
            n.Equilibrio=-1;
        }else{
            n.Equilibrio=0;
        }
        if(n2.Equilibrio== -1){
            n1.Equilibrio= 1;
        }else{
            n1.Equilibrio=0;
        }
        n2.Equilibrio=0;
        return n2;
    }
    
    public void InsertarArbol(String Nombre,String Content,String dueño){
            Calendar calendario = new GregorianCalendar();
            int hora =calendario.get(Calendar.HOUR_OF_DAY);
            int minutos = calendario.get(Calendar.MINUTE);
            int segundos = calendario.get(Calendar.SECOND);
            String tiempo=hora + ":" + minutos + ":" + segundos;
            verificador verifi=new verificador(false);
            InsertarData(this.Raiz,Nombre, Content, tiempo, dueño,verifi);
    }
    public NodoArbol InsertarData(NodoArbol raiz,String Nombre,String Content,String tiempo,String dueño,verificador verifica){
        if(raiz!=null){
            this.Raiz=new NodoArbol(Nombre, Content, tiempo, dueño);
            verifica.DarAVerificador(true);
        }else{
            if(raiz.NombreArchivo.compareTo(Nombre)==-1){
                //el dato va antes de la raiz
                //izquierda
                NodoArbol NodoResu=InsertarData(raiz.Izquierda, Nombre, Content, tiempo, dueño,verifica);
                raiz.Izquierda=NodoResu;
                //comprobacion de equilibiro
                if(verifica.RecibirAValor()){
                    if(raiz.Equilibrio==1){
                        raiz.Equilibrio=0;
                        verifica.DarAVerificador(false);
                    }else{
                        if(raiz.Equilibrio==0){
                            raiz.Equilibrio= -1;
                        }else{
                            if(raiz.Equilibrio== -1){
                                NodoArbol n1=raiz.Izquierda;
                                if(n1.Equilibrio==-1){
                                    raiz=RotacionSimpleIzquierda(raiz, n1);
                                }else{
                                    raiz=RotacionIzquierdaDerecha(raiz, n1);
                                }
                                verifica.DarAVerificador(false);
                            }
                        }
                    }
                }
                    
            }else{
                if(raiz.NombreArchivo.compareTo(Nombre)==1){
                    //el dato va despues de la raiz
                    //derecha
                    NodoArbol NodoResu=InsertarData(raiz.Derecha, Nombre, Content, tiempo, dueño,verifica);
                    raiz.Derecha=NodoResu;
                    //comprobacion de equilibiro
                    if(verifica.RecibirAValor()){
                        if(raiz.Equilibrio==1){
                            NodoArbol n1=raiz.Derecha;
                            if(n1.Equilibrio==1){
                                raiz=RotacionSimpleDerecha(raiz, n1);
                            }else{
                                raiz=RotacionDerechaIzquierda(raiz, n1);
                            }
                            verifica.DarAVerificador(false);

                        }else{
                            if(raiz.Equilibrio==0){
                                raiz.Equilibrio=1;
                            }else{
                                if(raiz.Equilibrio==-1){
                                    raiz.Equilibrio=0;
                                    verifica.DarAVerificador(false);
                                }
                            }
                        }

                    }
                
                }else{
                    //en caso de que los datos sean iguales
                    if(raiz.NombreArchivo.compareTo(Nombre)==0){
                        System.out.println(" EL DATO YA EXISTE");
                    }
                    
                }
            }//fin else
            
            
        }
        return raiz;
       
    }
    
    //Metodo Graficar
    public void GraficarArbolAVL() throws IOException{
        String ruta = "ArbolAVL.dot";
        File archivo = new File(ruta);
        BufferedWriter Lect;
        Lect = new BufferedWriter(new FileWriter(archivo));
        this.CadenaImprimir = "digraph ARBOL { " + '\n';
        this.CadenaImprimir += "rankdir=TB" + '\n';
        this.CadenaImprimir += "node[shape=record,style=filled] " + '\n';
        //obtenemos alturas
        int alt=0;
        this.Altura(Raiz, alt);
        this.DatosArbol(Raiz, alt);
        this.CadenaImprimir += '\n' + "}";
        
        Lect.write(this.CadenaImprimir);
        Lect.close();
        try {
            String cmd = "dot -Tpng ArbolAVL.dot -o ArbolAVL.png"; 
            Runtime.getRuntime().exec(cmd); 
            
        }catch (IOException ioe) {
            //en caso de error
            System.out.println (ioe);
        }
        
    }
    public void Altura(NodoArbol raiz,int altura){
        if(raiz!=null){
            Altura(raiz.Izquierda, altura+1);
            if(altura>AlturaMax){
                AlturaMax=altura;
            }
            Altura(raiz.Derecha, altura+1);
        }
    }
    public void DatosArbol(NodoArbol nodoraiz,int alt){
        nodoraiz.Altura=(this.AlturaMax-alt);
        this.CadenaImprimir += "\"" + nodoraiz.NombreArchivo  + "\"" + "[label =\"<C0>|<C1>" + "Nombre: " + nodoraiz.NombreArchivo + "\\n Contenido:  " + nodoraiz.Contenido + "\\n Timestamp:  " + nodoraiz.TimeStamp.toString()+ "\\n Propetario:  " + nodoraiz.Propetario+ "\\n Altura:  " + nodoraiz.Altura + "\\n FE:  " + nodoraiz.Equilibrio + "|<C2>\"]; \n";

        if(nodoraiz.Izquierda !=null ){
            this.DatosArbol(nodoraiz.Izquierda,alt+1);
            this.CadenaImprimir += "\""+ nodoraiz.NombreArchivo +"\":C0->"+"\""+nodoraiz.Izquierda.NombreArchivo+"\"; \n";
        }
        if(nodoraiz.Derecha !=null ){
            this.DatosArbol(nodoraiz.Derecha,alt+1);
            this.CadenaImprimir += "\""+ nodoraiz.NombreArchivo +"\":C0->"+"\""+nodoraiz.Derecha.NombreArchivo+"\"; \n";
        }



    }
}
