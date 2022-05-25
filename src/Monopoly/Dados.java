package Monopoly;

import java.util.concurrent.ThreadLocalRandom;

public class Dados {

    int Dado1, Dado2, result;

    public Dados() {
        this.Dado1 = 0;
        this.Dado2 = 0;
        this.result = 0;
    }

    public void tirarDados() {
        this.Dado1 = ThreadLocalRandom.current().nextInt(1, 7);
        this.Dado2 = ThreadLocalRandom.current().nextInt(1, 7);
        this.result = Dado1 + Dado2;
    }
}
