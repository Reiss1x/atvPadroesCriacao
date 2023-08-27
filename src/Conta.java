enum Categoria { NORMAL, ADVANCED, PREMIUM }

public class Conta {
    private Long numero;
    private String nomeCorrentista;
    private int saldoLivreInicial = 0;
    private int saldoAplicacaoInicial = 0;
    private double taxaRemuneracao = 0.0;
    private double taxaSaldoNegativo = 0.0;
    private Categoria categoriaInicial = Categoria.NORMAL;

    Conta(long numero, String nomeCorrentista, int saldoLivreInicial, int saldoAplicacaoInicial, double taxaRemuneracao, double taxaSaldoNegativo, Categoria categoriaInicial) {
        this.numero = numero;
        this.nomeCorrentista = nomeCorrentista;
        this.saldoLivreInicial = saldoLivreInicial;
        this.saldoAplicacaoInicial = saldoAplicacaoInicial;
        this.taxaRemuneracao = taxaRemuneracao;
        this.taxaSaldoNegativo = taxaSaldoNegativo;
        this.categoriaInicial = categoriaInicial;
    }
    
    public static ContaBuilder builder(Long numero, String nomeCorrentista) {
        return new ContaBuilder(numero, nomeCorrentista);
    }

    @Override
    public String toString() {
        return "Conta [numero=" + numero + ", nomeCorrentista=" + nomeCorrentista + ", saldoLivreInicial="
                + saldoLivreInicial + ", saldoAplicacaoInicial=" + saldoAplicacaoInicial + ", taxaRemuneracao="
                + taxaRemuneracao + ", taxaSaldoNegativo=" + taxaSaldoNegativo + ", categoriaInicial="
                + categoriaInicial + "]";
    }
}