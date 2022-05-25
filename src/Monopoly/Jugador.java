package Monopoly;

import javax.swing.JOptionPane;

public class Jugador {

    Board board;
    Square pos;
    int dinero;
    Properties property;
    String nombre;
    boolean enCarcel;
    int turnosEnCarcel;
    int dobles;
    boolean TarjetaCarcel;
    Cartas carta;

    public Jugador(Board board) {
        this.board = board;
        this.pos = this.board.GoSquare;
        this.dinero = 1500;
        this.property = null;
        this.nombre = "Jugador";
        this.enCarcel = false;
        this.turnosEnCarcel = 0;
        this.TarjetaCarcel = false;
    }

    public void Accion() {
        //Esta será llamada al finalizar cada turno, para que se aplique la propiedad de cada casilla

        switch (pos.type) {
            case 2:
                JOptionPane.showMessageDialog(null, "Caíste en la primiparada", "", 0);
                while (pos.type != 3) {
                    pos = pos.next;
                }
                enCarcel = true;
                break;
            case 5:
                carta = new Cartas();
                carta.sacarTarjetaDuNord();
                System.out.println(carta.numero);
                switch (carta.numero) {
                    case 1:
                        while (pos.pos != 14) {
                            pos = pos.next;
                            if (pos.type == 1) {
                                dinero += 200;
                            }
                        }
                        break;
                    case 2:
                        dinero += 150;
                        break;
                    case 3:
                        while (pos.pos != 30) {
                            pos = pos.next;
                        }
                        break;
                    case 4:
                        for (int i = 0; i < 3; i++) {
                            pos = pos.prev;
                        }
                        break;
                    case 5:
                        while (pos.pos != 36) {
                            pos = pos.next;
                            if (pos.type == 1) {
                                dinero += 200;
                            }
                        }
                        break;
                    case 7:
                        while (pos.type != 1) {
                            pos = pos.next;
                        }
                        dinero += 200;
                        break;
                    case 8:
                        enCarcel = true;
                        while (pos.type != 3) {
                            pos = pos.next;
                        }
                        break;
                }
                pos.type = 5;
                break;
            case 6:
                carta = new Cartas();
                carta.sacarTarjetaDuNord();
                switch (carta.numero) {
                    case 1:
                        dinero -= 100;
                        break;
                    case 2:
                        dinero -= 200;
                        break;
                    case 3:
                        while (pos.type != 1) {
                            pos = pos.next;
                        }
                        break;
                    case 4:
                        dinero += 50;
                        break;
                    case 5:
                        dinero -= 100;
                        break;
                    case 6:
                        dinero -= 150;
                        break;
                    case 7:
                        pos = pos.prev;
                        pos = pos.prev;
                        pos = pos.prev;
                        break;
                    case 8:
                        dinero -= 50;
                        break;
                }
                pos.type = 6;
                break;
            case 7:
                if (pos.pos == 5) {
                    dinero -= 200;
                    JOptionPane.showMessageDialog(null, nombre + " paga 200 para repetir la materia");
                } else {
                    dinero -= 100;
                    JOptionPane.showMessageDialog(null, nombre + " paga 100 para arreglar el computador");
                }
                break;
            case 8:
                int i = 0;
                property = board.propiedades[i];
                while (pos.pos != property.BoardPos) {
                    i++;
                    property = board.propiedades[i];
                }
                break;

        }
        if (pos.type != 8) {
            property = null;
        }
    }
}
