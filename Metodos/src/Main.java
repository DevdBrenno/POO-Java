import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        // Criação dos objetos Cachorro com o novo construtor
        Cachorro cachorro1 = new Cachorro("Puppy", "Marron", 25, 5.7, "Docil");
        Cachorro cachorro2 = new Cachorro("Doguinho", "Preto", 26, 5.4, "Raivoso");

        // Definindo atributos do cachorro1
        // cachorro1.setNome("Puppy");
        // cachorro1.setCor("Marron");
        // cachorro1.setAltura(25.5);
        // cachorro1.setPeso(5.7);
        // cachorro1.setPersonalidade("Docil");

        // Chamada do método latir
        cachorro1.latir();

        // Chamada dos métodos e impressão dos resultados
        System.out.println(cachorro1.getNome());
        System.out.println("O cachorro1 pegou uma " + cachorro1.pegar());

        // Interação do cachorro1 e impressão do resultado
        System.out.println("O cachorro1 está: " + cachorro1.getPersonalidade() + ". ~" + cachorro1.interagir(cachorro1.getPersonalidade()) + "\n");

        // Interação do cachorro2 e impressão do resultado
        System.out.println("O cachorro2 está: " + cachorro2.getPersonalidade() + ". ~" + cachorro2.interagir(cachorro2.getPersonalidade()));
    }
}
/*
Encapsulamento - Ao encapsular protegemos os objetos;
Podemos usar o "get" para escolher quem terá permissão
O "set" é muito mais restrito

Visibilidade das classes:
Mesma classe - Public; Protected; Default; Private
Qualquer no mesmo pacote - Public; Protected; Default
Filha no mesmo pacote - Public; Protected; Default
Filha em um pacote diferente - Public; Protected
Classe em pacote diferente - Public
*/
