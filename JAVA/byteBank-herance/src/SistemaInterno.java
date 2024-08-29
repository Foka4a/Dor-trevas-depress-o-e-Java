public class SistemaInterno {

    private int senha = 2222;

    public void autentica(Autenticavel fa) {
        boolean autenticou = fa.autentica(this.senha);
        if(autenticou) {
            System.out.println("Senha correta, sistema liberado");
        } else {
            System.out.println("Senha incorreta, tente novamente");
        }
    }

}
