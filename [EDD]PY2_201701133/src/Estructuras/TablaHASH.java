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
class NodoTabla{
    String NombreUsuario;
    String Contraseña;
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
        size=7;
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
        }
        int Hash = name.hashCode()%size;
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
            //System.out.println("Proximo numero Primo:  "+size);
            for(int a=1;a<=(sizeproximo-size);a++){
                NuevoNodo("", "");
            }
        }else{
            //en caso de que no sea primo efectuamos nuevamente el metodo
            ComprobacionAunmento();
        }
        
    }
    
    
    
    
}
