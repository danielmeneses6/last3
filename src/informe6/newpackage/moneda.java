
package informe6.newpackage;


import java.awt.Image;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


public class moneda extends javax.swing.JFrame implements Runnable{

    Thread columna1;
    Thread columna2;
    Thread columna3;
    Thread alternador;
    Thread alternador2;
    int numeroAleatorio=0,numeroAleatorio2=0,numeroAleatorio3=0,con=0,con1=0,con2=0,con3=0;
    int wa1=0,wa2=0,wa3=0,ha1=0,ha2=0,ha3=0,wb1=0,wb2=0,wb3=0,hb1=0,hb2=0,hb3=0,wc1=0,wc2=0,wc3=0,hc1=0,hc2=0,hc3=0;
    boolean banedera1=false,bandera2=false,bandera3=false;
    public void run()
    {
          Thread actual = Thread.currentThread();
     
    while ( con<31&&actual == columna1) {
        mc1();
    }
       
    while ( con<31&&actual == columna2) {
        mc2();
        
    }
       while (con<31&&actual == columna3) {
        mc3();
    }
       while (con<31&&actual == alternador) {
        m4();
    }
        while (con<31&&actual == alternador2) {
        m5();
    }
    }
    
    public moneda() {
        initComponents();
    }

    public void mc1()
    {
        con1++;
         Random rand = new Random();
       
     
     numeroAleatorio = rand.nextInt(6) + 1;
     String imagen1 = "";
     switch(numeroAleatorio)
     {
         case 1:
             imagen1 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/diamante.png";
             break;
         case 2:
             imagen1 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/limon.png";
             break;
         case 3:
             imagen1 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/sandia.png";
             break;
              case 4:
             imagen1 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/corazon.png";
             break;
         case 5:
             imagen1 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/siete.png";
             break;
         case 6:
             imagen1 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/campana.png";
             break;
              case 7:
             imagen1 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/herradura.png";
             break;
         case 8:
             imagen1 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/frambuesa.png";
             break;
         case 9:
             imagen1 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/bar.png";
             break;
     }
     ImageIcon micono1 = new ImageIcon(imagen1);
        try {
               Thread.sleep(100);
           } catch (InterruptedException ex) {
               Logger.getLogger(moneda.class.getName()).log(Level.SEVERE, null, ex);
           }
        wa1 = a1.getWidth();
    ha1 = a1.getHeight();
   
        Image image1 = micono1.getImage().getScaledInstance(wa1, wa1,0);
        ImageIcon newmicono1 = new ImageIcon(image1);
        a1.setIcon(newmicono1);
        
    }
    public void mc2()
    {
        con2++;
         Random rand = new Random();
       
     
     numeroAleatorio2 = rand.nextInt(6) + 1;
     String imagen2=" ";
     switch(numeroAleatorio2)
     {
         case 1:
             imagen2 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/diamante.png";
             break;
         case 2:
             imagen2 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/limon.png";
             break;
         case 3:
             imagen2 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/sandia.png";
             break;
              case 4:
             imagen2 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/corazon.png";
             break;
         case 5:
             imagen2 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/siete.png";
             break;
         case 6:
             imagen2 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/campana.png";
             break;
              case 7:
             imagen2 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/herradura.png";
             break;
         case 8:
             imagen2 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/frambuesa.png";
             break;
         case 9:
             imagen2 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/bar.png";
             break;
     }
        ImageIcon micono2 = new ImageIcon(imagen2);
        try {
               Thread.sleep(100);
           } catch (InterruptedException ex) {
               Logger.getLogger(moneda.class.getName()).log(Level.SEVERE, null, ex);
           }
        wb1 = b1.getWidth();
    hb1 = b1.getHeight();
   
        Image image2 = micono2.getImage().getScaledInstance(wb1, wb1,0);
        ImageIcon newmicono2 = new ImageIcon(image2);
        b1.setIcon(newmicono2);
         
         
    }
    public void mc3()
    {
        con3++;
        
         Random rand = new Random();
       
     
     numeroAleatorio3 = rand.nextInt(6) + 1;
     String imagen3="";
     switch(numeroAleatorio3)
     {
         case 1:
             imagen3 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/diamante.png";
             break;
         case 2:
             imagen3 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/limon.png";
             break;
         case 3:
             imagen3 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/sandia.png";
             break;
              case 4:
             imagen3 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/corazon.png";
             break;
         case 5:
             imagen3 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/siete.png";
             break;
         case 6:
             imagen3 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/campana.png";
             break;
              case 7:
             imagen3 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/herradura.png";
             break;
         case 8:
             imagen3 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/frambuesa.png";
             break;
         case 9:
             imagen3 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/bar.png";
             break;
    }
         ImageIcon micono3 = new ImageIcon(imagen3);
        try {
               Thread.sleep(100);
           } catch (InterruptedException ex) {
               Logger.getLogger(moneda.class.getName()).log(Level.SEVERE, null, ex);
           }
        wc1 = c1.getWidth();
    hc1 = c1.getHeight();
   
        Image image3 = micono3.getImage().getScaledInstance(wc1, wc1,0);
        ImageIcon newmicono3 = new ImageIcon(image3);
        c1.setIcon(newmicono3);
         
         
    }
    public void m4()
    {
        if(con1>0&&con2>0&&con3>0)
        {
            con1++;
            con2++;
            con3++;
          try {
               Thread.sleep(100);
           } catch (InterruptedException ex) {
               Logger.getLogger(moneda.class.getName()).log(Level.SEVERE, null, ex);
           }
          a2.setIcon(a1.getIcon());
          b2.setIcon(b1.getIcon());
          c2.setIcon(c1.getIcon());
        }
    }
    public void m5()
    {
        if(con1>1&&con2>1&&con3>1)
        {
          try {
               Thread.sleep(100);
           } catch (InterruptedException ex) {
               Logger.getLogger(moneda.class.getName()).log(Level.SEVERE, null, ex);
           }
          a3.setIcon(a2.getIcon());
          b3.setIcon(b2.getIcon());
          c3.setIcon(c2.getIcon());
          con++;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        btgirar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 90, 70));
        jPanel1.add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 90, 80));
        jPanel1.add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 80, 70));
        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 90, 80));
        jPanel1.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, 90, 90));
        jPanel1.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, 90, 90));
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 210, 100, 90));
        jPanel1.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 310, 100, 90));
        jPanel1.add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 420, 90, 90));

        btgirar.setBackground(new java.awt.Color(204, 204, 204));
        btgirar.setText("GIRAR");
        btgirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btgirarActionPerformed(evt);
            }
        });
        jPanel1.add(btgirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 80, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo/silver-slot-machine-gambling-template-for-ui-games-on-black-background-vector.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 750));

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

    private void btgirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btgirarActionPerformed
        con=0;
        con1=0;
        con2=0;
        con3=0;
        columna1=new Thread(this);
         columna2=new Thread(this);
         columna3=new Thread(this);
         alternador=new Thread(this);
         alternador2=new Thread(this);
        columna1.start();
        columna2.start();
        columna3.start();
        alternador.start();
        alternador2.start();
    }//GEN-LAST:event_btgirarActionPerformed

    
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
            java.util.logging.Logger.getLogger(moneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(moneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(moneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(moneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new moneda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JButton btgirar;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
