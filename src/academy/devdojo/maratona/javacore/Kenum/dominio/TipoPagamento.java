package academy.devdojo.maratona.javacore.Kenum.dominio;

public enum TipoPagamento{ // é possível criar um enum dentro da classe
        DEBITO {
            //Dentro do debito, estamos sobrescrevendo o metodo calcularDesconto, que foi definido fora
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.1;
            }
        }, CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

        public double calcularDesconto(double valor){
            return 0;
        }
    }