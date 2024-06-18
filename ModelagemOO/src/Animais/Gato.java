package Animais;

public class Gato extends Animal {
    // Atributos
    static int numbGatos;
    private String personalidade;

    public Gato(String nome, String cor, double altura, double peso) {
        super(nome, cor, altura, peso);
        numbGatos++;
    }

    // Métodos serão herdados de Animal

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("Miau miau");
    }
}
