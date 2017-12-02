

package br.com.projetopoomaromofinal;

import java.util.ArrayList;
import java.util.List;

public class GerenciarEmpregados {
   private List<Empregado> listaEmpregado;
     public GerenciarEmpregados(){
         this.listaEmpregado = new ArrayList();
     }
    
   public void adicionarEmpregado(Empregado e){
       listaEmpregado.add(e);
   } 
   public void removerEmpregado(Empregado e){
       listaEmpregado.add(e);
   }
   public List<Empregado> listarEmpregado(){
       return listaEmpregado;
   }
   private boolean verificarExistencia(Empregado e){
       return e != null;
   }
   
}
