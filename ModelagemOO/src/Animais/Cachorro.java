package Animais;

public class Cachorro extends Animal {
    // Variável estática
    static int NumbCachorros;

    // Declaração dos atributos
    private String personalidade;
    private String acaoDoCachorro;

    // Construtor que inicializa todos os atributos
    public Cachorro(String nome, String cor, double altura, double peso, String personalidade) {
        super(nome, cor, altura, peso);
        this.personalidade = personalidade;
        NumbCachorros++;
    }

    public static int getNumbCachorros() {
        return NumbCachorros;
    }

    public static void setNumbCachorros(int numbCachorros) {
        NumbCachorros = numbCachorros;
    }

    // Método soar
    @Override
    public void soar() {
        System.out.println("Au au");
    }

    // Método pegar que retorna "Bolinha"
    public String pegar() {
        return "Bolinha";
    }

    // Método interagir que define a ação do cachorro com base na personalidade
    public String interagir(String personalidade) {
        switch (personalidade) {
            case "Docil":
                this.acaoDoCachorro = "Lambida";
                break;
            case "Raivoso":
                this.acaoDoCachorro = "Mordida";
                break;
            default:
                this.acaoDoCachorro = "Nada";
        }
        return acaoDoCachorro;
    }

    // Métodos getters e setters para encapsulamento dos atributos

    public String getPersonalidade() {
        return personalidade;
    }

    public void setPersonalidade(String personalidade) {
        this.personalidade = personalidade;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
