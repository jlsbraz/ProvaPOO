
package com.mycompany.avalicaopoo;


public class Avalicao 
{
    private int id, nota;
    private String name, comentario;
    
    public Avalicao(int id, String name, int nota, String comentario)
    {
        this.id = id;
        this.nota = nota;
        this.name = name;
        this.comentario = comentario;
    }
    
    public void setNota(int nota) 
    {
        this.nota = nota;
    }
    
    public void setName(String name) 
    {
        this.name = name;
    }
    
    public void setComentario(String comentario) 
    {
        this.comentario = comentario;
    }
    
    public int getNota() 
    {
        return this.nota;
    }
    
    public String getName() 
    {
        return this.name;
    }
    
    
}
