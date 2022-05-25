package Monopoly;

public class Square {

    int type, x, y, pos;
    Square next, prev;
    String description;
    Properties property;

    public Square(int type, int x, int y, int pos) {
        this.type = type;
        this.x = x;
        this.y = y;
        next = this;
        prev = this;
        this.pos = pos;
        this.AssignProperty();
    }

    private void AssignProperty() {
        switch (this.type) {
            case 1:
                description = "Entrada";
                break;
            case 2:
                description = "Ve a la primiparada";
                break;
            case 3:
                description = "Primiparada";
                break;
            case 4:
                description = "Mesitas de descanso";
                break;
            case 5:
                description = "Bonos DuNord";
                break;
            case 6:
                description = "Objetos Perdidos";
                break;
            case 7:
                description = "Pagas a la U";
                break;
            case 8:
                description = "Bloques y tiendas";
                break;
        }
    }
    
    
}
