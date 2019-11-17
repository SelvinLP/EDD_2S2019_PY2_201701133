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

/**
 *
 * @author Aragon Perez
 */
class NodoPila{
    public String TimeStamp;
    public String Usuario;
    public String Actividad;
    public NodoPila Siguiente;
    public NodoPila(String tiempo,String usuario,String Act) {
        this.TimeStamp=tiempo;
        this.Usuario=usuario;
        this.Actividad=Act;
        Siguiente=null;
    }
    
}
public class Pila {
    NodoPila Inicio;
    NodoPila Fin;
    int size;
    public Pila() {
        Inicio=null;
        Fin=null;
        size=0;
    }
    
    public void Insertar(String tiempo,String usu,String act){
        NodoPila nuevo=new NodoPila(tiempo, usu, act);
        if(Inicio==null){
            Inicio=nuevo;
            Fin=nuevo;
            this.size=1;
        }else{
            NodoPila aux=this.Fin;
            this.Fin=nuevo;
            aux.Siguiente=nuevo;
            this.size+=1;
        }
    }
    
    //Graficar
    public void GraficarPila() throws IOException{
        String CadenaImprimir="digraph Pila { "+'\n';
        CadenaImprimir+="node[shape=record,style=filled] "+'\n';
        CadenaImprimir+="    1[label =\""+'{';
        NodoPila aux=Inicio;
        while(aux!=null){
            CadenaImprimir += "| " +"TimeStamp: "+aux.TimeStamp.toString()+" \\n Usuario: "+aux.Usuario+" \\n Operacion: "+aux.Actividad;
            aux=aux.Siguiente;
        }
        CadenaImprimir+=" }\"]"+'\n';
        CadenaImprimir +=" }";
        
        String ruta = "Pila.dot";
        File archivo = new File(ruta);
        BufferedWriter Lect;
        Lect = new BufferedWriter(new FileWriter(archivo));
        
        Lect.write(CadenaImprimir);
        Lect.close();
        try {
            String cmd = "dot -Tpng Pila.dot -o Pila.png"; 
            Runtime.getRuntime().exec(cmd); 
            
        }catch (IOException ioe) {
            //en caso de error
            System.out.println (ioe);
        }
    }
}
