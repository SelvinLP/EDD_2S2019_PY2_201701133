/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Enumeration;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Aragon Perez
 */
//Matriz de adyacencia
class NodoGrafo{
    int x;
    int y;
    String NombreCarpeta;
    String TimeStamp;
    NodoGrafo Siguiente;
    NodoGrafo abajo;
    
    public NodoGrafo(String NombreC) {
        this.NombreCarpeta=NombreC;
        this.Siguiente=null;
    }
    
}
public class Grafo {
    
    public NodoGrafo Raiz;
    public NodoGrafo UltimoX,UltimoY;
    int size;
    
    public Grafo() {
        this.Raiz=null;
        this.UltimoX=null;
        this.size=-1;
        CrearCabecera("RAIZ");
        CrearCabecera("/");
    }

    public void CrearCabecera(String NombreC){
        //para x
        NodoGrafo nuevo=new NodoGrafo(NombreC);
        //para  y
        NodoGrafo nuevo2=new NodoGrafo(NombreC);
        if(Raiz==null){
            Raiz=nuevo;
            //para x y y
            nuevo.x=-1;
            nuevo.y=-1;
            UltimoX=nuevo;
            UltimoY=nuevo;

            size++;
        }else{
            //para x
            nuevo.x=size;
            nuevo.y=-1;
            UltimoX.Siguiente=nuevo;
            UltimoX=nuevo;
            //para y
            nuevo2.y=size;
            nuevo2.x=-1;
            UltimoY.abajo=nuevo2;
            UltimoY=nuevo2;
            size++;
        }
    }
    public int ObtenerPos(String cadena){
        int cont=-1;
        int retornar=0;
        NodoGrafo aux=Raiz;
        while(aux!=null){
            if(aux.NombreCarpeta.equals(cadena)){
                retornar=cont;
            }
            cont++;
            aux=aux.Siguiente;
        }
        return retornar;
    }
    //recorro en x relacion en y
    public void InsertarenX(String Ubicacion,String NombreC,NodoGrafo nuevo){
        NodoGrafo aux=Raiz;
        int pos=ObtenerPos(Ubicacion);
        //System.out.println("valor de posicion para y es:"+pos);
        //le asigno posicion al nodo
        nuevo.y=pos;
        boolean bandera=true;
        boolean InsertarAntes=false;
        NodoGrafo posicionNodo=aux;
        NodoGrafo Anterior=null;
        NodoGrafo fin=null;
        while(aux!=null){
            if(aux.NombreCarpeta.equals(NombreC)){
                bandera=false;
            }
            if(bandera){
                aux=aux.Siguiente;
            }else{
                
                if(aux.y>pos){
                    InsertarAntes=true;
                    posicionNodo=aux;
                    break;
                }
                if(aux.abajo==null){
                    fin=aux;
                }else{
                    if(aux.abajo.y>pos){
                    Anterior=aux;
                    }
                }
                aux=aux.abajo;
            }
            
        }

        //insertamos
        
        if(InsertarAntes){
            Anterior.abajo=nuevo;
            nuevo.abajo=posicionNodo;
        }else{
            fin.abajo=nuevo;
        }
    }
    
