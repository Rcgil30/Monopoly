package Monopoly;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Properties {

    String name;
    int price, rent, BoardPos;
    String owner;
    boolean owned;

    public Properties(int BoardPos) {
        this.BoardPos = BoardPos;
        owner = "Bancario";
        owned = false;
        AssignProperty();
    }

    private void AssignProperty() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Propiedades.txt"));
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(", ");
                if(BoardPos == Integer.parseInt(temp[0])){
                    name = temp[1];
                    price = Integer.parseInt(temp[2]);
                    rent = Integer.parseInt(temp[3]);
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
