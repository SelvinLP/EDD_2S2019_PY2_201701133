/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.py2_201701133;

import Estructuras.TablaHASH;
import java.io.IOException;

/**
 *
 * @author Aragon Perez
 */
public class EDDPY2_201701133 {
    public static Login FMLogin=new Login();
    public static TablaHASH tb=new TablaHASH();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        
        //creacion de los primeros 7 nodos
        tb.NuevoNodo("Admin", "Admin");//1
        tb.NuevoNodo("", "");//2
        tb.NuevoNodo("", "");//3
        tb.NuevoNodo("", "");//4
        tb.NuevoNodo("", "");//5
        tb.NuevoNodo("", "");//6
        tb.NuevoNodo("", "");//7
    
        //tb.ComprobacionAunmento();

        
        FMLogin.show();
        
        
        
        
    }
    
}
