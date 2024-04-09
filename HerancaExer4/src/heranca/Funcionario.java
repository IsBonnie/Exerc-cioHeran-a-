package heranca;

public class Funcionario extends Pessoa {

    private int matriculaFuncionario;
    private String dataAdmissao;
    private double salarioMensal;
    
    public String retornaDadosFuncionario(){
        String dados;
        
        dados = super.retornaDados();
        
        dados += "Matricula Funcionário: " + "\n";
        dados += "Data de Admissão: " + "\n";
        dados += "Salário Mensal: " + "\n";
        
        return dados;
}

    public int getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    public void setMatriculaFuncionario(int matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
