public class ContaBuilder {
    
        private Long numero;
        private String nomeCorrentista;
        private int saldoLivreInicial = 0;
        private int saldoAplicacaoInicial = 0;
        private double taxaRemuneracao = 0.0;
        private double taxaSaldoNegativo = 0.0;
        private Categoria categoriaInicial = Categoria.NORMAL;

        public ContaBuilder(Long numero, String nomeCorrentista) {
            this.numero = numero;
            this.nomeCorrentista = nomeCorrentista;
        }

        public ContaBuilder saldoLivreInicial(int saldoLivreInicial) {
            this.saldoLivreInicial = saldoLivreInicial;
            return this;
        }

        public ContaBuilder saldoAplicacaoInicial(int saldoAplicacaoInicial) {
            this.saldoAplicacaoInicial = saldoAplicacaoInicial;
            return this;
        }

        public ContaBuilder taxaRemuneracao(double taxaRemuneracao) {
            this.taxaRemuneracao = taxaRemuneracao;
            return this;
        }

        public ContaBuilder taxaSaldoNegativo(double taxaSaldoNegativo) {
            this.taxaSaldoNegativo = taxaSaldoNegativo;
            return this;
        }

        public ContaBuilder categoriaInicial(Categoria categoriaInicial) {
            this.categoriaInicial = categoriaInicial;
            return this;
        }

        public Conta build() {
            return new Conta(numero, nomeCorrentista, saldoLivreInicial, saldoAplicacaoInicial, taxaRemuneracao, taxaSaldoNegativo, categoriaInicial);
        }
    }
