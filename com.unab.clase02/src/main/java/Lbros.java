/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin
 */
public class Lbros {
    
    private int Id;
    private String NombreLbros;
    private int NumeroPaginas;
    private String Autor;
    
   public Lbros(int Id,String NumeroLbros,int NumeroPaginas,String Autor){
   
   this.Id = Id;
   this.NombreLbros = NumeroLbros;
   this.NumeroPaginas = NumeroPaginas;
   this.Autor = Autor;
   

   }
   //get se utiliza para recuperar informacion 
    public int getId() {
        return Id;
    }
    //set se utiliza para modificar informacion 
    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombreLbros() {
        return NombreLbros;
    }

    public void setNombreLbros(String NombreLbros) {
        this.NombreLbros = NombreLbros;
    }

    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(int NumeroPaginas) {
        this.NumeroPaginas = NumeroPaginas;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    @Override
    public String toString() {
        return "Lbros{" + "Id=" + Id + ", NombreLbros=" + NombreLbros + ", NumeroPaginas=" + NumeroPaginas + ", Autor=" + Autor + '}';
    }
   
    
}
