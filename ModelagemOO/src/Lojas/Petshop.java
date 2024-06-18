package Lojas;
import Animais.Animal;

public class Petshop {

    public void darBanho(Animal animal){
        animal.setEstadoDoAnimal("Limpo");
    }

    public void deixarNoPet(Animal animal){
        animal.setEstadoDoAnimal("Com saudade");
    }
}
