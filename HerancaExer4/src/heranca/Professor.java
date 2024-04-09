package heranca;

public class Professor extends Pessoa{

   
    public int getMatriculaProfessor() {
        return matriculaProfessor;
    }

    public void setMatriculaProfessor(int matriculaProfessor) {
        this.matriculaProfessor = matriculaProfessor;
    }

    
    public String getDataAdmissao() {
        return dataAdmissao;
    }

 
    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

   
    public double getSalarioHorista() {
        return salarioHorista;
    }

    
    public void setSalarioHorista(double salarioHorista) {
        this.salarioHorista = salarioHorista;
    }

    
    private int matriculaProfessor;
    private String dataAdmissao;
    private double salarioHorista; 
    
    public String retornaDadosProfessor(){
        String dados;
        
        dados = super.retornaDados();
        
        dados += "Matricula Professor: " + matriculaProfessor + "\n";
        dados += "Data Admissão: " + dataAdmissao + "\n";
        dados += "Salário Horista: " + salarioHorista + "\n";
        
        return dados;
    }
    
}
