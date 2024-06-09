package ExemploBasico;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("5165165");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("796846");
        z400.ligar();

        Veiculo coringa = jeep; 
        coringa.ligar();
    }
}
