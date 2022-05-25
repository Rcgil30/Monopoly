package Monopoly;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

// Perdón por la falta de comentarios profe, estaba muy largo ;-;
/*@authors Roberto Gil, Juan Infante, Andrés Lorduy, Esteban Pérez*/
public class Interface extends javax.swing.JFrame {

    public Interface() {
        initComponents();
        Image ico = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Images/logo UN.png"));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setIconImage(ico);
        BoardFrame.setSize(1300, 920);
        BoardFrame.setResizable(false);
        BoardFrame.setLocationRelativeTo(null);
        BoardFrame.setIconImage(ico);
        CompraPropiedades.setSize(848, 817);
        CompraPropiedades.setResizable(false);
        CompraPropiedades.setLocationRelativeTo(null);
        CompraPropiedades.setIconImage(ico);
        NameSelector.setSize(430, 360);
        NameSelector.setResizable(false);
        NameSelector.setLocationRelativeTo(null);
        NameSelector.setIconImage(ico);
        TurnSelector.setSize(570, 360);
        TurnSelector.setResizable(false);
        TurnSelector.setLocationRelativeTo(null);
        TurnSelector.setIconImage(ico);
        VerPropiedades.setSize(720, 1000);
        VerPropiedades.setResizable(false);
        VerPropiedades.setLocationRelativeTo(null);
        VerPropiedades.setIconImage(ico);
        MenuFinal.setSize(914, 513);
        MenuFinal.setResizable(false);
        MenuFinal.setLocationRelativeTo(null);
        MenuFinal.setIconImage(ico);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BoardFrame = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        Mover = new javax.swing.JButton();
        Ficha1 = new javax.swing.JLabel();
        Ficha2 = new javax.swing.JLabel();
        Ficha3 = new javax.swing.JLabel();
        Ficha4 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        BotonDados = new javax.swing.JButton();
        Cara1Dado2 = new javax.swing.JLabel();
        Cara1Dado1 = new javax.swing.JLabel();
        Cara2Dado1 = new javax.swing.JLabel();
        Cara2Dado2 = new javax.swing.JLabel();
        Cara3Dado1 = new javax.swing.JLabel();
        Cara3Dado2 = new javax.swing.JLabel();
        Cara4Dado1 = new javax.swing.JLabel();
        Cara4Dado2 = new javax.swing.JLabel();
        Cara5Dado1 = new javax.swing.JLabel();
        Cara5Dado2 = new javax.swing.JLabel();
        Cara6Dado1 = new javax.swing.JLabel();
        Cara6Dado2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LabelDineroP1 = new java.awt.Label();
        TurnoActual = new java.awt.Label();
        LabelDineroP2 = new java.awt.Label();
        LabelDineroP3 = new java.awt.Label();
        LabelDineroP4 = new java.awt.Label();
        MarcoP4 = new javax.swing.JLabel();
        MarcoP3 = new javax.swing.JLabel();
        MarcoP2 = new javax.swing.JLabel();
        MarcoP1 = new javax.swing.JLabel();
        LabelP4 = new javax.swing.JLabel();
        LabelP3 = new javax.swing.JLabel();
        LabelP1 = new javax.swing.JLabel();
        LabelP2 = new javax.swing.JLabel();
        CambiarTurno = new javax.swing.JButton();
        BotonPropiedades = new javax.swing.JButton();
        CompraPropiedades = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PriceLabel = new javax.swing.JLabel();
        BotonComprar = new javax.swing.JButton();
        BotonIgnorar = new javax.swing.JButton();
        LabelPropiedad = new javax.swing.JLabel();
        TurnSelector = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BotonPrioridadP1 = new javax.swing.JButton();
        BotonPrioridadP2 = new javax.swing.JButton();
        BotonPrioridadP3 = new javax.swing.JButton();
        BotonPrioridadP4 = new javax.swing.JButton();
        PCara1Dado1 = new javax.swing.JLabel();
        ResultadoLabel1 = new javax.swing.JLabel();
        ResultadoLabel2 = new javax.swing.JLabel();
        ResultadoLabel3 = new javax.swing.JLabel();
        ResultadoLabel4 = new javax.swing.JLabel();
        PCara1Dado2 = new javax.swing.JLabel();
        PCara1Dado3 = new javax.swing.JLabel();
        PCara1Dado4 = new javax.swing.JLabel();
        PCara1Dado5 = new javax.swing.JLabel();
        PCara1Dado6 = new javax.swing.JLabel();
        PCara2Dado1 = new javax.swing.JLabel();
        PCara2Dado2 = new javax.swing.JLabel();
        PCara2Dado3 = new javax.swing.JLabel();
        PCara2Dado4 = new javax.swing.JLabel();
        PCara2Dado5 = new javax.swing.JLabel();
        PCara2Dado6 = new javax.swing.JLabel();
        AceptarTurno = new javax.swing.JButton();
        NameSelector = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        Name1Label = new javax.swing.JLabel();
        Name2Label = new javax.swing.JLabel();
        Name4Label = new javax.swing.JLabel();
        Name3Label = new javax.swing.JLabel();
        NameTitle = new javax.swing.JLabel();
        Name2TextF = new javax.swing.JTextField();
        Name1TextF = new javax.swing.JTextField();
        Name3TextF = new javax.swing.JTextField();
        Name4TextF = new javax.swing.JTextField();
        AceptarNombres = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        VerPropiedades = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        DueñoBloqueA = new javax.swing.JLabel();
        DueñoBloqueB = new javax.swing.JLabel();
        DueñoSobusa = new javax.swing.JLabel();
        DueñoBloqueC = new javax.swing.JLabel();
        DueñoBloqueD = new javax.swing.JLabel();
        DueñoBloqueE = new javax.swing.JLabel();
        DueñoBloqueF = new javax.swing.JLabel();
        DueñoBloqueG = new javax.swing.JLabel();
        DueñoBloqueI = new javax.swing.JLabel();
        DueñoBloqueJ = new javax.swing.JLabel();
        DueñoBloqueK = new javax.swing.JLabel();
        DueñoBloqueL = new javax.swing.JLabel();
        DueñoAire = new javax.swing.JLabel();
        DueñoCarolina = new javax.swing.JLabel();
        DueñoArquitectura = new javax.swing.JLabel();
        DueñoEnergias = new javax.swing.JLabel();
        DueñoSalud = new javax.swing.JLabel();
        DueñoTransmetro = new javax.swing.JLabel();
        DueñoExpress = new javax.swing.JLabel();
        DueñoPlaza = new javax.swing.JLabel();
        DueñoBaños = new javax.swing.JLabel();
        DueñoCafe = new javax.swing.JLabel();
        DueñoKcp = new javax.swing.JLabel();
        DueñoColiseo = new javax.swing.JLabel();
        DueñoCasaEstudio = new javax.swing.JLabel();
        DueñoCoolitoral = new javax.swing.JLabel();
        DueñoKm5 = new javax.swing.JLabel();
        Dueño1966 = new javax.swing.JLabel();
        MenuFinal = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        start2p = new javax.swing.JButton();
        start3p = new javax.swing.JButton();
        start4p = new javax.swing.JButton();

        BoardFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        BoardFrame.setTitle("Monopoly");

        jPanel2.setBackground(new java.awt.Color(248, 215, 208));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mover.setBackground(new java.awt.Color(255, 23, 23));
        Mover.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Mover.setForeground(new java.awt.Color(255, 255, 255));
        Mover.setText("Mover Ficha");
        Mover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoverActionPerformed(evt);
            }
        });
        jPanel2.add(Mover, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, -1, 40));

        Ficha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ficha1.png"))); // NOI18N
        jPanel2.add(Ficha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 730, 50, 30));

        Ficha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ficha2.png"))); // NOI18N
        jPanel2.add(Ficha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 780, -1, -1));

        Ficha3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ficha3.png"))); // NOI18N
        jPanel2.add(Ficha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 720, -1, -1));

        Ficha4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ficha4.png"))); // NOI18N
        jPanel2.add(Ficha4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 780, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Board.PNG"))); // NOI18N
        jPanel2.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BotonDados.setBackground(new java.awt.Color(255, 23, 23));
        BotonDados.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        BotonDados.setForeground(new java.awt.Color(255, 255, 255));
        BotonDados.setText("Tirar dados");
        BotonDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDadosActionPerformed(evt);
            }
        });
        jPanel2.add(BotonDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 50, -1, 40));

        Cara1Dado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cara1.png"))); // NOI18N
        jPanel2.add(Cara1Dado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 270, -1, -1));

        Cara1Dado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cara1.png"))); // NOI18N
        jPanel2.add(Cara1Dado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 270, -1, -1));

        Cara2Dado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cara2.png"))); // NOI18N
        jPanel2.add(Cara2Dado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 270, -1, -1));

        Cara2Dado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cara2.png"))); // NOI18N
        jPanel2.add(Cara2Dado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 270, -1, 60));

        Cara3Dado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cara3.png"))); // NOI18N
        jPanel2.add(Cara3Dado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 270, -1, -1));

        Cara3Dado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cara3.png"))); // NOI18N
        jPanel2.add(Cara3Dado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 270, -1, -1));

        Cara4Dado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cara4.png"))); // NOI18N
        jPanel2.add(Cara4Dado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 270, -1, -1));

        Cara4Dado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cara4.png"))); // NOI18N
        jPanel2.add(Cara4Dado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 270, -1, -1));

        Cara5Dado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cara5.png"))); // NOI18N
        jPanel2.add(Cara5Dado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 270, -1, -1));

        Cara5Dado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cara5.png"))); // NOI18N
        jPanel2.add(Cara5Dado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 270, -1, -1));

        Cara6Dado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cara6.png"))); // NOI18N
        jPanel2.add(Cara6Dado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 270, -1, -1));

        Cara6Dado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cara6.png"))); // NOI18N
        jPanel2.add(Cara6Dado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 270, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Turno en los Dados");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DINERO");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 400, -1, -1));

        LabelDineroP1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LabelDineroP1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        LabelDineroP1.setText("$1500");
        jPanel2.add(LabelDineroP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 480, -1, -1));

        TurnoActual.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        TurnoActual.setText("Jugador 1");
        jPanel2.add(TurnoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 110, 130, 50));

        LabelDineroP2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        LabelDineroP2.setText("$1500");
        jPanel2.add(LabelDineroP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 570, -1, -1));

        LabelDineroP3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        LabelDineroP3.setText("$1500");
        jPanel2.add(LabelDineroP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 670, -1, -1));

        LabelDineroP4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        LabelDineroP4.setText("$1500");
        jPanel2.add(LabelDineroP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 770, -1, -1));

        MarcoP4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BordeDinero.png"))); // NOI18N
        jPanel2.add(MarcoP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 750, -1, -1));

        MarcoP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BordeDinero.png"))); // NOI18N
        jPanel2.add(MarcoP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 650, -1, -1));

        MarcoP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BordeDinero.png"))); // NOI18N
        jPanel2.add(MarcoP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 550, -1, -1));

        MarcoP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BordeDinero.png"))); // NOI18N
        jPanel2.add(MarcoP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 460, -1, -1));

        LabelP4.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        LabelP4.setForeground(new java.awt.Color(0, 0, 0));
        LabelP4.setText("Player1:");
        jPanel2.add(LabelP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 770, -1, -1));

        LabelP3.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        LabelP3.setForeground(new java.awt.Color(0, 0, 0));
        LabelP3.setText("Player1:");
        jPanel2.add(LabelP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 670, -1, -1));

        LabelP1.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        LabelP1.setForeground(new java.awt.Color(0, 0, 0));
        LabelP1.setText("Player1:");
        jPanel2.add(LabelP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 480, -1, -1));

        LabelP2.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        LabelP2.setForeground(new java.awt.Color(0, 0, 0));
        LabelP2.setText("Player1:");
        jPanel2.add(LabelP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 570, -1, -1));

        CambiarTurno.setBackground(new java.awt.Color(255, 23, 23));
        CambiarTurno.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        CambiarTurno.setForeground(new java.awt.Color(255, 255, 255));
        CambiarTurno.setText("Cambiar Turno");
        CambiarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarTurnoActionPerformed(evt);
            }
        });
        jPanel2.add(CambiarTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, 130, 40));

        BotonPropiedades.setBackground(new java.awt.Color(255, 23, 23));
        BotonPropiedades.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        BotonPropiedades.setForeground(new java.awt.Color(255, 255, 255));
        BotonPropiedades.setText("Ver dueños propiedades");
        BotonPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPropiedadesActionPerformed(evt);
            }
        });
        jPanel2.add(BotonPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 200, 190, 40));

        javax.swing.GroupLayout BoardFrameLayout = new javax.swing.GroupLayout(BoardFrame.getContentPane());
        BoardFrame.getContentPane().setLayout(BoardFrameLayout);
        BoardFrameLayout.setHorizontalGroup(
            BoardFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BoardFrameLayout.setVerticalGroup(
            BoardFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        CompraPropiedades.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        CompraPropiedades.setTitle("Monopoly");
        CompraPropiedades.setAlwaysOnTop(true);
        CompraPropiedades.setResizable(false);

        jPanel3.setBackground(new java.awt.Color(248, 215, 208));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Price:");

        PriceLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        PriceLabel.setForeground(new java.awt.Color(51, 51, 51));
        PriceLabel.setText("0");

        BotonComprar.setBackground(new java.awt.Color(255, 255, 255));
        BotonComprar.setForeground(new java.awt.Color(0, 0, 0));
        BotonComprar.setText("Comprar propiedad");
        BotonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonComprarActionPerformed(evt);
            }
        });

        BotonIgnorar.setBackground(new java.awt.Color(255, 255, 255));
        BotonIgnorar.setForeground(new java.awt.Color(0, 0, 0));
        BotonIgnorar.setText("Ignorar");
        BotonIgnorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIgnorarActionPerformed(evt);
            }
        });

        LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bloque A.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelPropiedad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(58, 58, 58)
                        .addComponent(PriceLabel))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonIgnorar)
                            .addComponent(BotonComprar))))
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(PriceLabel))
                        .addGap(12, 12, 12)
                        .addComponent(BotonComprar)
                        .addGap(18, 18, 18)
                        .addComponent(BotonIgnorar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelPropiedad)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CompraPropiedadesLayout = new javax.swing.GroupLayout(CompraPropiedades.getContentPane());
        CompraPropiedades.getContentPane().setLayout(CompraPropiedadesLayout);
        CompraPropiedadesLayout.setHorizontalGroup(
            CompraPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CompraPropiedadesLayout.setVerticalGroup(
            CompraPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TurnSelector.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        TurnSelector.setTitle("Monopoly");

        jPanel5.setBackground(new java.awt.Color(248, 215, 208));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Jugador 1:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 78, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Jugador 2:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 142, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Jugador 4:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 264, -1, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Jugador 3:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 204, -1, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 28)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Prioridad");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        BotonPrioridadP1.setBackground(new java.awt.Color(255, 255, 255));
        BotonPrioridadP1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        BotonPrioridadP1.setForeground(new java.awt.Color(0, 0, 0));
        BotonPrioridadP1.setText("Tirar dados");
        BotonPrioridadP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPrioridadP1ActionPerformed(evt);
            }
        });
        jPanel5.add(BotonPrioridadP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 72, -1, -1));

        BotonPrioridadP2.setBackground(new java.awt.Color(255, 255, 255));
        BotonPrioridadP2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        BotonPrioridadP2.setForeground(new java.awt.Color(0, 0, 0));
        BotonPrioridadP2.setText("Tirar dados");
        BotonPrioridadP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPrioridadP2ActionPerformed(evt);
            }
        });
        jPanel5.add(BotonPrioridadP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 136, -1, -1));

        BotonPrioridadP3.setBackground(new java.awt.Color(255, 255, 255));
        BotonPrioridadP3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        BotonPrioridadP3.setForeground(new java.awt.Color(0, 0, 0));
        BotonPrioridadP3.setText("Tirar dados");
        BotonPrioridadP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPrioridadP3ActionPerformed(evt);
            }
        });
        jPanel5.add(BotonPrioridadP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 198, -1, -1));

        BotonPrioridadP4.setBackground(new java.awt.Color(255, 255, 255));
        BotonPrioridadP4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        BotonPrioridadP4.setForeground(new java.awt.Color(0, 0, 0));
        BotonPrioridadP4.setText("Tirar dados");
        BotonPrioridadP4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPrioridadP4ActionPerformed(evt);
            }
        });
        jPanel5.add(BotonPrioridadP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 258, -1, -1));

        PCara1Dado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cara1.png"))); // NOI18N
        jPanel5.add(PCara1Dado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        ResultadoLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        ResultadoLabel1.setForeground(new java.awt.Color(0, 0, 0));
        ResultadoLabel1.setText("0");
        jPanel5.add(ResultadoLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        ResultadoLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        ResultadoLabel2.setForeground(new java.awt.Color(0, 0, 0));
        ResultadoLabel2.setText("0");
        jPanel5.add(ResultadoLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        ResultadoLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        ResultadoLabel3.setForeground(new java.awt.Color(0, 0, 0));
        ResultadoLabel3.setText("0");
        jPanel5.add(ResultadoLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        ResultadoLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        ResultadoLabel4.setForeground(new java.awt.Color(0, 0, 0));
        ResultadoLabel4.setText("0");
        jPanel5.add(ResultadoLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        PCara1Dado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cara2.png"))); // NOI18N
        jPanel5.add(PCara1Dado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        PCara1Dado3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cara3.png"))); // NOI18N
        jPanel5.add(PCara1Dado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        PCara1Dado4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cara4.png"))); // NOI18N
        jPanel5.add(PCara1Dado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        PCara1Dado5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cara5.png"))); // NOI18N
        jPanel5.add(PCara1Dado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        PCara1Dado6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cara6.png"))); // NOI18N
        jPanel5.add(PCara1Dado6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        PCara2Dado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cara1.png"))); // NOI18N
        jPanel5.add(PCara2Dado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        PCara2Dado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cara2.png"))); // NOI18N
        jPanel5.add(PCara2Dado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        PCara2Dado3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cara3.png"))); // NOI18N
        jPanel5.add(PCara2Dado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        PCara2Dado4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cara4.png"))); // NOI18N
        jPanel5.add(PCara2Dado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        PCara2Dado5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cara5.png"))); // NOI18N
        jPanel5.add(PCara2Dado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        PCara2Dado6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cara6.png"))); // NOI18N
        jPanel5.add(PCara2Dado6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 60, -1));

        AceptarTurno.setBackground(new java.awt.Color(255, 255, 255));
        AceptarTurno.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        AceptarTurno.setForeground(new java.awt.Color(0, 0, 0));
        AceptarTurno.setText("Aceptar");
        AceptarTurno.setEnabled(false);
        AceptarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarTurnoActionPerformed(evt);
            }
        });
        jPanel5.add(AceptarTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        javax.swing.GroupLayout TurnSelectorLayout = new javax.swing.GroupLayout(TurnSelector.getContentPane());
        TurnSelector.getContentPane().setLayout(TurnSelectorLayout);
        TurnSelectorLayout.setHorizontalGroup(
            TurnSelectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TurnSelectorLayout.setVerticalGroup(
            TurnSelectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        NameSelector.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        NameSelector.setTitle("Monopoly");

        jPanel4.setBackground(new java.awt.Color(248, 215, 208));

        Name1Label.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Name1Label.setForeground(new java.awt.Color(0, 0, 0));
        Name1Label.setText("Nombre 1:");

        Name2Label.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Name2Label.setForeground(new java.awt.Color(0, 0, 0));
        Name2Label.setText("Nombre 2:");

        Name4Label.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Name4Label.setForeground(new java.awt.Color(0, 0, 0));
        Name4Label.setText("Nombre 4:");

        Name3Label.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Name3Label.setForeground(new java.awt.Color(0, 0, 0));
        Name3Label.setText("Nombre 3:");

        NameTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 28)); // NOI18N
        NameTitle.setForeground(new java.awt.Color(0, 0, 0));
        NameTitle.setText("Introduce los nombres");

        Name2TextF.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N

        Name1TextF.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N

        Name3TextF.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N

        Name4TextF.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N

        AceptarNombres.setBackground(new java.awt.Color(255, 255, 255));
        AceptarNombres.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        AceptarNombres.setForeground(new java.awt.Color(0, 0, 0));
        AceptarNombres.setText("Aceptar");
        AceptarNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarNombresActionPerformed(evt);
            }
        });

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back button.png"))); // NOI18N
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(NameTitle))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AceptarNombres))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Name1Label)
                                    .addComponent(Name2Label)
                                    .addComponent(Name3Label)
                                    .addComponent(Name4Label))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Name2TextF, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Name1TextF, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Name3TextF, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Name4TextF, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(NameTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name1Label)
                    .addComponent(Name1TextF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name2TextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name2Label))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name3TextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name3Label))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name4Label)
                    .addComponent(Name4TextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AceptarNombres)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout NameSelectorLayout = new javax.swing.GroupLayout(NameSelector.getContentPane());
        NameSelector.getContentPane().setLayout(NameSelectorLayout);
        NameSelectorLayout.setHorizontalGroup(
            NameSelectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        NameSelectorLayout.setVerticalGroup(
            NameSelectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        VerPropiedades.setTitle("Monopoly");

        jPanel6.setBackground(new java.awt.Color(248, 215, 208));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Bloque A:");

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Bloque B:");

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Bloque C:");

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Bloque D:");

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Bloque E:");

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Bloque F:");

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Bloque G:");

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Bloque I:");

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Bloque J:");

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Bloque K:");

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Bloque L:");

        jLabel24.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setText("Propiedades");

        jLabel25.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Lab. Energías:");

        jLabel26.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Lab. Arquitectura:");

        jLabel27.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Bloque salud:");

        jLabel28.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Transmetro:");

        jLabel29.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Sobusa:");

        jLabel30.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Air-e:");

        jLabel31.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("La Carolina:");

        jLabel32.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("DuNord Express:");

        jLabel33.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("DuNord Plaza:");

        jLabel34.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Baños Uninorte:");

        jLabel35.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Café DuNord:");

        jLabel36.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Biblioteca KCP:");

        jLabel37.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Coliseo Cultural:");

        jLabel38.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Casa Estudio:");

        jLabel39.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("Coolitoral:");

        jLabel40.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("KM5:");

        jLabel41.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("Restaurante 1966:");

        DueñoBloqueA.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        DueñoBloqueA.setForeground(new java.awt.Color(0, 0, 0));
        DueñoBloqueA.setText("Bancario");

        DueñoBloqueB.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        DueñoBloqueB.setForeground(new java.awt.Color(0, 0, 0));
        DueñoBloqueB.setText("Bancario");

        DueñoSobusa.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        DueñoSobusa.setForeground(new java.awt.Color(0, 0, 0));
        DueñoSobusa.setText("Bancario");

        DueñoBloqueC.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        DueñoBloqueC.setForeground(new java.awt.Color(0, 0, 0));
        DueñoBloqueC.setText("Bancario");

        DueñoBloqueD.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        DueñoBloqueD.setForeground(new java.awt.Color(0, 0, 0));
        DueñoBloqueD.setText("Bancario");

        DueñoBloqueE.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        DueñoBloqueE.setForeground(new java.awt.Color(0, 0, 0));
        DueñoBloqueE.setText("Bancario");

        DueñoBloqueF.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        DueñoBloqueF.setForeground(new java.awt.Color(0, 0, 0));
        DueñoBloqueF.setText("Bancario");

        DueñoBloqueG.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        DueñoBloqueG.setForeground(new java.awt.Color(0, 0, 0));
        DueñoBloqueG.setText("Bancario");

        DueñoBloqueI.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        DueñoBloqueI.setForeground(new java.awt.Color(0, 0, 0));
        DueñoBloqueI.setText("Bancario");

        DueñoBloqueJ.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        DueñoBloqueJ.setForeground(new java.awt.Color(0, 0, 0));
        DueñoBloqueJ.setText("Bancario");

        DueñoBloqueK.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        DueñoBloqueK.setForeground(new java.awt.Color(0, 0, 0));
        DueñoBloqueK.setText("Bancario");

        DueñoBloqueL.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        DueñoBloqueL.setForeground(new java.awt.Color(0, 0, 0));
        DueñoBloqueL.setText("Bancario");

        DueñoAire.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        DueñoAire.setForeground(new java.awt.Color(0, 0, 0));
        DueñoAire.setText("Bancario");

        DueñoCarolina.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        DueñoCarolina.setForeground(new java.awt.Color(0, 0, 0));
        DueñoCarolina.setText("Bancario");

        DueñoArquitectura.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        DueñoArquitectura.setForeground(new java.awt.Color(0, 0, 0));
        DueñoArquitectura.setText("Bancario");

        DueñoEnergias.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        DueñoEnergias.setForeground(new java.awt.Color(0, 0, 0));
        DueñoEnergias.setText("Bancario");

        DueñoSalud.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        DueñoSalud.setForeground(new java.awt.Color(0, 0, 0));
        DueñoSalud.setText("Bancario");

        DueñoTransmetro.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        DueñoTransmetro.setForeground(new java.awt.Color(0, 0, 0));
        DueñoTransmetro.setText("Bancario");

        DueñoExpress.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        DueñoExpress.setForeground(new java.awt.Color(0, 0, 0));
        DueñoExpress.setText("Bancario");

        DueñoPlaza.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        DueñoPlaza.setForeground(new java.awt.Color(0, 0, 0));
        DueñoPlaza.setText("Bancario");

        DueñoBaños.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        DueñoBaños.setForeground(new java.awt.Color(0, 0, 0));
        DueñoBaños.setText("Bancario");

        DueñoCafe.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        DueñoCafe.setForeground(new java.awt.Color(0, 0, 0));
        DueñoCafe.setText("Bancario");

        DueñoKcp.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        DueñoKcp.setForeground(new java.awt.Color(0, 0, 0));
        DueñoKcp.setText("Bancario");

        DueñoColiseo.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        DueñoColiseo.setForeground(new java.awt.Color(0, 0, 0));
        DueñoColiseo.setText("Bancario");

        DueñoCasaEstudio.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        DueñoCasaEstudio.setForeground(new java.awt.Color(0, 0, 0));
        DueñoCasaEstudio.setText("Bancario");

        DueñoCoolitoral.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        DueñoCoolitoral.setForeground(new java.awt.Color(0, 0, 0));
        DueñoCoolitoral.setText("Bancario");

        DueñoKm5.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        DueñoKm5.setForeground(new java.awt.Color(0, 0, 0));
        DueñoKm5.setText("Bancario");

        Dueño1966.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        Dueño1966.setForeground(new java.awt.Color(0, 0, 0));
        Dueño1966.setText("Bancario");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DueñoBloqueJ))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DueñoBloqueK))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DueñoBloqueL))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel31))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DueñoCarolina)
                                    .addComponent(DueñoAire)
                                    .addComponent(DueñoBloqueI)
                                    .addComponent(DueñoBloqueG)
                                    .addComponent(DueñoBloqueF)
                                    .addComponent(DueñoBloqueE)
                                    .addComponent(DueñoBloqueA)
                                    .addComponent(DueñoBloqueB)
                                    .addComponent(DueñoSobusa)
                                    .addComponent(DueñoBloqueC)
                                    .addComponent(DueñoBloqueD))))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Dueño1966))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel28)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DueñoTransmetro))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel27)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DueñoSalud))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel25)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DueñoEnergias))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel26)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(DueñoArquitectura)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel40))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DueñoKm5)
                                    .addComponent(DueñoCoolitoral)
                                    .addComponent(DueñoCasaEstudio)
                                    .addComponent(DueñoColiseo)
                                    .addComponent(DueñoKcp)
                                    .addComponent(DueñoCafe)
                                    .addComponent(DueñoBaños)
                                    .addComponent(DueñoPlaza)
                                    .addComponent(DueñoExpress)))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel24)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel25)
                    .addComponent(DueñoBloqueA)
                    .addComponent(DueñoEnergias))
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel26)
                    .addComponent(DueñoBloqueB)
                    .addComponent(DueñoArquitectura))
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel27)
                    .addComponent(DueñoSobusa)
                    .addComponent(DueñoSalud))
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel28)
                    .addComponent(DueñoBloqueC)
                    .addComponent(DueñoTransmetro))
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel32)
                    .addComponent(DueñoBloqueD)
                    .addComponent(DueñoExpress))
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel33)
                    .addComponent(DueñoBloqueE)
                    .addComponent(DueñoPlaza))
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel34)
                    .addComponent(DueñoBloqueF)
                    .addComponent(DueñoBaños))
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel35)
                    .addComponent(DueñoAire)
                    .addComponent(DueñoCafe))
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel36)
                    .addComponent(DueñoBloqueG)
                    .addComponent(DueñoKcp))
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel37)
                    .addComponent(DueñoBloqueI)
                    .addComponent(DueñoColiseo))
                .addGap(38, 38, 38)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel38)
                    .addComponent(DueñoCarolina)
                    .addComponent(DueñoCasaEstudio))
                .addGap(46, 46, 46)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel39)
                    .addComponent(DueñoBloqueJ)
                    .addComponent(DueñoCoolitoral))
                .addGap(43, 43, 43)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel40)
                    .addComponent(DueñoBloqueK)
                    .addComponent(DueñoKm5))
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel41)
                    .addComponent(DueñoBloqueL)
                    .addComponent(Dueño1966))
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout VerPropiedadesLayout = new javax.swing.GroupLayout(VerPropiedades.getContentPane());
        VerPropiedades.getContentPane().setLayout(VerPropiedadesLayout);
        VerPropiedadesLayout.setHorizontalGroup(
            VerPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VerPropiedadesLayout.setVerticalGroup(
            VerPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        MenuFinal.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Menu Final.PNG"))); // NOI18N

        javax.swing.GroupLayout MenuFinalLayout = new javax.swing.GroupLayout(MenuFinal.getContentPane());
        MenuFinal.getContentPane().setLayout(MenuFinalLayout);
        MenuFinalLayout.setHorizontalGroup(
            MenuFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5)
        );
        MenuFinalLayout.setVerticalGroup(
            MenuFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monopoly");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(252, 67, 57));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo.png"))); // NOI18N

        start2p.setBackground(new java.awt.Color(255, 255, 255));
        start2p.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        start2p.setForeground(new java.awt.Color(51, 51, 51));
        start2p.setText("2 Players");
        start2p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start2pActionPerformed(evt);
            }
        });

        start3p.setBackground(new java.awt.Color(255, 255, 255));
        start3p.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        start3p.setForeground(new java.awt.Color(51, 51, 51));
        start3p.setText("3 Players");
        start3p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start3pActionPerformed(evt);
            }
        });

        start4p.setBackground(new java.awt.Color(255, 255, 255));
        start4p.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        start4p.setForeground(new java.awt.Color(51, 51, 51));
        start4p.setText("4 Players");
        start4p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start4pActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(start2p, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(start3p, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(start4p, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(start2p, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(start3p, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(start4p, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public int players;
    Square GoSquare = new Square(1, 760, 760, 1);
    Board Tablero = new Board(GoSquare);
    Square p = GoSquare;
    Dados dado = new Dados();
    int turno = 1;
    Jugador player1 = new Jugador(Tablero);
    Jugador player2 = new Jugador(Tablero);
    Jugador player3 = new Jugador(Tablero);
    Jugador player4 = new Jugador(Tablero);
    Jugador Banquero = new Jugador(Tablero);
    Turnos turno1 = new Turnos(0, "");
    Turnos turno2 = new Turnos(0, "");
    Turnos turno3 = new Turnos(0, "");
    Turnos turno4 = new Turnos(0, "");


    private void start2pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start2pActionPerformed
        players = 2;
        Ficha3.setVisible(false);
        Ficha4.setVisible(false);
        Name3TextF.setEnabled(false);
        Name4TextF.setEnabled(false);
        MarcoP3.setVisible(false);
        MarcoP4.setVisible(false);
        LabelDineroP3.setVisible(false);
        LabelDineroP4.setVisible(false);
        LabelP3.setVisible(false);
        LabelP4.setVisible(false);
        AsignarNombres();

    }//GEN-LAST:event_start2pActionPerformed

    private void start3pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start3pActionPerformed
        players = 3;
        Ficha4.setVisible(false);
        Name4TextF.setEnabled(false);
        MarcoP4.setVisible(false);
        LabelDineroP4.setVisible(false);
        LabelP4.setVisible(false);
        AsignarNombres();
    }//GEN-LAST:event_start3pActionPerformed

    private void start4pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start4pActionPerformed
        players = 4;
        AsignarNombres();
    }//GEN-LAST:event_start4pActionPerformed

    void AsignarNombres() {
        Name1TextF.setText("");
        Name2TextF.setText("");
        Name3TextF.setText("");
        Name4TextF.setText("");
        NameSelector.setVisible(true);
        this.setVisible(false);
    }

    void ReiniciarPropiedades(Jugador player) {
        for (Properties propiedade : Tablero.propiedades) {
            if (propiedade.owner.equals(player.nombre)) {
                propiedade.owner = "Bancario";
                propiedade.owned = false;
            }
        }
    }

    private void MoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoverActionPerformed
        int Aux = turno % players;
        if (Aux == 1) {
            if (player1 != null) {
                if (!player1.enCarcel) {
                    for (int i = 0; i < dado.result; i++) {
                        player1.pos = player1.pos.next;
                        if (player1.pos == GoSquare) {
                            JOptionPane.showMessageDialog(null, "Recibe $200 por pasar por la salida", "Jugador: " + player1.nombre, JOptionPane.DEFAULT_OPTION);
                            player1.dinero += 200;
                        }
                    }
                    Ficha1.setLocation(player1.pos.x, player1.pos.y);
                    player1.Accion();

                    if (player1.pos.type == 8) {
                        if (player1.property.owner.equals("Bancario")) {
                            PriceLabel.setText(String.valueOf(player1.property.price));
                            ImagenPropiedad(player1);
                            CompraPropiedades.setTitle("Jugador: " + player1.nombre);
                            CompraPropiedades.setVisible(true);
                        }
                        if (player1.property.owned) {
                            if (player2 != null) {
                                if (player1.property.owner.equals(player2.nombre)) {
                                    player1.dinero -= player1.property.rent;
                                    player2.dinero += player1.property.rent;
                                    JOptionPane.showMessageDialog(null, player1.nombre + " le paga " + player1.property.rent + " a " + player2.nombre);
                                }
                            }
                            if (player3 != null) {
                                if (player1.property.owner.equals(player3.nombre)) {
                                    player1.dinero -= player1.property.rent;
                                    player3.dinero += player1.property.rent;
                                    JOptionPane.showMessageDialog(null, player1.nombre + " le paga " + player1.property.rent + " a " + player3.nombre);
                                }
                            }
                            if (player4 != null) {
                                if (player1.property.owner.equals(player4.nombre)) {
                                    player1.dinero -= player1.property.rent;
                                    player4.dinero += player1.property.rent;
                                    JOptionPane.showMessageDialog(null, player1.nombre + " le paga " + player1.property.rent + " a " + player4.nombre);
                                }
                                player1.property = null;
                            }
                        }
                    }

                    if (player1.pos.type == 5) {
                        if (player1.carta.numero == 6) {
                            if (!(player1.TarjetaCarcel || player2.TarjetaCarcel || player3.TarjetaCarcel || player4.TarjetaCarcel)) {
                                player1.TarjetaCarcel = true;
                            } else {
                                while (player1.carta.numero == 6) {
                                    player1.Accion();
                                }
                                player1.TarjetaCarcel = false;
                            }
                        }
                    }

                    if (player1.pos.type == 5) {
                        ImageIcon icon = new ImageIcon();
                        switch (player1.carta.numero) {
                            case 1:
                                icon = new ImageIcon("src/Images/Bono dunord 1.png");
                                break;
                            case 2:
                                icon = new ImageIcon("src/Images/Bono dunord 2.png");
                                break;
                            case 3:
                                icon = new ImageIcon("src/Images/Bono dunord 3.png");
                                break;
                            case 4:
                                icon = new ImageIcon("src/Images/Bono dunord 4.png");
                                break;
                            case 5:
                                icon = new ImageIcon("src/Images/Bono dunord 5.png");
                                break;
                            case 6:
                                icon = new ImageIcon("src/Images/Bono dunord 6.png");
                                break;
                            case 7:
                                icon = new ImageIcon("src/Images/Bono dunord 7.png");
                                break;
                            case 8:
                                icon = new ImageIcon("src/Images/Bono dunord 8.png");
                                break;

                        }
                        JOptionPane.showMessageDialog(null, "", "Bono DuNord", JOptionPane.INFORMATION_MESSAGE, icon);
                    }
                    if (player1.pos.type == 6) {
                        ImageIcon icon = new ImageIcon();
                        switch (player1.carta.numero) {
                            case 1:
                                icon = new ImageIcon("src/Images/Objetos perdidos 1.png");
                                break;
                            case 2:
                                icon = new ImageIcon("src/Images/Objetos perdidos 2.png");
                                break;
                            case 3:
                                icon = new ImageIcon("src/Images/Objetos perdidos 3.png");
                                break;
                            case 4:
                                icon = new ImageIcon("src/Images/Objetos perdidos 4.png");
                                break;
                            case 5:
                                icon = new ImageIcon("src/Images/Objetos perdidos 5.png");
                                break;
                            case 6:
                                icon = new ImageIcon("src/Images/Objetos perdidos 6.png");
                                break;
                            case 7:
                                icon = new ImageIcon("src/Images/Objetos perdidos 7.png");
                                break;
                            case 8:
                                icon = new ImageIcon("src/Images/Objetos perdidos 8.png");
                                break;

                        }
                        JOptionPane.showMessageDialog(null, "", "Bono DuNord", JOptionPane.INFORMATION_MESSAGE, icon);
                    }
                    Ficha1.setLocation(player1.pos.x, player1.pos.y);
                } else {
                    if (player1.TarjetaCarcel) {
                        JOptionPane.showMessageDialog(null, "Usaste tu tarjeta de cárcel para salir");
                        player1.enCarcel = false;
                        turno--;
                    } else if (dado.Dado1 == dado.Dado2) {
                        player1.enCarcel = false;
                        player1.turnosEnCarcel = 0;
                        turno--;
                        JOptionPane.showMessageDialog(null, "Buena suerte, tiraste los dados y saliste de la primiparada");
                    } else {
                        player1.turnosEnCarcel++;
                        switch (player1.turnosEnCarcel) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "No encontraste el salón y llegaste tarde a clase, sigues en la primiparada");
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Pediste permiso para ir al baño en clase, sigues en la primiparada");
                                break;
                            case 3:
                                player1.enCarcel = false;
                                player1.turnosEnCarcel = 0;
                                JOptionPane.showMessageDialog(null, "Cumplió su condena de primiparada, puede seguir");
                                break;
                        }
                    }
                }
            }

        }
        if (Aux == 2 || (Aux == 0 & players == 2)) {
            if (player2 != null) {
                if (!player2.enCarcel) {
                    for (int j = 0; j < dado.result; j++) {
                        player2.pos = player2.pos.next;
                        if (player2.pos == GoSquare) {
                            player2.dinero += 200;
                            JOptionPane.showMessageDialog(null, "Recibe $200 por pasar por la salida", "Jugador: " + player2.nombre, JOptionPane.DEFAULT_OPTION);
                        }
                    }
                    Ficha2.setLocation(player2.pos.x, player2.pos.y);
                    player2.Accion();

                    if (player2.pos.type == 8) {
                        if (player2.property.owner.equals("Bancario")) {
                            PriceLabel.setText(String.valueOf(player2.property.price));
                            ImagenPropiedad(player2);
                            CompraPropiedades.setTitle("Jugador: " + player2.nombre);
                            CompraPropiedades.setVisible(true);
                        }
                        if (player2.property.owned) {
                            if (player1 != null) {
                                if (player2.property.owner.equals(player1.nombre)) {
                                    player2.dinero -= player2.property.rent;
                                    player1.dinero += player2.property.rent;
                                    JOptionPane.showMessageDialog(null, player2.nombre + " le paga " + player2.property.rent + " a " + player1.nombre);
                                }
                            }
                            if (player3 != null) {
                                if (player2.property.owner.equals(player3.nombre)) {
                                    player2.dinero -= player2.property.rent;
                                    player3.dinero += player2.property.rent;
                                    JOptionPane.showMessageDialog(null, player2.nombre + " le paga " + player2.property.rent + " a " + player3.nombre);
                                }
                            }
                            if (player4 != null) {
                                if (player2.property.owner.equals(player4.nombre)) {
                                    player2.dinero -= player2.property.rent;
                                    player4.dinero += player2.property.rent;
                                    JOptionPane.showMessageDialog(null, player2.nombre + " le paga " + player2.property.rent + " a " + player4.nombre);
                                }
                            }
                            player2.property = null;
                        }
                    }
                    if (player2.pos.type == 5) {
                        if (player2.carta.numero == 6) {
                            if (!(player1.TarjetaCarcel || player2.TarjetaCarcel || player3.TarjetaCarcel || player4.TarjetaCarcel)) {
                                player2.TarjetaCarcel = true;
                            } else {
                                while (player2.carta.numero == 6) {
                                    player2.Accion();
                                }
                                player2.TarjetaCarcel = false;
                            }
                        }
                    }
                    if (player2.pos.type == 5) {
                        ImageIcon icon = new ImageIcon();
                        switch (player2.carta.numero) {
                            case 1:
                                icon = new ImageIcon("src/Images/Bono dunord 1.png");
                                break;
                            case 2:
                                icon = new ImageIcon("src/Images/Bono dunord 2.png");
                                break;
                            case 3:
                                icon = new ImageIcon("src/Images/Bono dunord 3.png");
                                break;
                            case 4:
                                icon = new ImageIcon("src/Images/Bono dunord 4.png");
                                break;
                            case 5:
                                icon = new ImageIcon("src/Images/Bono dunord 5.png");
                                break;
                            case 6:
                                icon = new ImageIcon("src/Images/Bono dunord 6.png");
                                break;
                            case 7:
                                icon = new ImageIcon("src/Images/Bono dunord 7.png");
                                break;
                            case 8:
                                icon = new ImageIcon("src/Images/Bono dunord 8.png");
                                break;

                        }
                        JOptionPane.showMessageDialog(null, "", "Bono DuNord", JOptionPane.INFORMATION_MESSAGE, icon);
                    }
                    if (player2.pos.type == 6) {
                        ImageIcon icon = new ImageIcon();
                        switch (player2.carta.numero) {
                            case 1:
                                icon = new ImageIcon("src/Images/Objetos perdidos 1.png");
                                break;
                            case 2:
                                icon = new ImageIcon("src/Images/Objetos perdidos 2.png");
                                break;
                            case 3:
                                icon = new ImageIcon("src/Images/Objetos perdidos 3.png");
                                break;
                            case 4:
                                icon = new ImageIcon("src/Images/Objetos perdidos 4.png");
                                break;
                            case 5:
                                icon = new ImageIcon("src/Images/Objetos perdidos 5.png");
                                break;
                            case 6:
                                icon = new ImageIcon("src/Images/Objetos perdidos 6.png");
                                break;
                            case 7:
                                icon = new ImageIcon("src/Images/Objetos perdidos 7.png");
                                break;
                            case 8:
                                icon = new ImageIcon("src/Images/Objetos perdidos 8.png");
                                break;

                        }
                        JOptionPane.showMessageDialog(null, "", "Bono DuNord", JOptionPane.INFORMATION_MESSAGE, icon);
                    }
                    Ficha2.setLocation(player2.pos.x, player2.pos.y);
                } else {
                    if (player2.TarjetaCarcel) {
                        JOptionPane.showMessageDialog(null, "Usaste tu tarjeta de cárcel para salir");
                        player2.enCarcel = false;
                        turno--;
                    } else if (dado.Dado1 == dado.Dado2) {
                        player2.enCarcel = false;
                        player2.turnosEnCarcel = 0;
                        turno--;
                        JOptionPane.showMessageDialog(null, "Buena suerte, tiraste los dados y saliste de la primiparada");
                    } else {
                        player2.turnosEnCarcel++;
                        switch (player2.turnosEnCarcel) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "No encontraste el salón y llegaste tarde a clase, sigues en la primiparada");
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Pediste permiso para ir al baño en clase, sigues en la primiparada");
                                break;
                            case 3:
                                player2.enCarcel = false;
                                player2.turnosEnCarcel = 0;
                                JOptionPane.showMessageDialog(null, "Cumplió su condena de primiparada, puede seguir");
                                break;
                        }
                    }
                }
            }
        }
        if (Aux == 3 || (Aux == 0 & players == 3)) {
            if (player3 != null) {
                if (!player3.enCarcel) {
                    for (int k = 0; k < dado.result; k++) {
                        player3.pos = player3.pos.next;
                        if (player3.pos == GoSquare) {
                            player3.dinero += 200;
                            JOptionPane.showMessageDialog(null, "Recibe $200 por pasar por la salida", "Jugador: " + player3.nombre, JOptionPane.DEFAULT_OPTION);
                        }
                    }
                    Ficha3.setLocation(player3.pos.x, player3.pos.y);
                    player3.Accion();

                    if (player3.pos.type == 8) {
                        if (player3.property.owner.equals("Bancario")) {
                            PriceLabel.setText(String.valueOf(player3.property.price));
                            ImagenPropiedad(player3);
                            CompraPropiedades.setTitle("Jugador: " + player3.nombre);
                            CompraPropiedades.setVisible(true);
                        }
                        if (player3.property.owned) {
                            if (player2 != null) {
                                if (player3.property.owner.equals(player2.nombre)) {
                                    player3.dinero -= player3.property.rent;
                                    player2.dinero += player3.property.rent;
                                    JOptionPane.showMessageDialog(null, player3.nombre + " le paga " + player3.property.rent + " a " + player2.nombre);
                                }
                            }
                            if (player1 != null) {
                                if (player3.property.owner.equals(player1.nombre)) {
                                    player3.dinero -= player3.property.rent;
                                    player1.dinero += player3.property.rent;
                                    JOptionPane.showMessageDialog(null, player3.nombre + " le paga " + player3.property.rent + " a " + player1.nombre);
                                }
                            }
                            if (player4 != null) {
                                if (player3.property.owner.equals(player4.nombre)) {
                                    player3.dinero -= player3.property.rent;
                                    player4.dinero += player3.property.rent;
                                    JOptionPane.showMessageDialog(null, player3.nombre + " le paga " + player3.property.rent + " a " + player4.nombre);
                                }
                            }
                            player3.property = null;
                        }
                    }
                    if (player3.pos.type == 5) {
                        if (player3.carta.numero == 6) {
                            if (!(player1.TarjetaCarcel || player2.TarjetaCarcel || player3.TarjetaCarcel || player4.TarjetaCarcel)) {
                                player3.TarjetaCarcel = true;
                            } else {
                                while (player3.carta.numero == 6) {
                                    player3.Accion();
                                }
                                player3.TarjetaCarcel = false;
                            }
                        }
                    }
                    if (player3.pos.type == 5) {
                        ImageIcon icon = new ImageIcon();
                        switch (player3.carta.numero) {
                            case 1:
                                icon = new ImageIcon("src/Images/Bono dunord 1.png");
                                break;
                            case 2:
                                icon = new ImageIcon("src/Images/Bono dunord 2.png");
                                break;
                            case 3:
                                icon = new ImageIcon("src/Images/Bono dunord 3.png");
                                break;
                            case 4:
                                icon = new ImageIcon("src/Images/Bono dunord 4.png");
                                break;
                            case 5:
                                icon = new ImageIcon("src/Images/Bono dunord 5.png");
                                break;
                            case 6:
                                icon = new ImageIcon("src/Images/Bono dunord 6.png");
                                break;
                            case 7:
                                icon = new ImageIcon("src/Images/Bono dunord 7.png");
                                break;
                            case 8:
                                icon = new ImageIcon("src/Images/Bono dunord 8.png");
                                break;

                        }
                        JOptionPane.showMessageDialog(null, "", "Bono DuNord", JOptionPane.INFORMATION_MESSAGE, icon);
                    }
                    if (player3.pos.type == 6) {
                        ImageIcon icon = new ImageIcon();
                        switch (player3.carta.numero) {
                            case 1:
                                icon = new ImageIcon("src/Images/Objetos perdidos 1.png");
                                break;
                            case 2:
                                icon = new ImageIcon("src/Images/Objetos perdidos 2.png");
                                break;
                            case 3:
                                icon = new ImageIcon("src/Images/Objetos perdidos 3.png");
                                break;
                            case 4:
                                icon = new ImageIcon("src/Images/Objetos perdidos 4.png");
                                break;
                            case 5:
                                icon = new ImageIcon("src/Images/Objetos perdidos 5.png");
                                break;
                            case 6:
                                icon = new ImageIcon("src/Images/Objetos perdidos 6.png");
                                break;
                            case 7:
                                icon = new ImageIcon("src/Images/Objetos perdidos 7.png");
                                break;
                            case 8:
                                icon = new ImageIcon("src/Images/Objetos perdidos 8.png");
                                break;

                        }
                        JOptionPane.showMessageDialog(null, "", "Bono DuNord", JOptionPane.INFORMATION_MESSAGE, icon);
                    }
                    Ficha3.setLocation(player3.pos.x, player3.pos.y);
                } else {
                    if (player3.TarjetaCarcel) {
                        JOptionPane.showMessageDialog(null, "Usaste tu tarjeta de cárcel para salir");
                        player3.enCarcel = false;
                    } else if (dado.Dado1 == dado.Dado2) {
                        player3.enCarcel = false;
                        player3.turnosEnCarcel = 0;
                        turno--;
                        JOptionPane.showMessageDialog(null, "Buena suerte, tiraste los dados y saliste de la primiparada");
                    } else {
                        player3.turnosEnCarcel++;
                        switch (player3.turnosEnCarcel) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "No encontraste el salón y llegaste tarde a clase, sigues en la primiparada");
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Pediste permiso para ir al baño en clase, sigues en la primiparada");
                                break;
                            case 3:
                                player3.enCarcel = false;
                                player3.turnosEnCarcel = 0;
                                JOptionPane.showMessageDialog(null, "Cumplió su condena de primiparada, puede seguir");
                                break;
                        }
                    }
                }
            }
        }
        if (Aux == 0 & players == 4) {
            if (player4 != null) {
                if (!player4.enCarcel) {
                    for (int l = 0; l < dado.result; l++) {
                        player4.pos = player4.pos.next;
                        if (player4.pos == GoSquare) {
                            player4.dinero += 200;
                            JOptionPane.showMessageDialog(null, "Recibe $200 por pasar por la salida", "Jugador: " + player4.nombre, JOptionPane.DEFAULT_OPTION);
                        }
                    }
                    Ficha4.setLocation(player4.pos.x, player4.pos.y);
                    player4.Accion();

                    if (player4.pos.type == 8) {
                        if (player4.property.owner.equals("Bancario")) {
                            PriceLabel.setText(String.valueOf(player4.property.price));
                            ImagenPropiedad(player4);
                            CompraPropiedades.setTitle("Jugador: " + player4.nombre);
                            CompraPropiedades.setVisible(true);
                        }
                        if (player4.property.owned) {
                            if (player2 != null) {
                                if (player4.property.owner.equals(player2.nombre)) {
                                    player4.dinero -= player4.property.rent;
                                    player2.dinero += player4.property.rent;
                                    JOptionPane.showMessageDialog(null, player4.nombre + " le paga " + player4.property.rent + " a " + player2.nombre);
                                }
                            }
                            if (player3 != null) {
                                if (player4.property.owner.equals(player3.nombre)) {
                                    player4.dinero -= player4.property.rent;
                                    player3.dinero += player4.property.rent;
                                    JOptionPane.showMessageDialog(null, player4.nombre + " le paga " + player4.property.rent + " a " + player3.nombre);
                                }
                            }
                            if (player1 != null) {
                                if (player4.property.owner.equals(player1.nombre)) {
                                    player4.dinero -= player4.property.rent;
                                    player1.dinero += player4.property.rent;
                                    JOptionPane.showMessageDialog(null, player4.nombre + " le paga " + player4.property.rent + " a " + player1.nombre);
                                }
                            }
                            player4.property = null;
                        }
                    }
                    if (player4.pos.type == 5) {
                        if (player4.carta.numero == 6) {
                            if (!(player1.TarjetaCarcel || player2.TarjetaCarcel || player3.TarjetaCarcel || player4.TarjetaCarcel)) {
                                player4.TarjetaCarcel = true;
                            } else {
                                while (player4.carta.numero == 6) {
                                    player4.Accion();
                                }
                                player4.TarjetaCarcel = false;
                            }
                        }
                    }
                    if (player4.pos.type == 5) {
                        ImageIcon icon = new ImageIcon();
                        switch (player4.carta.numero) {
                            case 1:
                                icon = new ImageIcon("src/Images/Bono dunord 1.png");
                                break;
                            case 2:
                                icon = new ImageIcon("src/Images/Bono dunord 2.png");
                                break;
                            case 3:
                                icon = new ImageIcon("src/Images/Bono dunord 3.png");
                                break;
                            case 4:
                                icon = new ImageIcon("src/Images/Bono dunord 4.png");
                                break;
                            case 5:
                                icon = new ImageIcon("src/Images/Bono dunord 5.png");
                                break;
                            case 6:
                                icon = new ImageIcon("src/Images/Bono dunord 6.png");
                                break;
                            case 7:
                                icon = new ImageIcon("src/Images/Bono dunord 7.png");
                                break;
                            case 8:
                                icon = new ImageIcon("src/Images/Bono dunord 8.png");
                                break;

                        }
                        JOptionPane.showMessageDialog(null, "", "Bono DuNord", JOptionPane.INFORMATION_MESSAGE, icon);
                    }
                    if (player4.pos.type == 6) {
                        ImageIcon icon = new ImageIcon();
                        switch (player4.carta.numero) {
                            case 1:
                                icon = new ImageIcon("src/Images/Objetos perdidos 1.png");
                                break;
                            case 2:
                                icon = new ImageIcon("src/Images/Objetos perdidos 2.png");
                                break;
                            case 3:
                                icon = new ImageIcon("src/Images/Objetos perdidos 3.png");
                                break;
                            case 4:
                                icon = new ImageIcon("src/Images/Objetos perdidos 4.png");
                                break;
                            case 5:
                                icon = new ImageIcon("src/Images/Objetos perdidos 5.png");
                                break;
                            case 6:
                                icon = new ImageIcon("src/Images/Objetos perdidos 6.png");
                                break;
                            case 7:
                                icon = new ImageIcon("src/Images/Objetos perdidos 7.png");
                                break;
                            case 8:
                                icon = new ImageIcon("src/Images/Objetos perdidos 8.png");
                                break;

                        }
                        JOptionPane.showMessageDialog(null, "", "Bono DuNord", JOptionPane.INFORMATION_MESSAGE, icon);
                    }
                    Ficha4.setLocation(player4.pos.x, player4.pos.y);
                    Ficha4.setLocation(player4.pos.x, player4.pos.y);
                } else {
                    if (player4.TarjetaCarcel) {
                        JOptionPane.showMessageDialog(null, "Usaste tu tarjeta de cárcel para salir");
                        player4.enCarcel = false;
                    } else if (dado.Dado1 == dado.Dado2) {
                        player4.enCarcel = false;
                        player4.turnosEnCarcel = 0;
                        turno--;
                        JOptionPane.showMessageDialog(null, "Buena suerte, tiraste los dados y saliste de la primiparada");
                    } else {
                        player4.turnosEnCarcel++;
                        switch (player4.turnosEnCarcel) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "No encontraste el salón y llegaste tarde a clase, sigues en la primiparada");
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Pediste permiso para ir al baño en clase, sigues en la primiparada");
                                break;
                            case 3:
                                player4.enCarcel = false;
                                player4.turnosEnCarcel = 0;
                                JOptionPane.showMessageDialog(null, "Cumplió su condena de primiparada, puede seguir");
                                break;
                        }
                    }
                }
            }
        }
        setTexts();
        Mover.setEnabled(false);
        if (!CompraPropiedades.isVisible()) {
            CambiarTurno.setEnabled(true);
        }
    }//GEN-LAST:event_MoverActionPerformed

    private void setTexts() {
        if (player1 != null) {
            LabelDineroP1.setText("$" + player1.dinero);
        }
        if (player2 != null) {
            LabelDineroP2.setText("$" + player2.dinero);
        }
        if (player3 != null) {
            LabelDineroP3.setText("$" + player3.dinero);
        }
        if (player4 != null) {
            LabelDineroP4.setText("$" + player4.dinero);
        }
    }

    private void setTurno() {
        int Aux = turno % players;
        if (Aux == 1 & player2 != null) {
            TurnoActual.setText(player2.nombre);
        } else if (Aux == 1) {
            if (player3 != null) {
                TurnoActual.setText(player3.nombre);
                turno++;
            } else {
                TurnoActual.setText(player4.nombre);
                turno += 2;
            }
        }
        if (Aux == 2 || (Aux == 0 & players == 2)) {
            if (players == 2) {
                TurnoActual.setText(player1.nombre);
            } else if (player3 != null) {
                TurnoActual.setText(player3.nombre);
            } else if (player4 != null) {
                TurnoActual.setText(player4.nombre);
                turno++;
            } else {
                TurnoActual.setText(player1.nombre);
                turno += 2;
            }
        }
        if (Aux == 3 || (Aux == 0 & players == 3)) {
            if (players == 3 & player1 != null) {
                TurnoActual.setText(player1.nombre);
            } else if (players == 4 & player4 != null) {
                TurnoActual.setText(player4.nombre);
            } else if (player1 != null) {
                TurnoActual.setText(player1.nombre);
                turno++;
            } else {
                TurnoActual.setText(player2.nombre);
                turno += 2;
            }
        }
        if (Aux == 0 & players == 4) {
            if (player1 != null) {
                TurnoActual.setText(player1.nombre);
            } else if (player2 != null) {
                TurnoActual.setText(player2.nombre);
                turno++;
            } else if (player3 != null) {
                TurnoActual.setText(player3.nombre);
                turno += 2;
            }
        }
    }

    private void BotonDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDadosActionPerformed
        dado.tirarDados();
        Mover.setEnabled(true);
        BotonDados.setEnabled(false);
        OcultarDados();
        switch (dado.Dado1) {
            case 1:
                Cara1Dado1.setLocation(880, 270);
                break;
            case 2:
                Cara2Dado1.setLocation(880, 270);
                break;
            case 3:
                Cara3Dado1.setLocation(880, 270);
                break;
            case 4:
                Cara4Dado1.setLocation(880, 270);
                break;
            case 5:
                Cara5Dado1.setLocation(880, 270);
                break;
            case 6:
                Cara6Dado1.setLocation(880, 270);
                break;
        }
        switch (dado.Dado2) {
            case 1:
                Cara1Dado2.setLocation(980, 270);
                break;
            case 2:
                Cara2Dado2.setLocation(980, 270);
                break;
            case 3:
                Cara3Dado2.setLocation(980, 270);
                break;
            case 4:
                Cara4Dado2.setLocation(980, 270);
                break;
            case 5:
                Cara5Dado2.setLocation(980, 270);
                break;
            case 6:
                Cara6Dado2.setLocation(980, 270);
                break;
        }


    }//GEN-LAST:event_BotonDadosActionPerformed

    private void BotonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonComprarActionPerformed
        if (player1 != null) {
            if (player1.property != null) {
                if (player1.dinero >= player1.property.price) {
                    player1.property.owner = player1.nombre;
                    player1.dinero -= player1.property.price;
                    player1.property.owned = true;
                    CompraPropiedades.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Compra realizada exitosamente", "Jugador: " + player1.nombre, JOptionPane.DEFAULT_OPTION);
                } else {
                    CompraPropiedades.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Dinero insuficiente, compra denegada", "Jugador: " + player1.nombre, JOptionPane.ERROR_MESSAGE);
                }
            }
            player1.property = null;
        }
        if (player2 != null) {
            if (player2.property != null) {
                if (player2.dinero >= player2.property.price) {
                    player2.property.owner = player2.nombre;
                    player2.dinero -= player2.property.price;
                    player2.property.owned = true;
                    CompraPropiedades.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Compra realizada exitosamente", "Jugador: " + player2.nombre, JOptionPane.DEFAULT_OPTION);
                } else {
                    CompraPropiedades.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Dinero insuficiente, compra denegada", "Jugador: " + player2.nombre, JOptionPane.ERROR_MESSAGE);
                }
            }
            player2.property = null;
        }
        if (player3 != null) {
            if (player3.property != null) {
                if (player3.dinero >= player3.property.price) {
                    player3.property.owner = player3.nombre;
                    player3.dinero -= player3.property.price;
                    player3.property.owned = true;
                    CompraPropiedades.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Compra realizada exitosamente", "Jugador: " + player3.nombre, JOptionPane.DEFAULT_OPTION);
                } else {
                    CompraPropiedades.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Dinero insuficiente, compra denegada", "Jugador: " + player3.nombre, JOptionPane.ERROR_MESSAGE);
                }
            }
            player3.property = null;
        }
        if (player4 != null) {
            if (player4.property != null) {
                if (player4.dinero >= player4.property.price) {
                    player4.property.owner = player4.nombre;
                    player4.dinero -= player4.property.price;
                    player4.property.owned = true;
                    CompraPropiedades.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Compra realizada exitosamente", "Jugador: " + player4.nombre, JOptionPane.DEFAULT_OPTION);
                } else {
                    CompraPropiedades.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Dinero insuficiente, compra denegada", "Jugador: " + player4.nombre, JOptionPane.ERROR_MESSAGE);
                }
            }
            player4.property = null;
        }
        setTexts();
        CambiarTurno.setEnabled(true);
    }//GEN-LAST:event_BotonComprarActionPerformed

    private void BotonIgnorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIgnorarActionPerformed
        CompraPropiedades.setVisible(false);
        if (player1 != null) {
            player1.property = null;
        }
        if (player2 != null) {
            player2.property = null;
        }
        if (player3 != null) {
            player3.property = null;
        }
        if (player4 != null) {
            player4.property = null;
        }
        CambiarTurno.setEnabled(true);
    }//GEN-LAST:event_BotonIgnorarActionPerformed

    private void ImagenPropiedad(Jugador player) {
        int Aux = player.property.BoardPos;
        switch (Aux) {
            case 2:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bloque A.png")));
                break;
            case 4:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bloque B.png")));
                break;
            case 6:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sobusa.png")));
                break;
            case 7:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bloque C.png")));
                break;
            case 9:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bloque D.png")));
                break;
            case 10:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bloque E.png")));
                break;
            case 12:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bloque F.png")));
                break;
            case 13:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Air-e.png")));
                break;
            case 14:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bloque G.png")));
                break;
            case 15:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bloque I.png")));
                break;
            case 16:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/La carolina.png")));
                break;
            case 17:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bloque J.png")));
                break;
            case 19:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bloque K.png")));
                break;
            case 20:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bloque L.png")));
                break;
            case 22:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Lab 1.png")));
                break;
            case 24:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Lab 3.png")));
                break;
            case 25:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bloque Salud.png")));
                break;
            case 26:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Transmetro.png")));
                break;
            case 27:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Express.png")));
                break;
            case 28:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Plaza.png")));
                break;
            case 29:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Baños Uninorte.png")));
                break;
            case 30:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Café.png")));
                break;
            case 32:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Biblioteca.png")));
                break;
            case 33:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Coliseo.png")));
                break;
            case 35:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Casa estudio.png")));
                break;
            case 36:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Coolitoral.png")));
                break;
            case 38:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Km5.png")));
                break;
            case 40:
                LabelPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1966.png")));
                break;
        }
    }

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.setVisible(true);
        NameSelector.setVisible(false);
        Name3TextF.setEnabled(true);
        Name4TextF.setEnabled(true);
        Ficha3.setVisible(true);
        Ficha4.setVisible(true);
        MarcoP3.setVisible(true);
        MarcoP4.setVisible(true);
        LabelDineroP3.setVisible(true);
        LabelDineroP4.setVisible(true);
        LabelP3.setVisible(true);
        LabelP4.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void AceptarNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarNombresActionPerformed
        turno1.name = Name1TextF.getText();
        turno2.name = Name2TextF.getText();
        turno3.name = Name3TextF.getText();
        turno4.name = Name4TextF.getText();
        if (ValidarNombres()) {
            if (players == 2) {
                BotonPrioridadP3.setEnabled(false);
                BotonPrioridadP4.setEnabled(false);
            }
            if (players == 3) {
                BotonPrioridadP4.setEnabled(false);
            }

            NameSelector.setVisible(false);
            TurnSelector.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor no repita nombres ni deje campos vacíos");
        }
    }//GEN-LAST:event_AceptarNombresActionPerformed

    private boolean ValidarNombres() {
        if (players != 2) {
            return !(turno1.name.equals(turno2.name) || turno1.name.equals(turno3.name) || turno1.name.equals(turno4.name)
                    || turno2.name.equals(turno3.name) || turno2.name.equals(turno4.name) || turno3.name.equals(turno4.name));
        } else {
            return !(turno1.name.equals(turno2.name));
        }
    }

    private void BotonPrioridadP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPrioridadP1ActionPerformed
        dado.tirarDados();
        turno1.result = dado.result;
        OcultarDados2();
        MostrarDados();
        ResultadoLabel1.setText(String.valueOf(dado.result));
        BotonPrioridadP1.setEnabled(false);
        if (!BotonPrioridadP1.isEnabled() & !BotonPrioridadP2.isEnabled() & !BotonPrioridadP3.isEnabled() & !BotonPrioridadP4.isEnabled()) {
            AceptarTurno.setEnabled(true);
        }
    }//GEN-LAST:event_BotonPrioridadP1ActionPerformed

    private void BotonPrioridadP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPrioridadP2ActionPerformed
        dado.tirarDados();
        turno2.result = dado.result;
        OcultarDados2();
        MostrarDados();
        ResultadoLabel2.setText(String.valueOf(dado.result));
        BotonPrioridadP2.setEnabled(false);
        if (!BotonPrioridadP1.isEnabled() & !BotonPrioridadP2.isEnabled() & !BotonPrioridadP3.isEnabled() & !BotonPrioridadP4.isEnabled()) {
            AceptarTurno.setEnabled(true);
        }
    }//GEN-LAST:event_BotonPrioridadP2ActionPerformed

    private void BotonPrioridadP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPrioridadP3ActionPerformed
        dado.tirarDados();
        turno3.result = dado.result;
        OcultarDados2();
        MostrarDados();
        ResultadoLabel3.setText(String.valueOf(dado.result));
        BotonPrioridadP3.setEnabled(false);
        if (!BotonPrioridadP1.isEnabled() & !BotonPrioridadP2.isEnabled() & !BotonPrioridadP3.isEnabled() & !BotonPrioridadP4.isEnabled()) {
            AceptarTurno.setEnabled(true);
        }
    }//GEN-LAST:event_BotonPrioridadP3ActionPerformed

    private void BotonPrioridadP4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPrioridadP4ActionPerformed
        dado.tirarDados();
        turno4.result = dado.result;
        OcultarDados2();
        MostrarDados();
        ResultadoLabel4.setText(String.valueOf(dado.result));
        BotonPrioridadP4.setEnabled(false);
        if (!BotonPrioridadP1.isEnabled() & !BotonPrioridadP2.isEnabled() & !BotonPrioridadP3.isEnabled() & !BotonPrioridadP4.isEnabled()) {
            AceptarTurno.setEnabled(true);
        }
    }//GEN-LAST:event_BotonPrioridadP4ActionPerformed

    private void AceptarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarTurnoActionPerformed
        Turnos[] turnos = {turno1, turno2, turno3, turno4};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 - i; j++) {
                if (turnos[j].result < turnos[j + 1].result) {
                    Turnos temp = turnos[j];
                    turnos[j] = turnos[j + 1];
                    turnos[j + 1] = temp;
                }
            }
        }
        if (turnos[0].name.equals("")) {
            player1.nombre = "Jugador 1";
        } else {
            player1.nombre = turnos[0].name;
        }
        if (turnos[1].name.equals("")) {
            player2.nombre = "Jugador 2";
        } else {
            player2.nombre = turnos[1].name;
        }
        if (turnos[2].name.equals("")) {
            player3.nombre = "Jugador 3";
        } else {
            player3.nombre = turnos[2].name;
        }
        if (turnos[3].name.equals("")) {
            player4.nombre = "Jugador 4";
        } else {
            player4.nombre = turnos[3].name;
        }
        LabelP1.setText(player1.nombre);
        LabelP2.setText(player2.nombre);
        LabelP3.setText(player3.nombre);
        LabelP4.setText(player4.nombre);
        mostrarTablero();
    }//GEN-LAST:event_AceptarTurnoActionPerformed

    private void FinJuego() {
        int c = 0;
        if (player1 == null) {
            c++;
        }
        if (player2 == null) {
            c++;
        }
        if (player3 == null) {
            c++;
        }
        if (player4 == null) {
            c++;
        }
        if (c == 3) {
            BoardFrame.setVisible(false);
            MenuFinal.setVisible(true);
        }
    }

    private void CambiarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarTurnoActionPerformed
        setTurno();
        turno++;
        BotonDados.setEnabled(true);
        CambiarTurno.setEnabled(false);
        if (player1 != null) {
            if (player1.dinero <= 0) {
                JOptionPane.showMessageDialog(null, player1.nombre + " ha perdido", "", JOptionPane.ERROR_MESSAGE);
                ReiniciarPropiedades(player1);
                player1 = null;
                LabelDineroP1.setVisible(false);
                MarcoP1.setLocation(10000, 10000);
                LabelP1.setLocation(10000, 10000);
                Ficha1.setLocation(10000, 10000);
            }
        }
        if (player2 != null) {
            if (player2.dinero <= 0) {
                JOptionPane.showMessageDialog(null, player2.nombre + " ha perdido", "", JOptionPane.ERROR_MESSAGE);
                ReiniciarPropiedades(player2);
                player2 = null;
                LabelDineroP2.setVisible(false);
                MarcoP2.setLocation(10000, 10000);
                LabelP2.setLocation(10000, 10000);
                Ficha2.setLocation(10000, 10000);
            }
        }
        if (player3 != null) {
            if (player3.dinero <= 0) {
                JOptionPane.showMessageDialog(null, player3.nombre + " ha perdido", "", JOptionPane.ERROR_MESSAGE);
                ReiniciarPropiedades(player3);
                player3 = null;
                LabelDineroP3.setVisible(false);
                MarcoP3.setLocation(10000, 10000);
                LabelP3.setLocation(10000, 10000);
                Ficha3.setLocation(10000, 10000);
            }
        }
        if (player4 != null) {
            if (player4.dinero <= 0) {
                JOptionPane.showMessageDialog(null, player4.nombre + " ha perdido", "", JOptionPane.ERROR_MESSAGE);
                ReiniciarPropiedades(player4);
                player4 = null;
                LabelDineroP4.setVisible(false);
                MarcoP4.setLocation(10000, 10000);
                LabelP4.setLocation(10000, 10000);
                Ficha4.setLocation(10000, 10000);
            }
        }
        FinJuego();
    }//GEN-LAST:event_CambiarTurnoActionPerformed

    private void BotonPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPropiedadesActionPerformed
        setDueños();
        VerPropiedades.setVisible(true);
    }//GEN-LAST:event_BotonPropiedadesActionPerformed
    private void setDueños() {
        DueñoBloqueA.setText(Tablero.propiedades[0].owner);
        DueñoBloqueB.setText(Tablero.propiedades[1].owner);
        DueñoSobusa.setText(Tablero.propiedades[2].owner);
        DueñoBloqueC.setText(Tablero.propiedades[3].owner);
        DueñoBloqueD.setText(Tablero.propiedades[4].owner);
        DueñoBloqueE.setText(Tablero.propiedades[5].owner);
        DueñoBloqueF.setText(Tablero.propiedades[6].owner);
        DueñoAire.setText(Tablero.propiedades[7].owner);
        DueñoBloqueG.setText(Tablero.propiedades[8].owner);
        DueñoBloqueI.setText(Tablero.propiedades[9].owner);
        DueñoCarolina.setText(Tablero.propiedades[10].owner);
        DueñoBloqueJ.setText(Tablero.propiedades[11].owner);
        DueñoBloqueK.setText(Tablero.propiedades[12].owner);
        DueñoBloqueL.setText(Tablero.propiedades[13].owner);
        DueñoEnergias.setText(Tablero.propiedades[14].owner);
        DueñoArquitectura.setText(Tablero.propiedades[15].owner);
        DueñoSalud.setText(Tablero.propiedades[16].owner);
        DueñoTransmetro.setText(Tablero.propiedades[17].owner);
        DueñoExpress.setText(Tablero.propiedades[18].owner);
        DueñoPlaza.setText(Tablero.propiedades[19].owner);
        DueñoBaños.setText(Tablero.propiedades[20].owner);
        DueñoCafe.setText(Tablero.propiedades[21].owner);
        DueñoKcp.setText(Tablero.propiedades[22].owner);
        DueñoColiseo.setText(Tablero.propiedades[23].owner);
        DueñoCasaEstudio.setText(Tablero.propiedades[24].owner);
        DueñoCoolitoral.setText(Tablero.propiedades[25].owner);
        DueñoKm5.setText(Tablero.propiedades[26].owner);
        Dueño1966.setText(Tablero.propiedades[27].owner);
    }
    
    void MostrarDados() {
        switch (dado.Dado1) {
            case 1:
                PCara1Dado1.setVisible(true);
                break;
            case 2:
                PCara1Dado2.setVisible(true);
                break;
            case 3:
                PCara1Dado3.setVisible(true);
                break;
            case 4:
                PCara1Dado4.setVisible(true);
                break;
            case 5:
                PCara1Dado5.setVisible(true);
                break;
            case 6:
                PCara1Dado6.setVisible(true);
                break;
        }
        switch (dado.Dado2) {
            case 1:
                PCara2Dado1.setVisible(true);
                break;
            case 2:
                PCara2Dado2.setVisible(true);
                break;
            case 3:
                PCara2Dado3.setVisible(true);
                break;
            case 4:
                PCara2Dado4.setVisible(true);
                break;
            case 5:
                PCara2Dado5.setVisible(true);
                break;
            case 6:
                PCara2Dado6.setVisible(true);
                break;
        }
    }

    void mostrarTablero() {
        TurnSelector.setVisible(false);
        BoardFrame.setVisible(true);
        if (players == 2) {
            player3 = null;
            player4 = null;
        }
        if (players == 3) {
            player4 = null;
        }
        Mover.setEnabled(false);
        CambiarTurno.setEnabled(false);
        OcultarDados();
        Cara1Dado1.setLocation(1010, 110);
        Cara1Dado2.setLocation(1080, 110);
        LabelDineroP1.setText("$" + player1.dinero);
        TurnoActual.setText(player1.nombre);
    }

    void OcultarDados() {
        Cara1Dado1.setLocation(10000, 10000);
        Cara1Dado2.setLocation(10000, 10000);
        Cara2Dado1.setLocation(10000, 10000);
        Cara2Dado2.setLocation(10000, 10000);
        Cara3Dado1.setLocation(10000, 10000);
        Cara3Dado2.setLocation(10000, 10000);
        Cara4Dado1.setLocation(10000, 10000);
        Cara4Dado2.setLocation(10000, 10000);
        Cara5Dado1.setLocation(10000, 10000);
        Cara5Dado2.setLocation(10000, 10000);
        Cara6Dado1.setLocation(10000, 10000);
        Cara6Dado2.setLocation(10000, 10000);
    }

    void OcultarDados2() {
        PCara1Dado1.setVisible(false);
        PCara1Dado2.setVisible(false);
        PCara1Dado3.setVisible(false);
        PCara1Dado4.setVisible(false);
        PCara1Dado5.setVisible(false);
        PCara1Dado6.setVisible(false);
        PCara2Dado1.setVisible(false);
        PCara2Dado2.setVisible(false);
        PCara2Dado3.setVisible(false);
        PCara2Dado4.setVisible(false);
        PCara2Dado5.setVisible(false);
        PCara2Dado6.setVisible(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarNombres;
    private javax.swing.JButton AceptarTurno;
    private javax.swing.JButton BackButton;
    private javax.swing.JFrame BoardFrame;
    private javax.swing.JButton BotonComprar;
    private javax.swing.JButton BotonDados;
    private javax.swing.JButton BotonIgnorar;
    private javax.swing.JButton BotonPrioridadP1;
    private javax.swing.JButton BotonPrioridadP2;
    private javax.swing.JButton BotonPrioridadP3;
    private javax.swing.JButton BotonPrioridadP4;
    private javax.swing.JButton BotonPropiedades;
    private javax.swing.JButton CambiarTurno;
    private javax.swing.JLabel Cara1Dado1;
    private javax.swing.JLabel Cara1Dado2;
    private javax.swing.JLabel Cara2Dado1;
    private javax.swing.JLabel Cara2Dado2;
    private javax.swing.JLabel Cara3Dado1;
    private javax.swing.JLabel Cara3Dado2;
    private javax.swing.JLabel Cara4Dado1;
    private javax.swing.JLabel Cara4Dado2;
    private javax.swing.JLabel Cara5Dado1;
    private javax.swing.JLabel Cara5Dado2;
    private javax.swing.JLabel Cara6Dado1;
    private javax.swing.JLabel Cara6Dado2;
    private javax.swing.JFrame CompraPropiedades;
    private javax.swing.JLabel Dueño1966;
    private javax.swing.JLabel DueñoAire;
    private javax.swing.JLabel DueñoArquitectura;
    private javax.swing.JLabel DueñoBaños;
    private javax.swing.JLabel DueñoBloqueA;
    private javax.swing.JLabel DueñoBloqueB;
    private javax.swing.JLabel DueñoBloqueC;
    private javax.swing.JLabel DueñoBloqueD;
    private javax.swing.JLabel DueñoBloqueE;
    private javax.swing.JLabel DueñoBloqueF;
    private javax.swing.JLabel DueñoBloqueG;
    private javax.swing.JLabel DueñoBloqueI;
    private javax.swing.JLabel DueñoBloqueJ;
    private javax.swing.JLabel DueñoBloqueK;
    private javax.swing.JLabel DueñoBloqueL;
    private javax.swing.JLabel DueñoCafe;
    private javax.swing.JLabel DueñoCarolina;
    private javax.swing.JLabel DueñoCasaEstudio;
    private javax.swing.JLabel DueñoColiseo;
    private javax.swing.JLabel DueñoCoolitoral;
    private javax.swing.JLabel DueñoEnergias;
    private javax.swing.JLabel DueñoExpress;
    private javax.swing.JLabel DueñoKcp;
    private javax.swing.JLabel DueñoKm5;
    private javax.swing.JLabel DueñoPlaza;
    private javax.swing.JLabel DueñoSalud;
    private javax.swing.JLabel DueñoSobusa;
    private javax.swing.JLabel DueñoTransmetro;
    private javax.swing.JLabel Ficha1;
    private javax.swing.JLabel Ficha2;
    private javax.swing.JLabel Ficha3;
    private javax.swing.JLabel Ficha4;
    private javax.swing.JLabel Fondo;
    private java.awt.Label LabelDineroP1;
    private java.awt.Label LabelDineroP2;
    private java.awt.Label LabelDineroP3;
    private java.awt.Label LabelDineroP4;
    private javax.swing.JLabel LabelP1;
    private javax.swing.JLabel LabelP2;
    private javax.swing.JLabel LabelP3;
    private javax.swing.JLabel LabelP4;
    private javax.swing.JLabel LabelPropiedad;
    private javax.swing.JLabel MarcoP1;
    private javax.swing.JLabel MarcoP2;
    private javax.swing.JLabel MarcoP3;
    private javax.swing.JLabel MarcoP4;
    private javax.swing.JFrame MenuFinal;
    private javax.swing.JButton Mover;
    private javax.swing.JLabel Name1Label;
    private javax.swing.JTextField Name1TextF;
    private javax.swing.JLabel Name2Label;
    private javax.swing.JTextField Name2TextF;
    private javax.swing.JLabel Name3Label;
    private javax.swing.JTextField Name3TextF;
    private javax.swing.JLabel Name4Label;
    private javax.swing.JTextField Name4TextF;
    private javax.swing.JFrame NameSelector;
    private javax.swing.JLabel NameTitle;
    private javax.swing.JLabel PCara1Dado1;
    private javax.swing.JLabel PCara1Dado2;
    private javax.swing.JLabel PCara1Dado3;
    private javax.swing.JLabel PCara1Dado4;
    private javax.swing.JLabel PCara1Dado5;
    private javax.swing.JLabel PCara1Dado6;
    private javax.swing.JLabel PCara2Dado1;
    private javax.swing.JLabel PCara2Dado2;
    private javax.swing.JLabel PCara2Dado3;
    private javax.swing.JLabel PCara2Dado4;
    private javax.swing.JLabel PCara2Dado5;
    private javax.swing.JLabel PCara2Dado6;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JLabel ResultadoLabel1;
    private javax.swing.JLabel ResultadoLabel2;
    private javax.swing.JLabel ResultadoLabel3;
    private javax.swing.JLabel ResultadoLabel4;
    private javax.swing.JFrame TurnSelector;
    private java.awt.Label TurnoActual;
    private javax.swing.JFrame VerPropiedades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton start2p;
    private javax.swing.JButton start3p;
    private javax.swing.JButton start4p;
    // End of variables declaration//GEN-END:variables
}
