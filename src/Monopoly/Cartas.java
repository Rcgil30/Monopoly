package Monopoly;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Cartas {

    int numero;
    String Descripcion;
    
    public void sacarTarjetaDuNord() {
        try {
            String Line = "";
            Random rand = new Random();
            int a = rand.nextInt(8);
            BufferedReader reader = new BufferedReader(new FileReader("Chance.txt"));
            for (int i = 0; i <= a; i++) {
                Line = reader.readLine();
            }
            Descripcion = Line.substring(3);
            numero = Integer.parseInt(Line.substring(0, 1));
            reader.close();
        } catch (IOException e) {
        }

    }

    public void sacarTarjetaPerdidos() {
        try {
            String Line = "";
            Random rand = new Random();
            int a = rand.nextInt(8);
            BufferedReader reader = new BufferedReader(new FileReader("Cofre.txt"));
            for (int i = 0; i <= a; i++) {
                Line = reader.readLine();
            }
            Descripcion = Line.substring(3);
            numero = Integer.parseInt(Line.substring(0, 1));
            reader.close();
        } catch (IOException e) {
        }
    }
}
