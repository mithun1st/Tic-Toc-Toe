/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.kati;

import javax.swing.JOptionPane;
import about.personal;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;


/**
 *
 * @author Mahadi Hassan (Mithun)
 */
public class mainf extends javax.swing.JFrame {

    /**
     * Creates new form mainf
     */
    String m="X";
    boolean s=true;
    
    public mainf() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Tic-Tac-Toe-Game.png")));
        nul();
    }
    
    
    public void nul(){
        j1.setText(null);
        j2.setText(null);
        j3.setText(null);
        j4.setText(null);
        j5.setText(null);
        j6.setText(null);
        j7.setText(null);
        j8.setText(null);
        j9.setText(null);
        //colour set
        j1.setBackground(Color.BLUE);
        j2.setBackground(Color.BLUE);
        j3.setBackground(Color.BLUE);
        j4.setBackground(Color.BLUE);
        j5.setBackground(Color.BLUE);
        j6.setBackground(Color.BLUE);
        j7.setBackground(Color.BLUE);
        j8.setBackground(Color.BLUE);
        j9.setBackground(Color.BLUE);
    }
    
    public void winx(){
        if(j1.getText()=="X" && j2.getText()=="X" && "X"==j3.getText()){
            j1.setBackground(Color.RED);
            j2.setBackground(Color.RED);
            j3.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null,"The winner is- X","Side match",JOptionPane.NO_OPTION);
            x.setText((Integer.parseInt(x.getText())+1)+"");
            m="X";
            s=false;
        }
        else if(j3.getText()=="X" && j6.getText()=="X" && "X"==j9.getText()){
            j6.setBackground(Color.RED);
            j9.setBackground(Color.RED);
            j3.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null,"The winner is- X","Side match",JOptionPane.NO_OPTION);
            x.setText((Integer.parseInt(x.getText())+1)+"");
            m="X";
            s=false;
        }
        else if(j9.getText()=="X" && j8.getText()=="X" && "X"==j7.getText()){
            j7.setBackground(Color.RED);
            j8.setBackground(Color.RED);
            j9.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null,"The winner is- X","Side match",JOptionPane.NO_OPTION);
            x.setText((Integer.parseInt(x.getText())+1)+"");
            m="X";
            s=false;
        }
        else if(j7.getText()=="X" && j4.getText()=="X" && "X"==j1.getText()){
            j1.setBackground(Color.RED);
            j4.setBackground(Color.RED);
            j7.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null,"The winner is- X","Side match",JOptionPane.NO_OPTION);
            x.setText((Integer.parseInt(x.getText())+1)+"");
            m="X";
            s=false;
        }
        //--
        else if(j2.getText()=="X" && j5.getText()=="X" && "X"==j8.getText()){
            j5.setBackground(Color.RED);
            j2.setBackground(Color.RED);
            j8.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null,"The winner is- X","Point match",JOptionPane.NO_OPTION);
            x.setText((Integer.parseInt(x.getText())+1)+"");
            m="X";
            s=false;
        }
        else if(j4.getText()=="X" && j5.getText()=="X" && "X"==j6.getText()){
            j4.setBackground(Color.RED);
            j5.setBackground(Color.RED);
            j6.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null,"The winner is- X","Point match",JOptionPane.NO_OPTION);
            x.setText((Integer.parseInt(x.getText())+1)+"");
            m="X";
            s=false;
        }
        //--
        else if(j1.getText()=="X" && j5.getText()=="X" && "X"==j9.getText()){
            j1.setBackground(Color.RED);
            j5.setBackground(Color.RED);
            j9.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null,"The Winner is- X","Cross match",JOptionPane.NO_OPTION);
            x.setText((Integer.parseInt(x.getText())+1)+"");
            m="X";
            s=false;
        }
        else if(j7.getText()=="X" && j5.getText()=="X" && "X"==j3.getText()){
            j5.setBackground(Color.RED);
            j7.setBackground(Color.RED);
            j3.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null,"The Winner is- X","Cross match",JOptionPane.NO_OPTION);
            x.setText((Integer.parseInt(x.getText())+1)+"");
            m="X";
            s=false;
        }
        //--
        else{
            //JOptionPane.showMessageDialog(null,"Try Again","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    
    
    public void wino(){
        if(j1.getText()=="O" && j2.getText()=="O" && "O"==j3.getText()){
            j1.setBackground(Color.RED);
            j2.setBackground(Color.RED);
            j3.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null,"The winner is- O","Side match",JOptionPane.NO_OPTION);
            o.setText((Integer.parseInt(o.getText())+1)+"");
            m="X";
            s=false;
        }
         else if(j3.getText()=="O" && j6.getText()=="O" && "O"==j9.getText()){
            j6.setBackground(Color.RED);
            j9.setBackground(Color.RED);
            j3.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null,"The winner is- O","Side match",JOptionPane.NO_OPTION);
            o.setText((Integer.parseInt(o.getText())+1)+"");
            m="X";
            s=false;
        }
         else if(j9.getText()=="O" && j8.getText()=="O" && "O"==j7.getText()){
            j7.setBackground(Color.RED);
            j8.setBackground(Color.RED);
            j9.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null,"The winner is- O","Side match",JOptionPane.NO_OPTION);
            o.setText((Integer.parseInt(o.getText())+1)+"");
            m="X";
            s=false;
        }
        else if(j7.getText()=="O" && j4.getText()=="O" && "O"==j1.getText()){
            j1.setBackground(Color.RED);
            j4.setBackground(Color.RED);
            j7.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null,"The winner is- O","Side match",JOptionPane.NO_OPTION);
            o.setText((Integer.parseInt(o.getText())+1)+"");
            m="X";
            s=false;
        }
        //--
         else if(j2.getText()=="O" && j5.getText()=="O" && "O"==j8.getText()){
            j5.setBackground(Color.RED);
            j2.setBackground(Color.RED);
            j8.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null,"The winner is- O","Point match",JOptionPane.NO_OPTION);
            o.setText((Integer.parseInt(o.getText())+1)+"");
            m="X";
            s=false;
        }
        else if(j4.getText()=="O" && j5.getText()=="O" && "O"==j6.getText()){
            j4.setBackground(Color.RED);
            j5.setBackground(Color.RED);
            j6.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null,"The winner is- O","Point match",JOptionPane.NO_OPTION);
            o.setText((Integer.parseInt(o.getText())+1)+"");
            m="X";
            s=false;
        }
        //--
        else if(j1.getText()=="O" && j5.getText()=="O" && "O"==j9.getText()){
            j1.setBackground(Color.RED);
            j5.setBackground(Color.RED);
            j9.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null,"The Winner is- O","Cross match",JOptionPane.NO_OPTION);
            o.setText((Integer.parseInt(o.getText())+1)+"");
            m="X";
            s=false;
        }
        else if(j7.getText()=="O" && j5.getText()=="O" && "O"==j3.getText()){
            j5.setBackground(Color.RED);
            j7.setBackground(Color.RED);
            j3.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null,"The Winner is- O","Cross match",JOptionPane.NO_OPTION);
            o.setText((Integer.parseInt(o.getText())+1)+"");
            m="X";
            s=false;
        }
        //--
        else{
            //JOptionPane.showMessageDialog(null,"Try Again","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public boolean blank(){
        boolean c=false;
        if(j1.getText()!=null && j2.getText()!=null && j3.getText()!=null && j4.getText()!=null && j5.getText()!=null && j6.getText()!=null && j7.getText()!=null && j8.getText()!=null && j9.getText()!=null){
            c=true;
        }        
        return c;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        jPopupMenu5 = new javax.swing.JPopupMenu();
        jPopupMenu6 = new javax.swing.JPopupMenu();
        jPopupMenu7 = new javax.swing.JPopupMenu();
        j1 = new javax.swing.JButton();
        j2 = new javax.swing.JButton();
        j3 = new javax.swing.JButton();
        j4 = new javax.swing.JButton();
        j5 = new javax.swing.JButton();
        j6 = new javax.swing.JButton();
        j7 = new javax.swing.JButton();
        j8 = new javax.swing.JButton();
        j9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        x = new javax.swing.JTextField();
        o = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jPopupMenu7.setToolTipText("Build by Mahadi Hassan");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Katakati developer by Mahadi Hassan (mithun.2121@yahoo.com)");
        setBounds(new java.awt.Rectangle(300, 100, 0, 0));
        setResizable(false);

        j1.setBackground(new java.awt.Color(102, 102, 255));
        j1.setFont(new java.awt.Font("Square721 BT", 1, 24)); // NOI18N
        j1.setForeground(new java.awt.Color(255, 255, 255));
        j1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1ActionPerformed(evt);
            }
        });

        j2.setBackground(new java.awt.Color(102, 102, 255));
        j2.setFont(new java.awt.Font("Square721 BT", 1, 24)); // NOI18N
        j2.setForeground(new java.awt.Color(255, 255, 255));
        j2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2ActionPerformed(evt);
            }
        });

        j3.setBackground(new java.awt.Color(102, 102, 255));
        j3.setFont(new java.awt.Font("Square721 BT", 1, 24)); // NOI18N
        j3.setForeground(new java.awt.Color(255, 255, 255));
        j3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j3ActionPerformed(evt);
            }
        });

        j4.setBackground(new java.awt.Color(102, 102, 255));
        j4.setFont(new java.awt.Font("Square721 BT", 1, 24)); // NOI18N
        j4.setForeground(new java.awt.Color(255, 255, 255));
        j4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j4ActionPerformed(evt);
            }
        });

        j5.setBackground(new java.awt.Color(102, 102, 255));
        j5.setFont(new java.awt.Font("Square721 BT", 1, 24)); // NOI18N
        j5.setForeground(new java.awt.Color(255, 255, 255));
        j5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j5ActionPerformed(evt);
            }
        });

        j6.setBackground(new java.awt.Color(102, 102, 255));
        j6.setFont(new java.awt.Font("Square721 BT", 1, 24)); // NOI18N
        j6.setForeground(new java.awt.Color(255, 255, 255));
        j6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j6ActionPerformed(evt);
            }
        });

        j7.setBackground(new java.awt.Color(102, 102, 255));
        j7.setFont(new java.awt.Font("Square721 BT", 1, 24)); // NOI18N
        j7.setForeground(new java.awt.Color(255, 255, 255));
        j7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j7ActionPerformed(evt);
            }
        });

        j8.setBackground(new java.awt.Color(102, 102, 255));
        j8.setFont(new java.awt.Font("Square721 BT", 1, 24)); // NOI18N
        j8.setForeground(new java.awt.Color(255, 255, 255));
        j8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j8ActionPerformed(evt);
            }
        });

        j9.setBackground(new java.awt.Color(102, 102, 255));
        j9.setFont(new java.awt.Font("Square721 BT", 1, 24)); // NOI18N
        j9.setForeground(new java.awt.Color(255, 255, 255));
        j9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j9ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 0, 153));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("        KataKati            v 1.1");
        jLabel1.setToolTipText("Build by Mahadi Hassan");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 153, 0));
        jTextField1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 30)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 255, 204));
        jTextField1.setText("Player Score");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel2.setText("Player X=");

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel3.setText("Player O=");

        x.setEditable(false);
        x.setBackground(new java.awt.Color(102, 102, 102));
        x.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        x.setForeground(new java.awt.Color(255, 255, 255));
        x.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x.setText("0");
        x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xActionPerformed(evt);
            }
        });

        o.setEditable(false);
        o.setBackground(new java.awt.Color(102, 102, 102));
        o.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        o.setForeground(new java.awt.Color(255, 255, 255));
        o.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        o.setText("0");

        jButton1.setBackground(new java.awt.Color(255, 102, 51));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 204, 204));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 255, 204));
        jButton2.setText("Restart");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 255, 204));
        jButton3.setText("Reset");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton4.setText("About");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(j7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(j4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(j5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(j6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(j8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(j9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(o))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(x))
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(o, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void j1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1ActionPerformed
        // TODO add your handling code here:
        if(s){
            j1.setText(m);
            if(m == "X"){
                m="O";
            }
            else{
                m="X";
            }
            
            if(blank()){
                JOptionPane.showMessageDialog(null,"Match Drow","Warning",JOptionPane.WARNING_MESSAGE);
                nul();
                m="X";
            }
            else{
                winx();
                wino();
            }
        }
    }//GEN-LAST:event_j1ActionPerformed

    private void j2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2ActionPerformed
        // TODO add your handling code here:
        if(s){
            
            j2.setText(m);
            if(m=="X"){
                m="O";
            }
            else{
                m="X";
            }
            if(blank()){
                JOptionPane.showMessageDialog(null,"Match Drow","Warning",JOptionPane.WARNING_MESSAGE);
                nul();
                m="X";
                
            }
            else{
                winx();
                wino();
            }       
        }
    }//GEN-LAST:event_j2ActionPerformed

    private void j7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j7ActionPerformed
        // TODO add your handling code here:
        if(s){
            
            j7.setText(m);
            if(m=="X"){
                m="O";
            }
            else{
                m="X";
            }
            if(blank()){
                JOptionPane.showMessageDialog(null,"Match Drow","Warning",JOptionPane.WARNING_MESSAGE);
                nul();
                m="X";
            }
            else{
                winx();
                wino();
            }
        }
    }//GEN-LAST:event_j7ActionPerformed

    private void j3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j3ActionPerformed
        // TODO add your handling code here:
        if(s){
            j3.setText(m);
            
            if(m=="X"){
                m="O";
            }
            else{
                m="X";
            }
            if(blank()){
                JOptionPane.showMessageDialog(null,"Match Drow","Warning",JOptionPane.WARNING_MESSAGE);
                nul();
                m="X";
            }
            else{
                winx();
                wino();
            }
        }
    }//GEN-LAST:event_j3ActionPerformed

    private void j4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j4ActionPerformed
        // TODO add your handling code here:
        if(s){
            
            j4.setText(m);
            if(m=="X"){
                m="O";
            }
            else{
                m="X";
            }
            if(blank()){
                JOptionPane.showMessageDialog(null,"Match Drow","Warning",JOptionPane.WARNING_MESSAGE);
                nul();
                m="X";
            }
            else{
                winx();
                wino();
            }
        }
    }//GEN-LAST:event_j4ActionPerformed

    private void j5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j5ActionPerformed
        // TODO add your handling code here:
        if(s){
            
            j5.setText(m);
            if(m=="X"){
                m="O";
            }
            else{
                m="X";
            }
            if(blank()){
                JOptionPane.showMessageDialog(null,"Match Drow","Warning",JOptionPane.WARNING_MESSAGE);
                nul();
                m="X";
            }
            else{
                winx();
                wino();
            }
        }
    }//GEN-LAST:event_j5ActionPerformed
    private void j6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j6ActionPerformed
        // TODO add your handling code here:
        if(s){
            
            j6.setText(m);
            if(m=="X"){
                m="O";
            }
            else{
                m="X";
            }
            if(blank()){
                JOptionPane.showMessageDialog(null,"Match Drow","Warning",JOptionPane.WARNING_MESSAGE);
                nul();
                m="X";
            }
            else{
                winx();
                wino();
            }
        }
    }//GEN-LAST:event_j6ActionPerformed


    private void j8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j8ActionPerformed
        // TODO add your handling code here:
        if(s){
            
            j8.setText(m);
            if(m=="X"){
                m="O";
            }
            else{
                m="X";
            }
            if(blank()){
                JOptionPane.showMessageDialog(null,"Match Drow","Warning",JOptionPane.WARNING_MESSAGE);
                nul();
                m="X";
            }
            else{
                winx();
                wino();
            }
        }
    }//GEN-LAST:event_j8ActionPerformed

    private void j9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j9ActionPerformed
        // TODO add your handling code here:
        if(s){
            
            j9.setText(m);
            if(m=="X"){
                m="O";
            }
            else{
                m="X";
            }
            if(blank()){
                JOptionPane.showMessageDialog(null,"Match Drow","Warning",JOptionPane.WARNING_MESSAGE);
                nul();
                m="X";
            }
            else{
                winx();
                wino();
            }
        }
    }//GEN-LAST:event_j9ActionPerformed

    private void xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        m="X";
        nul();
        s=true;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        nul();
        m="X";
        x.setText("0");
        o.setText("0");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new personal().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(mainf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton j1;
    private javax.swing.JButton j2;
    private javax.swing.JButton j3;
    private javax.swing.JButton j4;
    private javax.swing.JButton j5;
    private javax.swing.JButton j6;
    private javax.swing.JButton j7;
    private javax.swing.JButton j8;
    private javax.swing.JButton j9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JPopupMenu jPopupMenu5;
    private javax.swing.JPopupMenu jPopupMenu6;
    private javax.swing.JPopupMenu jPopupMenu7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField o;
    private javax.swing.JTextField x;
    // End of variables declaration//GEN-END:variables
}
