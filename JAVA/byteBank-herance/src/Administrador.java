public class Administrador extends Funcionario implements  Autenticavel {

    private AutenticaUtil autenticador;
    
    public Administrador() {
        
        this.autenticador = new AutenticaUtil();

    }
    
    @Override
    public void setSenha(int senha){
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {  
        
        return this.autenticador.autentica(senha);
        
    }

    @Override
    public double getBonificacao() {
        System.out.println("Bonficação Gerente");
        return super.getSalario();
    }
    

}
