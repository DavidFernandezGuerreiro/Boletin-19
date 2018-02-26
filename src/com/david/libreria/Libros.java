
package com.david.libreria;

/**
 *
 * @author dfernandezguerreiro
 */
public class Libros implements Comparable{
    private String titulo;
    private String autor;
    private String ISBN;
    private float prezo;
    private int nUnidades;

    public Libros() {
    }

    public Libros(String titulo, String autor, String ISBN, float prezo, int nUnidades) {
        this.titulo=titulo;
        this.autor=autor;
        this.ISBN=ISBN;
        this.prezo=prezo;
        this.nUnidades=nUnidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo=titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor=autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN=ISBN;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo=prezo;
    }

    public int getnUnidades() {
        return nUnidades;
    }

    public void setnUnidades(int nUnidades) {
        this.nUnidades=nUnidades;
    }

    @Override
    public String toString() {
        return "Titulo: "+titulo+", autor: "+autor+", ISBN: "+ISBN+", prezo: "+prezo+", Nº unidades: "+nUnidades;
    }

    @Override
    public int compareTo(Object l) {
        Libros libros=(Libros)l;
        
        if(libros.titulo.compareToIgnoreCase(this.titulo)==0){
            return 0;
        }else if(libros.titulo.compareToIgnoreCase(this.titulo)<0){
            return 1;  
        }
        else return -1;
    }
}
