


public class TesteConexao {

    public static void main(String[] args) throws Exception {
        
        Conexao con = null;
 
        try (Conexao conexao = new Conexao() ) {
            conexao.leDados();

        }catch(IllegalStateException  ex) {
            System.out.println("Deu erro na conexão");
        }

    }
}