    //recorro en y relacion en x
    public void InsertarenY(String Ubicacion,String NombreC,NodoGrafo nuevo){
        NodoGrafo aux=Raiz;
        int pos=ObtenerPos(NombreC);
        //le asigno posicion al nodo
        nuevo.x=pos;
        boolean bandera=true;
        boolean InsertarAntes=false;
        NodoGrafo posicionNodo=aux;
        NodoGrafo fin=null;
        NodoGrafo Anterior=null;
        while(aux!=null){
            if(aux.NombreCarpeta.equals(Ubicacion)){
                bandera=false;
            }
            if(bandera){
                aux=aux.abajo;
            }else{
                if(aux.x>pos){
                    InsertarAntes=true;
                    posicionNodo=aux;
                    break;
                }
                if(aux.Siguiente==null){
                    fin=aux;
                    
                }else{
                    if(aux.Siguiente.x>pos){
                    Anterior=aux;
                    }
                }
                aux=aux.Siguiente;
            }
            
        }

        //insertamos
        
        if(InsertarAntes){
            Anterior.Siguiente=nuevo;
            nuevo.Siguiente=posicionNodo;
        }else{
            fin.Siguiente=nuevo;
        }
    }
    public void InsertarMatrizz(String Ubicacion,String NombreC){
        //comprobacion si esta creada la cabecera
        NodoGrafo aux=Raiz;
        //si es true es que se debe crear
        boolean bandera=true;
        while(aux!=null){
            if(aux.NombreCarpeta.equals(NombreC)){
                bandera=false;
            }
            aux=aux.Siguiente;
        }
        //encaso de que no exista
        if(bandera){
            CrearCabecera(NombreC);
        }
        NodoGrafo nuevo=new NodoGrafo(NombreC);
        InsertarenY(Ubicacion, NombreC, nuevo);
        InsertarenX(Ubicacion, NombreC, nuevo);
        
    }
    public boolean Modificar(String Cambio,String Nuevo){
        boolean bandera=false;
        NodoGrafo aux=Raiz;
        while(aux!=null){
            NodoGrafo aux2=aux;
            while(aux2!=null){
                if(aux2.NombreCarpeta.equals(Cambio)){
                    aux2.NombreCarpeta=Nuevo;
                    bandera=true;
                }
                aux2=aux2.abajo;
            }
            aux=aux.Siguiente;
        }
        return bandera;
    }
    public void LlenarTree(JTree PanelTree,DefaultMutableTreeNode inicial){
        DefaultMutableTreeNode anterior= inicial;
        NodoGrafo aux=Raiz;
        aux=aux.abajo;
        while(aux!=null){
            NodoGrafo aux2=aux;
            aux2=aux2.Siguiente;
            while(aux2!=null){
                DefaultMutableTreeNode nuevo=new DefaultMutableTreeNode(aux2.NombreCarpeta);
                anterior.add(nuevo);
                aux2=aux2.Siguiente;
            }
            aux=aux.abajo;
            //busqueda
            if(aux!=null){
                Enumeration<DefaultMutableTreeNode> e = inicial.depthFirstEnumeration();
                while (e.hasMoreElements()) {
                    DefaultMutableTreeNode node = e.nextElement();
                    if (node.toString().equals(aux.NombreCarpeta)) {
                        anterior=node;
                    }
                }
            }
            //fin
        }

    }
    public void GraficarMatriz() throws IOException{
        String ruta = "MatrizAdyacencia.dot";
        File archivo = new File(ruta);
        BufferedWriter Lect;
        Lect = new BufferedWriter(new FileWriter(archivo));
        String CadenaGraficar="digraph Matriz { \n";
        CadenaGraficar+="   node[shape=record,style=filled] \n";
        //Creacion de Cabeceras 
        NodoGrafo aux=Raiz;
        while(aux!=null){
            CadenaGraficar +=  "\""+aux.x+aux.y+"\"" +"[label ="+"\""+"{";
            CadenaGraficar +=  aux.NombreCarpeta+ "}\",group = "+aux.x+"] \n " ;
            aux=aux.abajo;
        }
        aux=Raiz;
        aux=aux.Siguiente;
        while(aux!=null){
            CadenaGraficar +=  "\""+aux.x+aux.y+"\"" +"[label ="+"\""+"{";
            CadenaGraficar +=  aux.NombreCarpeta+ "}\",group = "+aux.x+"] \n " ;
            aux=aux.Siguiente;
        }
        //creacion de nodos
        aux=Raiz;
        aux=aux.abajo;
        while(aux!=null){
            NodoGrafo aux2=aux;
            aux2=aux2.Siguiente;
            while(aux2!=null){
                CadenaGraficar +=  "\""+aux2.x+aux2.y+"\"" +"[label ="+"\""+"{";
                CadenaGraficar +=  aux.NombreCarpeta+"/"+aux2.NombreCarpeta+ "}\",group = "+aux2.x+"] \n " ;
                aux2=aux2.Siguiente;
            }
            aux=aux.abajo;
        }
        //cracion de linealizacion horizontal
        aux=Raiz;
        while(aux!=null){
            NodoGrafo aux2=aux;
            CadenaGraficar+="{rank = same;";
            while(aux2!=null){
                CadenaGraficar+="\""+aux2.x+aux2.y+"\";";
                aux2=aux2.Siguiente;
            }
            CadenaGraficar+="}\n";
            aux=aux.abajo;
        }
        //creacion de las relaciones
        aux=Raiz;
        while(aux!=null){
            NodoGrafo aux2=aux;
            while(aux2!=null){
                if(aux2.abajo!=null){
                    CadenaGraficar+="\""+aux2.x+aux2.y+"\"->\""+aux2.abajo.x+aux2.abajo.y+"\"  \n";
                }
                if(aux2.Siguiente!=null){
                    CadenaGraficar+="\""+aux2.x+aux2.y+"\"->\""+aux2.Siguiente.x+aux2.Siguiente.y+"\" \n";
                }
                
                aux2=aux2.abajo;
            }
            aux=aux.Siguiente;
        }
        
        CadenaGraficar+="}";
        Lect.write(CadenaGraficar);
        Lect.close();
        try {
            String cmd = "dot -Tpng MatrizAdyacencia.dot -o MatrizAdyacencia.png"; 
            Runtime.getRuntime().exec(cmd);
//            Runtime.getRuntime().exec("cmd /C start MatrizAdyacencia.png");  
            
        }catch (IOException ioe) {
            //en caso de error
            System.out.println (ioe);
        }
        
    }
    
