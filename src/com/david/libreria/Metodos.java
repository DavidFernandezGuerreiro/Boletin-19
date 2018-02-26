
package com.david.libreria;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author dfernandezguerreiro
 */
public class Metodos {
    ArrayList<Libros>listaLibros=new ArrayList<Libros>();
    
    public void engadir(){
        Libros obxL=new Libros();
        obxL.setTitulo(JOptionPane.showInputDialog("Engadir título: "));
        obxL.setAutor(JOptionPane.showInputDialog("Engadir autor: "));
        obxL.setISBN(JOptionPane.showInputDialog("Engadir código do libro (ISBN): "));
        obxL.setPrezo(Float.parseFloat(JOptionPane.showInputDialog("Engadir prezo: ")));
        obxL.setnUnidades(Integer.parseInt(JOptionPane.showInputDialog("Añadir número de unidades: ")));
        listaLibros.add(obxL);
    }
    
    public void venderBorarLibros(){
        Libros obxL=new Libros();
        String libroVender=JOptionPane.showInputDialog("Añadir título del libro a vender: ");
        for(int i=0;i<listaLibros.size();i++){
            if(listaLibros.get(i).getnUnidades()>0){ //Si las unidades del libro son mayores de 0, que ejecute el siguiene IF.
                if(libroVender.equals(listaLibros.get(i).getTitulo())){ //Busca el titulo en la lista y le resta la unidad vendida.
                    int name=listaLibros.get(i).getnUnidades()-1;
                    listaLibros.get(i).setnUnidades(name);
                }
            }
        } 
    }
    
    public void amosar(){
        Collections.sort(listaLibros);
        Iterator it=listaLibros.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
    
    public void darDeBaixa(){
        for(int i=0;i<listaLibros.size();i++){
            while(listaLibros.get(i).getnUnidades()==0){
                listaLibros.remove(i);
            }
        }
    }
    
    public void consultarLibro(){
        String buscar=JOptionPane.showInputDialog("Titulo do libro a consultar: ");
        for(int i=0;i<listaLibros.size();i++){
            if(listaLibros.get(i).getTitulo().equals(buscar)){
                System.out.println(listaLibros.get(i));
            }
        }
    }

}
