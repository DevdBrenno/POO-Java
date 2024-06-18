package Animais;

public class Passaro extends Animal {
    // A classe Passaro é filha do Animal
    static int numbPassaros;

    public Passaro(String nome, String cor, double altura, double peso) {
        super(nome, cor, altura, peso);
        numbPassaros++;
    }

    // Métodos serão herdados de Animal

    @Override
    public void soar() {
        System.out.println("Fi fi");
    }
}
