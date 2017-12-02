

package br.com.projetopoomaromofinal;


public class Empregado {
   private int codigo;
   private String nome;
   private String setor;
   private double salarioBruto;
   private double recolhimentoInss;
   
   public Empregado(int codigo, String nome, String setor, double salario){
       this.codigo = codigo;
       this.nome = nome;
       this.setor = setor;
       this.salarioBruto = salario;
       this.recolhimentoInss = 0.0;
   }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public double getSalarioBruto() {
        return salarioBruto;
    }
    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    public double getRecolhimentoInss() {
        return recolhimentoInss;
    }
    public void setRecolhimentoInss(double recolhimentoInss) {
        this.recolhimentoInss = recolhimentoInss;
    }
    
    public void calcularInss(){
        if(salarioBruto <= ParametrosInss.FAIXA[0]){
            recolhimentoInss = salarioBruto * 0.08;
        }else if((salarioBruto > ParametrosInss.FAIXALIMITE[0])&&(salarioBruto <= ParametrosInss.FAIXA[1])){
            recolhimentoInss = salarioBruto * 0.09;
        }else if((salarioBruto > ParametrosInss.FAIXALIMITE[1])&&(salarioBruto <= ParametrosInss.FAIXA[2])){
            recolhimentoInss = salarioBruto * 0.11;
        }else{
            recolhimentoInss = ParametrosInss.TETO * 0.11;
        }
    }
   
}
