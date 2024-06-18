package Animais;

public abstract class Animal {
    // Atributos
    protected String nome;
    protected String cor;
    protected double altura;
    protected double peso;
    protected String estadoDoAnimal;

    // Construtor
    public Animal(String nome, String cor, double altura, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstadoDoAnimal() {
        return estadoDoAnimal;
    }
    public void setEstadoDoAnimal(String estadoDoAnimal) {
        this.estadoDoAnimal = estadoDoAnimal;
    }

    // Método soar abstract (cada um tem sua própria forma de fazer)
    public abstract void soar();
}


