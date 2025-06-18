package academy.devdojo.maratona.javacore.Minterfaces.dominio;

//A interfce foi criada para prover um CONTRATO para implementação
//por padrao todos os metodos são públicos e abstratos ou default
//A partir do java 8, a interface pode ter metodos com implementaação
//tbm não podemos criar objetos através de uma interface
// por padrao, todos os atributos sao constantes
public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();  //geralmente nn colocam public abstract, pois por padrão todos os metodos já seguem isso

    //metodo default - nn vai quebrar as subclasses se nn for implementado
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize(){ // nn pode ser sobrescrito
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
