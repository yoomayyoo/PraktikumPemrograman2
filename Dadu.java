package soal1;

import java.util.Random;

public class Dadu {
    private int nilai;

    public void acakNilai() {
        Random rand = new Random();
        this.nilai = rand.nextInt(6) + 1;
    }

    public int getNilai() {
        return this.nilai;
    }
}