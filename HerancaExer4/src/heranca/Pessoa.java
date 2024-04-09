package heranca;

public class Pessoa {

    private String nome;
    private String rg;
    private String cpf;
    private String cep;
    private String bairro;
    private String rua;
    private int num;
    private String cidade;
    
    public String retornaDados(){
        String dados = "";
        
        dados += "Nome: " + getNome() + "\n";
        dados += "RG: " + getRg() + "\n";
        dados += "CPF: " + getCpf() + "\n";
        
        return dados;
    }

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getRg() {
        return rg;
    }


    public void setRg(String rg) {
        this.rg = rg;
    }

  
    public String getCpf() {
        return cpf;
    }

    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public String getCep() {
        return cep;
    }

    
    public void setCep(String cep) {
        this.cep = cep;
    }

    
    public String getBairro() {
        return bairro;
    }

    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    
    public String getRua() {
        return rua;
    }

    
    public void setRua(String rua) {
        this.rua = rua;
    }


    public int getNum() {
        return num;
    }

    
    public void setNum(int num) {
        this.num = num;
    }

    
    public String getCidade() {
        return cidade;
    }

    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
