package java_concepts;

import model.Pessoa;

public class ReferenceVariable {
    public static void main(String[] args) throws CloneNotSupportedException {

        //The object are referenced, that is why you can't duplicate the object in a simple way

        var pessoa = Pessoa.builder().nome("Lendro").build();
        Pessoa pessoa2 = pessoa;
        pessoa2.setNome("Rodrigo");

        System.out.println(pessoa.getNome());

        var novaPessoa = new Pessoa();
        novaPessoa = pessoa.clone();
        novaPessoa.setNome("Leandro");


        System.out.println(pessoa.getNome());
        System.out.println(novaPessoa.getNome());

    }

}
