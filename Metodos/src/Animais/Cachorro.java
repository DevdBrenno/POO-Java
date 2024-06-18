package Animais;

public class Cachorro {
    // Declaração dos atributos
    private String nome;
    private String cor;
    private double altura;
    private double peso;
    private String personalidade;
    private String acaoDoCachorro;

    // Construtor que inicializa todos os atributos
    public Cachorro(String nome, String cor, double altura, double peso, String personalidade) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.personalidade = personalidade;
    }

    // Definição de um método vazio comer
    public void comer() {}

    // Método latir que imprime "Au au"
    public void latir() {
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPersonalidade() {
        return personalidade;
    }

    public void setPersonalidade(String personalidade) {
        this.personalidade = personalidade;
    }
}
// Interação do cachorro feita com if
//        if(personalidade.equals("Docil")){
//            this.acaoDoCachorro = "Lambida";
//        }else if(personalidade.equals("Raivoso")){
//            this.acaoDoCachorro = "Mordida";
//        }else{
//            System.out.println("Neutro");
//        }
//        return acaoDoCachorro;
