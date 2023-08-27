public class App {
    public static void main(String[] args) throws Exception {

        Conta conta1 = Conta.builder(123456L, "João")
        .saldoLivreInicial(1000)
        .saldoAplicacaoInicial(5000)
        .taxaRemuneracao(0.05)
        .taxaSaldoNegativo(0.1)
        .categoriaInicial(Categoria.NORMAL)
        .build();

        System.out.println(conta1);
    }
}
