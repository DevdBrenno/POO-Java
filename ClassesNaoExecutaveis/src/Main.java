import Animais.Cachorro;

public class Main {
    public static void main(String[] args){
        // Para definirmos um objeto, criamos uma variável de referência
        Cachorro cachorro1 = new Cachorro();

        cachorro1.Nome = "Puppy";
        cachorro1.Cor = "Marron";
        cachorro1.Altura = 25.5;
        cachorro1.Peso = 4.7;
        cachorro1.Personalidade = "Docil";

        // O objeto cachorro1 foi armazenado em um endereço na memória
        System.out.println(cachorro1);
    }
}