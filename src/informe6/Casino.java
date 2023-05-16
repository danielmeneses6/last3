
package informe6;

import java.awt.Image;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


public class Casino extends javax.swing.JFrame implements Runnable {

    Thread dado1;
    Thread dado2;
    Thread hilot;
    int c=0;
   
    int labelWidth = 0;
        int labelHeight = 0;
         int labelWidth2 = 0;
        int labelHeight2 = 0;
        int numeroAleatorio=0;
       int numeroAleatorio2=0;
       
       
    public void run()
    {
         
         Thread actual = Thread.currentThread();
     
    while (c < 6 && actual == dado1) {
        hilodado1();
    }
       
    while (c < 6 && actual == dado2) {
        hilodado2();
        
    }
       while (c < 7 && actual == hilot) {
        contador();
    }
    
      
    }
   public void contador()
   {
       try {
               Thread.sleep(1000);
           } catch (InterruptedException ex) {
               Logger.getLogger(Casino.class.getName()).log(Level.SEVERE, null, ex);
           }
      c++;
       
   }
  public void hilodado1()
  {
       Random rand = new Random();
       
     
     numeroAleatorio = rand.nextInt(6) + 1;
      
    String imagenPath = ""; // Ruta de la imagen correspondiente al número aleatorio

    switch(numeroAleatorio) {
        case 1:
            imagenPath = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/unoblanco.png";
            break;
        case 2:
            imagenPath = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/dosnegro.png";
            break;
        case 3:
            imagenPath = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/tresblanco.png";
            break;
        case 4:
            imagenPath = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/cuatroblanco.png";
            break;
        case 5:
            imagenPath = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/cinconegro.jpeg";
            break;
        case 6:
            imagenPath = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/seisnegro.jpeg";
            break;
    }

    ImageIcon micono1 = new ImageIcon(imagenPath);
    try {
        Thread.sleep(300);
    } catch (InterruptedException ex) {
        Logger.getLogger(Casino.class.getName()).log(Level.SEVERE, null, ex);
    }
    labelWidth = espaciodado1.getWidth();
    labelHeight = espaciodado1.getHeight();
   
        Image image = micono1.getImage().getScaledInstance(labelWidth, labelHeight,0);
        ImageIcon newmicono1 = new ImageIcon(image);
        espaciodado1.setIcon(newmicono1);
       //System.out.println("1");
      //System.out.println(numeroAleatorio);
  }
   public void hilodado2()
  {
       Random rand = new Random();
       
     
     numeroAleatorio2 = rand.nextInt(6) + 1;
      
    String imagenPath2 = ""; // Ruta de la imagen correspondiente al número aleatorio

    switch(numeroAleatorio2) {
        case 1:
            imagenPath2 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/unoblanco.png";
            break;
        case 2:
            imagenPath2 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/dosnegro.png";
            break;
        case 3:
            imagenPath2 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/tresblanco.png";
            break;
        case 4:
            imagenPath2 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/cuatroblanco.png";
            break;
        case 5:
            imagenPath2 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/cinconegro.jpeg";
            break;
        case 6:
            imagenPath2 = "D:/UNIVERSIDAD/programacion 3/laboratorio/proyecctos netbeans/informe6/seisnegro.jpeg";
            break;
    }

    ImageIcon micono2 = new ImageIcon(imagenPath2);
    try {
        Thread.sleep(300);
    } catch (InterruptedException ex) {
        Logger.getLogger(Casino.class.getName()).log(Level.SEVERE, null, ex);
    }
   
    labelWidth2 = espaciodado2.getWidth();
    labelHeight2 = espaciodado2.getHeight();
   
        Image image2 = micono2.getImage().getScaledInstance(labelWidth2, labelHeight2,0);
        ImageIcon newmicono2 = new ImageIcon(image2);
        espaciodado2.setIcon(newmicono2);
      //System.out.println("2");
      //System.out.println(numeroAleatorio2);
      
  }
    public Casino() {
        initComponents();
    }

    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgirardados = new javax.swing.JButton();
        espaciodado1 = new javax.swing.JLabel();
        espaciodado2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btgirardados.setText("girar dados");
        btgirardados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btgirardadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(espaciodado1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(espaciodado2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btgirardados, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(espaciodado2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espaciodado1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btgirardados)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btgirardadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btgirardadosActionPerformed
        c=0;
        dado1=new Thread(this);
         hilot=new Thread(this);
         dado2=new Thread(this);
        dado1.start();
        dado2.start();
        hilot.start();
    }//GEN-LAST:event_btgirardadosActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Casino().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btgirardados;
    private javax.swing.JLabel espaciodado1;
    private javax.swing.JLabel espaciodado2;
    // End of variables declaration//GEN-END:variables
}
