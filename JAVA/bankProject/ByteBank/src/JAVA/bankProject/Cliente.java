package JAVA.bankProject;


public class Cliente {

    private String nome;
    private String cpf;
    private String profissao;
    

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    } 

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

}