    //grafica grafo
    public void GraficarGrafo() throws IOException{
        String ruta = "Grafo.twopi";
        File archivo = new File(ruta);
        BufferedWriter Lect;
        Lect = new BufferedWriter(new FileWriter(archivo));
        String CadenaGraficar="digraph Grafo { \n";
        CadenaGraficar+="   node[shape=record,style=filled] \n";
        //Creacion de Cabeceras 
        NodoGrafo aux=Raiz;
        aux=aux.abajo;
        while(aux!=null){
            NodoGrafo aux2=aux;
            int cont=-1;
            while(aux2!=null){
                cont++;
                aux2=aux2.Siguiente;
            }
            CadenaGraficar +=  "\""+aux.x+aux.y+"\"" +"[label ="+"\""+"{";
            CadenaGraficar += "Nombre: "+aux.NombreCarpeta+"\\n Cantidad: "+cont+"}\"] \n " ;
            aux=aux.abajo;
            
        }
        //creacion de las relaciones
        aux=Raiz;
        aux=aux.abajo;
        while(aux!=null){
            NodoGrafo aux2=aux;
            aux2=aux2.Siguiente;
            while(aux2!=null){
                //buscar
                NodoGrafo busc=Raiz;
                while(busc!=null){
                    if(aux2.NombreCarpeta.equals(busc.NombreCarpeta)){
                        CadenaGraficar+="\""+aux.x+aux.y+"\"->\""+busc.x+busc.y+"\" \n";
                    }
                    busc=busc.abajo;
                }
                //fin buscar coordenada
                aux2=aux2.Siguiente;
            }
            aux=aux.abajo;
        }
        
        CadenaGraficar+="}";
        Lect.write(CadenaGraficar);
        Lect.close();
        try {
            String cmd = "twopi -Tpng Grafo.twopi -o Grafo.png"; 
            Runtime.getRuntime().exec(cmd);
//            Runtime.getRuntime().exec("cmd /C start MatrizAdyacencia.png");  
            
        }catch (IOException ioe) {
            //en caso de error
            System.out.println (ioe);
        }
        
    }
    
}
