public class TestaReferencias {

    public static void main(String[] args) {
        
        Gerente g1 = new Gerente();
        g1.setNome("Marcola");  
        g1.setSalario(5000);

        Designer d1 = new Designer();
        d1.setSalario(2000);

        EditorVideo ev1 = new EditorVideo();
        ev1.setSalario(3000);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(d1);
        controle.registra(g1);
        controle.registra(ev1);

        System.out.println(controle.getSoma());

    }

}
