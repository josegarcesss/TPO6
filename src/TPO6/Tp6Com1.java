/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPO6;

import java.util.TreeSet;
import TP6.Entidades.Categoria;
import TP6.Entidades.Producto;

/**
 *
 * @author Usuario
 */
public class Tp6Com1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TreeSet<Producto> lista=new TreeSet<>();
        Producto arroz=new Producto(12,"Arroz Don Carlos",1300,10,new Categoria(1,"Comestible"));
        Producto cafe=new Producto(5,"Cafe Nescafe",5000,20,new Categoria(1,"Comestible"));
        Producto fideos=new Producto(123,"Fideos San Agustin",3200,12,new Categoria(1,"Comestible"));
        System.out.println(lista.add(arroz));
        System.out.println(lista.add(cafe));
        System.out.println(lista.add(fideos));
               
        
        for(Producto prod:lista){
        
            System.out.println(prod.getCodigo());
            System.out.println(prod.getDescripcion());
        }
    }
    
}
