package academy.devdojo.maratona.javacore.Kenum.test;

import academy.devdojo.maratona.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratona.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratona.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        //Neste problema queremos que qualquer cliente criado, siga o padrao de letra maiuscula separado por _
        //Porém, nem todos sabem disso, e criam com outros formatos. isso causa uma inconsistência
        Cliente cliente1 = new Cliente("Jacquin", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO); //chamando o enum tipo cliente
        Cliente cliente2 = new Cliente("Paola", TipoCliente.PESSOA_JURIDICA,TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

//        TipoCliente tipoCliente = TipoCliente.valueOf("Pessoa física");
//        System.out.println(tipoCliente);
        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa física");
        System.out.println(tipoCliente);

    }
}
