/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tiket_bioskop;
    import javax.swing.JOptionPane;
/**
 *
 * @author Administrator
 */
public class FPenjualan extends javax.swing.JFrame {
    Hasilnya hasil = new Hasilnya();
    String Film;
       /**
     * Creates new form FPenjualan
     */
    public FPenjualan() {
        initComponents();
    }
    
    public void cancel(){
        Nama.setText("");
        NKursi.setText("");
        JBeli.setText("");
        HSatuan.setText("");
        JTiketG.clearSelection();
        FButton.clearSelection();
        Jam.setSelectedItem("-PILIH-");
        Harga.setText("");
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTiketG = new javax.swing.ButtonGroup();
        FButton = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NKursi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Reguler = new javax.swing.JRadioButton();
        XdUltra = new javax.swing.JRadioButton();
        Ultra = new javax.swing.JRadioButton();
        Gold = new javax.swing.JRadioButton();
        Nama = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Jam = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        HSatuan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Cancel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Cetak = new javax.swing.JButton();
        Harga = new javax.swing.JTextField();
        JBeli = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Marvel = new javax.swing.JRadioButton();
        Hunger = new javax.swing.JRadioButton();
        Wonka = new javax.swing.JRadioButton();
        Wish = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Poppins Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 102));
        jLabel1.setText("TIX ID.");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pembelian", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Medium", 0, 12), new java.awt.Color(225, 204, 102))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nama :");

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("No. Kursi :");

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jenis Tiket :");

        JTiketG.add(Reguler);
        Reguler.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        Reguler.setForeground(new java.awt.Color(255, 255, 255));
        Reguler.setText("Reguler");
        Reguler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegulerActionPerformed(evt);
            }
        });

        JTiketG.add(XdUltra);
        XdUltra.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        XdUltra.setForeground(new java.awt.Color(255, 255, 255));
        XdUltra.setText("XD Ultra");
        XdUltra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XdUltraActionPerformed(evt);
            }
        });

        JTiketG.add(Ultra);
        Ultra.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        Ultra.setForeground(new java.awt.Color(255, 255, 255));
        Ultra.setText("Ultra");
        Ultra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UltraActionPerformed(evt);
            }
        });

        JTiketG.add(Gold);
        Gold.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        Gold.setForeground(new java.awt.Color(255, 255, 255));
        Gold.setText("Gold");
        Gold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoldActionPerformed(evt);
            }
        });

        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Jam :");

        Jam.setBackground(new java.awt.Color(0, 51, 102));
        Jam.setForeground(new java.awt.Color(255, 255, 255));
        Jam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-PILIH-", "11:00", "13:00", "15:00", "17:00", "19:00", "21:00" }));
        Jam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel13)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(XdUltra)
                        .addGap(18, 18, 18)
                        .addComponent(Gold))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Reguler)
                        .addGap(18, 18, 18)
                        .addComponent(Ultra))
                    .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jam, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NKursi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NKursi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reguler)
                    .addComponent(Ultra)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(XdUltra)
                    .addComponent(Gold))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Harga", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Medium", 0, 12), new java.awt.Color(225, 204, 102))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N

        HSatuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HSatuanActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Harga Satuan :");

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Jumlah Beli :");

        Cancel.setBackground(new java.awt.Color(0, 51, 102));
        Cancel.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        Cancel.setForeground(new java.awt.Color(255, 204, 102));
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Harga :");

        Cetak.setBackground(new java.awt.Color(0, 51, 102));
        Cetak.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        Cetak.setForeground(new java.awt.Color(255, 204, 102));
        Cetak.setText("Cetak");
        Cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CetakActionPerformed(evt);
            }
        });

        JBeli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JBeliKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HSatuan)
                            .addComponent(Harga)
                            .addComponent(JBeli)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(Cetak)
                        .addGap(18, 18, 18)
                        .addComponent(Cancel)
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JBeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cetak)
                    .addComponent(Cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Film", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Medium", 0, 12), new java.awt.Color(0, 51, 102))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiket_bioskop/marpel.png"))); // NOI18N
        jLabel11.setText("jLabel9");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiket_bioskop/hunger.png"))); // NOI18N
        jLabel9.setText("jLabel9");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiket_bioskop/wonka.png"))); // NOI18N
        jLabel12.setText("jLabel9");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiket_bioskop/wish.png"))); // NOI18N
        jLabel10.setText("jLabel9");

        FButton.add(Marvel);
        Marvel.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        Marvel.setText("The Marvels");
        Marvel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarvelActionPerformed(evt);
            }
        });

        FButton.add(Hunger);
        Hunger.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        Hunger.setText("The Hunger Games");
        Hunger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HungerActionPerformed(evt);
            }
        });

        FButton.add(Wonka);
        Wonka.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        Wonka.setText("Wonka");
        Wonka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WonkaActionPerformed(evt);
            }
        });

        FButton.add(Wish);
        Wish.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        Wish.setText("Wish");
        Wish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WishActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Marvel)
                        .addGap(26, 26, 26)
                        .addComponent(Hunger)
                        .addGap(46, 46, 46)
                        .addComponent(Wonka)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(Wish)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Marvel)
                    .addComponent(Hunger)
                    .addComponent(Wonka)
                    .addComponent(Wish))
                .addGap(18, 18, 18))
        );

        jLabel7.setFont(new java.awt.Font("Poppins Black", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 102));
        jLabel7.setText("TIX ID.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegulerActionPerformed
        // TODO add your handling code here:
        hasil.setJenisTiket(Reguler.getText());
        hasil.setSeleksiJenisTiket();
        HSatuan.setText(Double.toString(hasil.getBiaya()));
    }//GEN-LAST:event_RegulerActionPerformed

    private void UltraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UltraActionPerformed
        // TODO add your handling code here:
        hasil.setJenisTiket(Ultra.getText());
        hasil.setSeleksiJenisTiket();
        HSatuan.setText(Double.toString(hasil.getBiaya()));
    }//GEN-LAST:event_UltraActionPerformed

    private void XdUltraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XdUltraActionPerformed
        // TODO add your handling code here:
        hasil.setJenisTiket(XdUltra.getText());
        hasil.setSeleksiJenisTiket();
        HSatuan.setText(Double.toString(hasil.getBiaya()));
    }//GEN-LAST:event_XdUltraActionPerformed

    private void GoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoldActionPerformed
        // TODO add your handling code here:
        hasil.setJenisTiket(Gold.getText());
        hasil.setSeleksiJenisTiket();
        HSatuan.setText(Double.toString(hasil.getBiaya()));
    }//GEN-LAST:event_GoldActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        cancel();
    }//GEN-LAST:event_CancelActionPerformed

    private void HSatuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HSatuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HSatuanActionPerformed

    private void MarvelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarvelActionPerformed
        // TODO add your handling code here:
        Film = "The Marvels";
    }//GEN-LAST:event_MarvelActionPerformed

    private void CetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CetakActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Nama : " + Nama.getText() +
                                                        "\nNo Kursi : " + NKursi.getText() +
                                                        "\nFilm : " + Film +
                                                        "\nJam : " + hasil.getJam() +
                                                        "\nJenis Tiket : " + hasil.getJenisTiket() + 
                                                        "\nJumlah Beli : " + JBeli.getText() +
                                                        "\nHarga : Rp." + Harga.getText());
    }//GEN-LAST:event_CetakActionPerformed

    private void JBeliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JBeliKeyReleased
        // TODO add your handling code here:
        if (JBeli.getText().isEmpty()) {
            Harga.setText("");
    }   else {
            hasil.setNilai1(Double.parseDouble(HSatuan.getText()));
            hasil.setNilai2(Double.parseDouble(JBeli.getText()));
            Harga.setText(Double.toString(hasil.getHasil()));
    }
    }//GEN-LAST:event_JBeliKeyReleased

    private void HungerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HungerActionPerformed
        // TODO add your handling code here:
        Film = "The Hunger Games";
    }//GEN-LAST:event_HungerActionPerformed

    private void WonkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WonkaActionPerformed
        // TODO add your handling code here:
        Film = "Willy Wonka";
    }//GEN-LAST:event_WonkaActionPerformed

    private void WishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WishActionPerformed
        // TODO add your handling code here:
        Film = "Wish";
    }//GEN-LAST:event_WishActionPerformed

    private void JamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JamActionPerformed
        // TODO add your handling code here:
        hasil.setJam(Jam.getSelectedItem().toString());
        hasil.setSeleksiJam();
    }//GEN-LAST:event_JamActionPerformed

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

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
            java.util.logging.Logger.getLogger(FPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPenjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Cetak;
    private javax.swing.ButtonGroup FButton;
    private javax.swing.JRadioButton Gold;
    private javax.swing.JTextField HSatuan;
    private javax.swing.JTextField Harga;
    private javax.swing.JRadioButton Hunger;
    private javax.swing.JTextField JBeli;
    private javax.swing.ButtonGroup JTiketG;
    private javax.swing.JComboBox<String> Jam;
    private javax.swing.JRadioButton Marvel;
    private javax.swing.JTextField NKursi;
    private javax.swing.JTextField Nama;
    private javax.swing.JRadioButton Reguler;
    private javax.swing.JRadioButton Ultra;
    private javax.swing.JRadioButton Wish;
    private javax.swing.JRadioButton Wonka;
    private javax.swing.JRadioButton XdUltra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
