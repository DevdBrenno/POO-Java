package Animais;

import Lojas.Petshop;

public class Main {
    public static void main(String[] args) {
        // Criação dos objetos Cachorro, Gato e Passaro
        Cachorro cachorro1 = new Cachorro("Duke", "Branco", 26, 5.4, "Docil");
        Gato gato1 = new Gato("Garibaldo", "Amarelo", 20, 3.8);
        Passaro passaro1 = new Passaro("Bird", "Amarelo", 10, 0.8);
        // Polimorfismo, gato herdando de animal
        Animal gato2 = new Gato("PsiPsi", "branco", 20, 3.8);
        Animal gato3 = new Gato("Laika", "branco", 20, 3.8);

        // Metódo soar
        cachorro1.soar();
        gato1.soar();
        passaro1.soar();

        // Metódos do Petshop
        Petshop petshop = new Petshop();

        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDoAnimal());
        petshop.darBanho(gato1);
        System.out.println(gato1.getEstadoDoAnimal());
    }
}



/*
Herança usamos uma classe Extends NomeClasse para gerar uma herança de uma classe a outra.
Dessa forma, a classe gerará os atributos.
Polimorfismo permite que objeto pode se comporte de maneiras diferentes ao receber uma mensagem.

Classes abstratas são apenas ideias elas não são concretas

Visibilidade das classes:
Mesma classe - Public; Protected; Default; Private
Qualquer no mesmo pacote - Public; Protected; Default
Filha no mesmo pacote - Public; Protected; Default
Filha em um pacote diferente - Public; Protected
Classe em pacote diferente - Public
*/
