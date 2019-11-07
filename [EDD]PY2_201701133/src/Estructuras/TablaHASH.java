/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.*;
import java.time.Clock;
import java.util.*;
/**
 *
 * @author Aragon Perez
 */
class NodoTabla{
    String NombreUsuario;
    String Contraseña;
    String TimeStamp;
    NodoTabla Siguiente;
    NodoTabla Anterior;
    //apuntador a matriz de adyacencia

    public NodoTabla(String Nombre,String Pass) {
        this.NombreUsuario=Nombre;
        this.Contraseña=Pass;
        this.Siguiente=null;
        this.Anterior=null;
    }
    
}
public class TablaHASH {
    
    public NodoTabla Raiz;
    public NodoTabla Ultimo;
    int size;
    int sizeproximo;
    public TablaHASH() {
        Raiz=null;
        size=1;
        sizeproximo=7;
    }
    
    public void NuevoNodo(String name,String pass){
        NodoTabla nuevo=new NodoTabla(name,pass);
        if(Raiz==null){
            Ultimo=nuevo;
            Raiz=nuevo;
        }else{
            Ultimo.Siguiente=nuevo;
            nuevo.Anterior=Ultimo;
            Ultimo=nuevo;
            size++;
        }
        //int Hash = name.hashCode()%size;
        //System.out.println(name+"  El valor del Hash es: "+Hash);
    }
    public void ComprobacionAunmento(){
        boolean BanderaPrimo=true;
        int iterador = 2;
        //se empezo el iterador de 2 para ahorrar pasos en las validaciones de 1 y 0
        sizeproximo++;
        while ((BanderaPrimo) && (iterador!=sizeproximo)){
            if(sizeproximo%iterador==0){
                BanderaPrimo=false;
            }
            iterador++;
        }
        //comprobamos si es primo; es falso es que no es primo
        if(BanderaPrimo==true){
            //generamos un ciclo para crar los nuevos nodos
            //System.out.println("Proximo numero Primo:  "+sizeproximo);
            int limite=size;
            for(int a=1;a<=(sizeproximo-limite);a++){
                NuevoNodo("", "");
            }
        }else{
            //en caso de que no sea primo efectuamos nuevamente el metodo
            ComprobacionAunmento();
        }
        
    }
    
    public boolean BusquedaExistencia(String Nombre){
        boolean bandera=false;
        NodoTabla aux=Raiz;
        while(aux !=null){
            if(aux.NombreUsuario.equals(Nombre)){
                bandera=true;
                break;
            }
            aux=aux.Siguiente;
        }
        return bandera;
    } 
    public boolean BusquedaInicioSesion(String usu, String pass){
        boolean bandera=false;
        NodoTabla aux=Raiz;
        while(aux!=null){
            if(aux.NombreUsuario.equals(usu)  && aux.Contraseña.equals(pass)){
                bandera=true;
                break;
            }
            aux=aux.Siguiente;
        }
        return bandera;
    }
    NodoTabla BusquedaInsercion(NodoTabla aux,int hash){
        int Ciclo=1;
        while(hash>=Ciclo){
            //System.out.println(Ciclo);
            //que pasa sobre pasa el tamaño de la lista
            if(aux==null){
                aux=Raiz;
            }
            aux=aux.Siguiente;
            Ciclo++;
            
        }
        return aux;
    }
    public void AsignacionDato(String usu,String pas){
        //la i es para elevarla en las colisiones
        int intento=0;
        NodoTabla aux=Raiz;
        int Hash = usu.hashCode()%size;
        //obtenemos la fecha
        Date TimeStamp=new Date();
        DateFormat FormatoHoraFecha = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        
        if(Hash<0){
            Hash=Hash*-1;
        }
        
        //comprobamos si existe colosion
        
        boolean bandera=true;
        while(bandera){
            aux=Raiz;
            aux=BusquedaInsercion(aux, Hash);
            if(aux.NombreUsuario.equals("")){
                //encuentra posicion vacia
                System.out.println(usu+"  El valor del Hash es: "+Hash);
                aux.TimeStamp=FormatoHoraFecha.format(TimeStamp);
                aux.NombreUsuario=usu;
                aux.Contraseña=pas;
                bandera=false;
            }else{
                //no encuentra posicion vacia
                System.out.println(usu+"  Hubo Colision Nuevo Calculo: "+Hash);
                intento++;
                Hash = (Hash+(intento*intento)) %size;
            }
        }
        
        //que pasa si sobrepasa el 75%
        aux=Raiz;
        int llenos=0;
        while(aux!=null){
            if(aux.NombreUsuario.equals("")){
                //esta vacio
            }else{
                llenos++;
            }
            aux=aux.Siguiente;
        }
        //System.out.println(llenos);
        double Porcentaje=(double)llenos/size;
        //System.out.println(Porcentaje);
        if(Porcentaje>0.75){
            //incrementa
            ComprobacionAunmento();
        }
        
    }
    
    //Metodo para Graficar
    public void GraficarTabla() throws IOException, NoSuchAlgorithmException{
        String ruta = "TablaHash.dot";
        File archivo = new File(ruta);
        BufferedWriter Lect;
        Lect = new BufferedWriter(new FileWriter(archivo));
        String CadenaGraficar="digraph Pila { \n";
        CadenaGraficar+="   rankdir=LR;\n" +"   node [shape=record,width=.1,height=.1];\n";
        CadenaGraficar+="   N0 [label = \"";
        //agregamos los nodos
        NodoTabla aux=Raiz;
        int cont=0;
        while(aux !=null){
            
            if(aux.Siguiente==null){
                CadenaGraficar+="{"+cont+")|<fl"+cont+">} ";
            }else{
                CadenaGraficar+="{"+cont+")|<fl"+cont+">} |";
            }
            cont++;
            aux=aux.Siguiente;
            
        }
        CadenaGraficar+="\"];\n";
        //creacion de enlaces
        aux=Raiz;
        cont=1;
        while(aux !=null){
            if(aux.NombreUsuario!=""){
                //hash para contraseña
                MessageDigest digest = MessageDigest.getInstance("SHA-256");
                byte[] hash = digest.digest(aux.Contraseña.getBytes(StandardCharsets.UTF_8));
                StringBuffer hexString = new StringBuffer();

                for (int i = 0; i < hash.length; i++) {
                    String hex = Integer.toHexString(0xff & hash[i]);
                    if(hex.length() == 1) hexString.append('0');
                    hexString.append(hex);
                }
                
                
                CadenaGraficar+="N"+cont+"[label = \"{<n> *-Usuario: "+aux.NombreUsuario+"     *-Contraseña: "+hexString.toString()+"     *-Timestamp: "+aux.TimeStamp+"|<p> }\"];\n";
                //CadenaGraficar+="{rank=same;N0:fl"+cont+";N"+cont+"}\n";
                CadenaGraficar+="N0:fl"+(cont-1)+" -> "+"N"+cont+":n; \n";
            }
            cont++;
            aux=aux.Siguiente;
            
        }
        
        
        CadenaGraficar+="}";
        Lect.write(CadenaGraficar);
        Lect.close();
        try {
            String cmd = "dot -Tpng TablaHash.dot -o TablaHash.png"; 
            Runtime.getRuntime().exec(cmd);
//            Runtime.getRuntime().exec("cmd /C start TablaHash.png");  
        }catch (IOException ioe) {
            //en caso de error
            System.out.println (ioe);
        }
        
    }
    
}
