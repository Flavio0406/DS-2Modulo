package exercicios;

public abstract class MetodosAbstratros_2 {

    public abstract void pesoa();

    public void profissao(){
        System.out.println("Esta e a profissão exercida: ");
    }
}
class Medico extends MetodosAbstratros_2{
    @Override
    public void pesoa(){
        System.out.println("Medico");
    }
}
class FinalMed {
    public static void main(String[] args) {
        MetodosAbstratros_2 prof = new Medico();
        MetodosAbstratros_2 carg = new Medico();
        carg.profissao();
        prof.pesoa();

    }
}