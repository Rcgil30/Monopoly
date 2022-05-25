package Monopoly;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Board {

    Square GoSquare;
    Properties[] propiedades;
    public Board(Square GoSquare) {
        this.GoSquare = GoSquare;
        AddSquares();
        propiedades = new Properties[28];
        CrearPropiedades();
    }

    private void AddSquare(int type, int x, int y, int pos) {
        // Creamos un cuadrado con la información  y lo añadimos a la lista luego del último, conectandolo al
        // GoSquare para hacerlo circular, además encargandonos de los enlaces prev para el movimiento hacia atrás
        // En las cartas de suerte
        Square NewSquare = new Square(type, x, y, pos);
        Square p = GoSquare;
        p.prev.next = NewSquare;
        NewSquare.prev = p.prev;
        NewSquare.next = p;
        p.prev = NewSquare;
    }

    private void AddSquares() {
        // En este método se crean todos los nodos que serán cuadrados en la lista, llamando al método
        // AddSquare(), que crea los cuadros con la información necesaria que se quiere almacenar
        this.AddSquare(8, 660, 760, 2);
        this.AddSquare(6, 595, 760, 3);
        this.AddSquare(8, 525, 760, 4);
        this.AddSquare(7, 455, 760, 5);
        this.AddSquare(8, 385, 760, 6);
        this.AddSquare(8, 315, 760, 7);
        this.AddSquare(5, 245, 760, 8);
        this.AddSquare(8, 180, 760, 9);
        this.AddSquare(8, 115, 760, 10);
        this.AddSquare(3, 25, 760, 11);
        this.AddSquare(8, 25, 660, 12);
        this.AddSquare(8, 25, 595, 13);
        this.AddSquare(8, 25, 525, 14);
        this.AddSquare(8, 25, 455, 15);
        this.AddSquare(8, 25, 385, 16);
        this.AddSquare(8, 25, 315, 17);
        this.AddSquare(6, 25, 245, 18);
        this.AddSquare(8, 25, 180, 19);
        this.AddSquare(8, 25, 115, 20);
        this.AddSquare(4, 25, 25, 21);
        this.AddSquare(8, 115, 25, 22);
        this.AddSquare(5, 180, 25, 23);
        this.AddSquare(8, 245, 25, 24);
        this.AddSquare(8, 315, 25, 25);
        this.AddSquare(8, 385, 25, 26);
        this.AddSquare(8, 455, 25, 27);
        this.AddSquare(8, 525, 25, 28);
        this.AddSquare(8, 595, 25, 29);
        this.AddSquare(8, 660, 25, 30);
        this.AddSquare(2, 760, 25, 31);
        this.AddSquare(8, 760, 115, 32);
        this.AddSquare(8, 760, 180, 33);
        this.AddSquare(6, 760, 245, 34);
        this.AddSquare(8, 760, 315, 35);
        this.AddSquare(8, 760, 385, 36);
        this.AddSquare(5, 760, 455, 37);
        this.AddSquare(8, 760, 525, 38);
        this.AddSquare(7, 760, 595, 39);
        this.AddSquare(8, 760, 660, 40);
    }
    
    private void CrearPropiedades() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Propiedades.txt"));
            String line = null;
            int i = 0;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(", ");
                Properties NewProperty = new Properties(Integer.parseInt(temp[0]));
                propiedades[i] = NewProperty;
                i++;
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
