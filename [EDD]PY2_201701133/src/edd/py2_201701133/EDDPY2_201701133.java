/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.py2_201701133;

import Estructuras.TablaHASH;

/**
 *
 * @author Aragon Perez
 */
public class EDDPY2_201701133 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login FMLogin=new Login();
        TablaHASH tb=new TablaHASH();
        
        //creacion de los primeros 7 nodos
        tb.NuevoNodo("", "");//1
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
