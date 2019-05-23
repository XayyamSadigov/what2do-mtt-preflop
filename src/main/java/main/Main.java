package main;

import java.util.*;
import javax.swing.JButton;
import javax.swing.JToggleButton;

/**
 *
 * @author Khayyam Sadigov
 */
public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        addListener2Cards();
    }

    List<JButton> cards = new ArrayList<>();
    List<JToggleButton> positions = new ArrayList<>();

    private void addListener2Cards() {
        cards.forEach((btn) -> {
            btn.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    cardBtnClicked(evt);
                }
            });
        });

    }

    private void cardBtnClicked(java.awt.event.MouseEvent evt) {

        System.out.println("Stack:" + getStackSize());
        System.out.println("Position:" + getSelectedPosition());
        System.out.println("Hand:" + evt.getComponent().getAccessibleContext().getAccessibleName());

        if (evt.getModifiers() == evt.BUTTON1_MASK) {
            System.out.println("Left button pressed.");
        }

        if (evt.getModifiers() == evt.BUTTON3_MASK) {
            System.out.println("Right button pressed.");
        }
    }

    private String getSelectedPosition() {
        for (JToggleButton btn : positions) {
            if (btn.isSelected()) {
                return btn.getActionCommand();
            }
        }
        return null;
    }

    private int getStackSize() {
        try {
            return Integer.parseInt(eStack.getText());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_AA = new javax.swing.JButton();
cards.add(btn_AA);
btn_AKs = new javax.swing.JButton();
cards.add(btn_AKs);
btn_AQs = new javax.swing.JButton();
cards.add(btn_AQs);
btn_AJs = new javax.swing.JButton();
cards.add(btn_AJs);
btn_ATs = new javax.swing.JButton();
cards.add(btn_ATs);
btn_A9s = new javax.swing.JButton();
cards.add(btn_A9s);
btn_A8s = new javax.swing.JButton();
cards.add(btn_A8s);
btn_A7s = new javax.swing.JButton();
cards.add(btn_A7s);
btn_A6s = new javax.swing.JButton();
cards.add(btn_A6s);
btn_A5s = new javax.swing.JButton();
cards.add(btn_A5s);
btn_A4s = new javax.swing.JButton();
cards.add(btn_A4s);
btn_A3s = new javax.swing.JButton();
cards.add(btn_A3s);
btn_A2s = new javax.swing.JButton();
cards.add(btn_A2s);
btn_AKo = new javax.swing.JButton();
cards.add(btn_AKo);
btn_KK = new javax.swing.JButton();
cards.add(btn_KK);
btn_KQs = new javax.swing.JButton();
cards.add(btn_KQs);
btn_KJs = new javax.swing.JButton();
cards.add(btn_KJs);
btn_KTs = new javax.swing.JButton();
cards.add(btn_KTs);
btn_K9s = new javax.swing.JButton();
cards.add(btn_K9s);
btn_K8s = new javax.swing.JButton();
cards.add(btn_K8s);
btn_K7s = new javax.swing.JButton();
cards.add(btn_K7s);
btn_K6s = new javax.swing.JButton();
cards.add(btn_K6s);
btn_K5s = new javax.swing.JButton();
cards.add(btn_K5s);
btn_K4s = new javax.swing.JButton();
cards.add(btn_K4s);
btn_K3s = new javax.swing.JButton();
cards.add(btn_K3s);
btn_K2s = new javax.swing.JButton();
cards.add(btn_K2s);
btn_AQo = new javax.swing.JButton();
cards.add(btn_AQo);
btn_KQo = new javax.swing.JButton();
cards.add(btn_KQo);
btn_QQ = new javax.swing.JButton();
cards.add(btn_QQ);
btn_QJs = new javax.swing.JButton();
cards.add(btn_QJs);
btn_QTs = new javax.swing.JButton();
cards.add(btn_QTs);
btn_Q9s = new javax.swing.JButton();
cards.add(btn_Q9s);
btn_Q8s = new javax.swing.JButton();
cards.add(btn_Q8s);
btn_Q7s = new javax.swing.JButton();
cards.add(btn_Q7s);
btn_Q6s = new javax.swing.JButton();
cards.add(btn_Q6s);
btn_Q5s = new javax.swing.JButton();
cards.add(btn_Q5s);
btn_Q4s = new javax.swing.JButton();
cards.add(btn_Q4s);
btn_Q3s = new javax.swing.JButton();
cards.add(btn_Q3s);
btn_Q2s = new javax.swing.JButton();
cards.add(btn_Q2s);
btn_AJo = new javax.swing.JButton();
cards.add(btn_AJo);
btn_KJo = new javax.swing.JButton();
cards.add(btn_KJo);
btn_QJo = new javax.swing.JButton();
cards.add(btn_QJo);
btn_JJ = new javax.swing.JButton();
cards.add(btn_JJ);
btn_JTs = new javax.swing.JButton();
cards.add(btn_JTs);
btn_J9s = new javax.swing.JButton();
cards.add(btn_J9s);
btn_J8s = new javax.swing.JButton();
cards.add(btn_J8s);
btn_J7s = new javax.swing.JButton();
cards.add(btn_J7s);
btn_J6s = new javax.swing.JButton();
cards.add(btn_J6s);
btn_J5s = new javax.swing.JButton();
cards.add(btn_J5s);
btn_J4s = new javax.swing.JButton();
cards.add(btn_J4s);
btn_J3s = new javax.swing.JButton();
cards.add(btn_J3s);
btn_J2s = new javax.swing.JButton();
cards.add(btn_J2s);
btn_ATo = new javax.swing.JButton();
cards.add(btn_ATo);
btn_KTo = new javax.swing.JButton();
cards.add(btn_KTo);
btn_QTo = new javax.swing.JButton();
cards.add(btn_QTo);
btn_JTo = new javax.swing.JButton();
cards.add(btn_JTo);
btn_TT = new javax.swing.JButton();
cards.add(btn_TT);
btn_T9s = new javax.swing.JButton();
cards.add(btn_T9s);
btn_T8s = new javax.swing.JButton();
cards.add(btn_T8s);
btn_T7s = new javax.swing.JButton();
cards.add(btn_T7s);
btn_T6s = new javax.swing.JButton();
cards.add(btn_T6s);
btn_T5s = new javax.swing.JButton();
cards.add(btn_T5s);
btn_T4s = new javax.swing.JButton();
cards.add(btn_T4s);
btn_T3s = new javax.swing.JButton();
cards.add(btn_T3s);
btn_T2s = new javax.swing.JButton();
cards.add(btn_T2s);
btn_A9o = new javax.swing.JButton();
cards.add(btn_A9o);
btn_K9o = new javax.swing.JButton();
cards.add(btn_K9o);
btn_Q9o = new javax.swing.JButton();
cards.add(btn_Q9o);
btn_J9o = new javax.swing.JButton();
cards.add(btn_J9o);
btn_T9o = new javax.swing.JButton();
cards.add(btn_T9o);
btn_99 = new javax.swing.JButton();
cards.add(btn_99);
btn_98s = new javax.swing.JButton();
cards.add(btn_98s);
btn_97s = new javax.swing.JButton();
cards.add(btn_97s);
btn_96s = new javax.swing.JButton();
cards.add(btn_96s);
btn_95s = new javax.swing.JButton();
cards.add(btn_95s);
btn_94s = new javax.swing.JButton();
cards.add(btn_94s);
btn_93s = new javax.swing.JButton();
cards.add(btn_93s);
btn_92s = new javax.swing.JButton();
cards.add(btn_92s);
btn_A8o = new javax.swing.JButton();
cards.add(btn_A8o);
btn_K8o = new javax.swing.JButton();
cards.add(btn_K8o);
btn_Q8o = new javax.swing.JButton();
cards.add(btn_Q8o);
btn_J8o = new javax.swing.JButton();
cards.add(btn_J8o);
btn_T8o = new javax.swing.JButton();
cards.add(btn_T8o);
btn_98o = new javax.swing.JButton();
cards.add(btn_98o);
btn_88 = new javax.swing.JButton();
cards.add(btn_88);
btn_87s = new javax.swing.JButton();
cards.add(btn_87s);
btn_86s = new javax.swing.JButton();
cards.add(btn_86s);
btn_85s = new javax.swing.JButton();
cards.add(btn_85s);
btn_84s = new javax.swing.JButton();
cards.add(btn_84s);
btn_83s = new javax.swing.JButton();
cards.add(btn_83s);
btn_82s = new javax.swing.JButton();
cards.add(btn_82s);
btn_A7o = new javax.swing.JButton();
cards.add(btn_A7o);
btn_T7o = new javax.swing.JButton();
cards.add(btn_T7o);
btn_72s = new javax.swing.JButton();
cards.add(btn_72s);
btn_74s = new javax.swing.JButton();
cards.add(btn_74s);
btn_J7o = new javax.swing.JButton();
cards.add(btn_J7o);
btn_76s = new javax.swing.JButton();
cards.add(btn_76s);
btn_97o = new javax.swing.JButton();
cards.add(btn_97o);
btn_87o = new javax.swing.JButton();
cards.add(btn_87o);
btn_Q7o = new javax.swing.JButton();
cards.add(btn_Q7o);
btn_K7o = new javax.swing.JButton();
cards.add(btn_K7o);
btn_75s = new javax.swing.JButton();
cards.add(btn_75s);
btn_77 = new javax.swing.JButton();
cards.add(btn_77);
btn_73s = new javax.swing.JButton();
cards.add(btn_73s);
btn_A6o = new javax.swing.JButton();
cards.add(btn_A6o);
btn_T6o = new javax.swing.JButton();
cards.add(btn_T6o);
btn_62s = new javax.swing.JButton();
cards.add(btn_62s);
btn_64s = new javax.swing.JButton();
cards.add(btn_64s);
btn_J6o = new javax.swing.JButton();
cards.add(btn_J6o);
btn_66 = new javax.swing.JButton();
cards.add(btn_66);
btn_96o = new javax.swing.JButton();
cards.add(btn_96o);
btn_86o = new javax.swing.JButton();
cards.add(btn_86o);
btn_Q6o = new javax.swing.JButton();
cards.add(btn_Q6o);
btn_K6o = new javax.swing.JButton();
cards.add(btn_K6o);
btn_65s = new javax.swing.JButton();
cards.add(btn_65s);
btn_76o = new javax.swing.JButton();
cards.add(btn_76o);
btn_63s = new javax.swing.JButton();
cards.add(btn_63s);
btn_A5o = new javax.swing.JButton();
cards.add(btn_A5o);
btn_T5o = new javax.swing.JButton();
cards.add(btn_T5o);
btn_52s = new javax.swing.JButton();
cards.add(btn_52s);
btn_54s = new javax.swing.JButton();
cards.add(btn_54s);
btn_J5o = new javax.swing.JButton();
cards.add(btn_J5o);
btn_65o = new javax.swing.JButton();
cards.add(btn_65o);
btn_95o = new javax.swing.JButton();
cards.add(btn_95o);
btn_85o = new javax.swing.JButton();
cards.add(btn_85o);
btn_Q5o = new javax.swing.JButton();
cards.add(btn_Q5o);
btn_K5o = new javax.swing.JButton();
cards.add(btn_K5o);
btn_55 = new javax.swing.JButton();
cards.add(btn_55);
btn_75o = new javax.swing.JButton();
cards.add(btn_75o);
btn_53s = new javax.swing.JButton();
cards.add(btn_53s);
btn_A4o = new javax.swing.JButton();
cards.add(btn_A4o);
btn_T4o = new javax.swing.JButton();
cards.add(btn_T4o);
btn_42s = new javax.swing.JButton();
cards.add(btn_42s);
btn_44 = new javax.swing.JButton();
cards.add(btn_44);
btn_J4o = new javax.swing.JButton();
cards.add(btn_J4o);
btn_64o = new javax.swing.JButton();
cards.add(btn_64o);
btn_94o = new javax.swing.JButton();
cards.add(btn_94o);
btn_84o = new javax.swing.JButton();
cards.add(btn_84o);
btn_Q4o = new javax.swing.JButton();
cards.add(btn_Q4o);
btn_K4o = new javax.swing.JButton();
cards.add(btn_K4o);
btn_54o = new javax.swing.JButton();
cards.add(btn_54o);
btn_74o = new javax.swing.JButton();
cards.add(btn_74o);
btn_43s = new javax.swing.JButton();
cards.add(btn_43s);
btn_A3o = new javax.swing.JButton();
cards.add(btn_A3o);
btn_T3o = new javax.swing.JButton();
cards.add(btn_T3o);
btn_32s = new javax.swing.JButton();
cards.add(btn_32s);
btn_43o = new javax.swing.JButton();
cards.add(btn_43o);
btn_J3o = new javax.swing.JButton();
cards.add(btn_J3o);
btn_63o = new javax.swing.JButton();
cards.add(btn_63o);
btn_93o = new javax.swing.JButton();
cards.add(btn_93o);
btn_83o = new javax.swing.JButton();
cards.add(btn_83o);
btn_Q3o = new javax.swing.JButton();
cards.add(btn_Q3o);
btn_K3o = new javax.swing.JButton();
cards.add(btn_K3o);
btn_53o = new javax.swing.JButton();
cards.add(btn_53o);
btn_73o = new javax.swing.JButton();
cards.add(btn_73o);
btn_33 = new javax.swing.JButton();
cards.add(btn_33);
btn_A2o = new javax.swing.JButton();
cards.add(btn_A2o);
btn_T2o = new javax.swing.JButton();
cards.add(btn_T2o);
btn_22 = new javax.swing.JButton();
cards.add(btn_22);
btn_42o = new javax.swing.JButton();
cards.add(btn_42o);
btn_J2o = new javax.swing.JButton();
cards.add(btn_J2o);
btn_62o = new javax.swing.JButton();
cards.add(btn_62o);
btn_92o = new javax.swing.JButton();
cards.add(btn_92o);
btn_82o = new javax.swing.JButton();
cards.add(btn_82o);
btn_Q2o = new javax.swing.JButton();
cards.add(btn_Q2o);
btn_K2o = new javax.swing.JButton();
cards.add(btn_K2o);
btn_52o = new javax.swing.JButton();
cards.add(btn_52o);
btn_72o = new javax.swing.JButton();
cards.add(btn_72o);
btn_32o = new javax.swing.JButton();
cards.add(btn_32o);

btn_utg = new javax.swing.JToggleButton();
positions.add(btn_utg);
btn_utg1 = new javax.swing.JToggleButton();
positions.add(btn_utg1);
btn_utg2 = new javax.swing.JToggleButton();
positions.add(btn_utg2);
btn_mp = new javax.swing.JToggleButton();
positions.add(btn_mp);
btn_hj = new javax.swing.JToggleButton();
positions.add(btn_hj);
btn_co = new javax.swing.JToggleButton();
positions.add(btn_co);
btn_bu = new javax.swing.JToggleButton();
positions.add(btn_bu);
btn_sb = new javax.swing.JToggleButton();
positions.add(btn_sb);
btn_bb = new javax.swing.JToggleButton();
positions.add(btn_bb);
eStack = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("what2do mtt peflop");
        setResizable(false);

        btn_AA.setBackground(new java.awt.Color(0, 204, 51));
        btn_AA.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_AA.setText("AA");
        btn_AA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_AKs.setBackground(new java.awt.Color(153, 153, 0));
        btn_AKs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_AKs.setText("AKs");
        btn_AKs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_AQs.setBackground(new java.awt.Color(153, 153, 0));
        btn_AQs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_AQs.setText("AQs");
        btn_AQs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_AJs.setBackground(new java.awt.Color(153, 153, 0));
        btn_AJs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_AJs.setText("AJs");
        btn_AJs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_ATs.setBackground(new java.awt.Color(153, 153, 0));
        btn_ATs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_ATs.setText("ATs");
        btn_ATs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_A9s.setBackground(new java.awt.Color(153, 153, 0));
        btn_A9s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_A9s.setText("A9s");
        btn_A9s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_A8s.setBackground(new java.awt.Color(153, 153, 0));
        btn_A8s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_A8s.setText("A8s");
        btn_A8s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_A7s.setBackground(new java.awt.Color(153, 153, 0));
        btn_A7s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_A7s.setText("A7s");
        btn_A7s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_A6s.setBackground(new java.awt.Color(153, 153, 0));
        btn_A6s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_A6s.setText("A6s");
        btn_A6s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_A5s.setBackground(new java.awt.Color(153, 153, 0));
        btn_A5s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_A5s.setText("A5s");
        btn_A5s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_A4s.setBackground(new java.awt.Color(153, 153, 0));
        btn_A4s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_A4s.setText("A4s");
        btn_A4s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_A3s.setBackground(new java.awt.Color(153, 153, 0));
        btn_A3s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_A3s.setText("A3s");
        btn_A3s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_A2s.setBackground(new java.awt.Color(153, 153, 0));
        btn_A2s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_A2s.setText("A2s");
        btn_A2s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_AKo.setBackground(new java.awt.Color(204, 255, 255));
        btn_AKo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_AKo.setText("AKo");
        btn_AKo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_KK.setBackground(new java.awt.Color(0, 204, 51));
        btn_KK.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_KK.setText("KK");
        btn_KK.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_KQs.setBackground(new java.awt.Color(153, 153, 0));
        btn_KQs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_KQs.setText("KQs");
        btn_KQs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_KJs.setBackground(new java.awt.Color(153, 153, 0));
        btn_KJs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_KJs.setText("KJs");
        btn_KJs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_KTs.setBackground(new java.awt.Color(153, 153, 0));
        btn_KTs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_KTs.setText("KTs");
        btn_KTs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_K9s.setBackground(new java.awt.Color(153, 153, 0));
        btn_K9s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_K9s.setText("K9s");
        btn_K9s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_K8s.setBackground(new java.awt.Color(153, 153, 0));
        btn_K8s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_K8s.setText("K8s");
        btn_K8s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_K7s.setBackground(new java.awt.Color(153, 153, 0));
        btn_K7s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_K7s.setText("K7s");
        btn_K7s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_K6s.setBackground(new java.awt.Color(153, 153, 0));
        btn_K6s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_K6s.setText("K6s");
        btn_K6s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_K5s.setBackground(new java.awt.Color(153, 153, 0));
        btn_K5s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_K5s.setText("K5s");
        btn_K5s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_K4s.setBackground(new java.awt.Color(153, 153, 0));
        btn_K4s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_K4s.setText("K4s");
        btn_K4s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_K3s.setBackground(new java.awt.Color(153, 153, 0));
        btn_K3s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_K3s.setText("K3s");
        btn_K3s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_K2s.setBackground(new java.awt.Color(153, 153, 0));
        btn_K2s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_K2s.setText("K2s");
        btn_K2s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_AQo.setBackground(new java.awt.Color(204, 255, 255));
        btn_AQo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_AQo.setText("AQo");
        btn_AQo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_KQo.setBackground(new java.awt.Color(204, 255, 255));
        btn_KQo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_KQo.setText("KQo");
        btn_KQo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_QQ.setBackground(new java.awt.Color(0, 204, 51));
        btn_QQ.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_QQ.setText("QQ");
        btn_QQ.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_QJs.setBackground(new java.awt.Color(153, 153, 0));
        btn_QJs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_QJs.setText("QJs");
        btn_QJs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_QTs.setBackground(new java.awt.Color(153, 153, 0));
        btn_QTs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_QTs.setText("QTs");
        btn_QTs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_Q9s.setBackground(new java.awt.Color(153, 153, 0));
        btn_Q9s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_Q9s.setText("Q9s");
        btn_Q9s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_Q8s.setBackground(new java.awt.Color(153, 153, 0));
        btn_Q8s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_Q8s.setText("Q8s");
        btn_Q8s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_Q7s.setBackground(new java.awt.Color(153, 153, 0));
        btn_Q7s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_Q7s.setText("Q7s");
        btn_Q7s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_Q6s.setBackground(new java.awt.Color(153, 153, 0));
        btn_Q6s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_Q6s.setText("Q6s");
        btn_Q6s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_Q5s.setBackground(new java.awt.Color(153, 153, 0));
        btn_Q5s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_Q5s.setText("Q5s");
        btn_Q5s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_Q4s.setBackground(new java.awt.Color(153, 153, 0));
        btn_Q4s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_Q4s.setText("Q4s");
        btn_Q4s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_Q3s.setBackground(new java.awt.Color(153, 153, 0));
        btn_Q3s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_Q3s.setText("Q3s");
        btn_Q3s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_Q2s.setBackground(new java.awt.Color(153, 153, 0));
        btn_Q2s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_Q2s.setText("Q2s");
        btn_Q2s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_AJo.setBackground(new java.awt.Color(204, 255, 255));
        btn_AJo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_AJo.setText("AJo");
        btn_AJo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_KJo.setBackground(new java.awt.Color(204, 255, 255));
        btn_KJo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_KJo.setText("KJo");
        btn_KJo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_QJo.setBackground(new java.awt.Color(204, 255, 255));
        btn_QJo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_QJo.setText("QJo");
        btn_QJo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_JJ.setBackground(new java.awt.Color(0, 204, 51));
        btn_JJ.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_JJ.setText("JJ");
        btn_JJ.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_JTs.setBackground(new java.awt.Color(153, 153, 0));
        btn_JTs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_JTs.setText("JTs");
        btn_JTs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_J9s.setBackground(new java.awt.Color(153, 153, 0));
        btn_J9s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_J9s.setText("J9s");
        btn_J9s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_J8s.setBackground(new java.awt.Color(153, 153, 0));
        btn_J8s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_J8s.setText("J8s");
        btn_J8s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_J7s.setBackground(new java.awt.Color(153, 153, 0));
        btn_J7s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_J7s.setText("J7s");
        btn_J7s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_J6s.setBackground(new java.awt.Color(153, 153, 0));
        btn_J6s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_J6s.setText("J6s");
        btn_J6s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_J5s.setBackground(new java.awt.Color(153, 153, 0));
        btn_J5s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_J5s.setText("J5s");
        btn_J5s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_J4s.setBackground(new java.awt.Color(153, 153, 0));
        btn_J4s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_J4s.setText("J4s");
        btn_J4s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_J3s.setBackground(new java.awt.Color(153, 153, 0));
        btn_J3s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_J3s.setText("J3s");
        btn_J3s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_J2s.setBackground(new java.awt.Color(153, 153, 0));
        btn_J2s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_J2s.setText("J2s");
        btn_J2s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_ATo.setBackground(new java.awt.Color(204, 255, 255));
        btn_ATo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_ATo.setText("ATo");
        btn_ATo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_KTo.setBackground(new java.awt.Color(204, 255, 255));
        btn_KTo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_KTo.setText("KTo");
        btn_KTo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_QTo.setBackground(new java.awt.Color(204, 255, 255));
        btn_QTo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_QTo.setText("QTo");
        btn_QTo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_JTo.setBackground(new java.awt.Color(204, 255, 255));
        btn_JTo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_JTo.setText("JTo");
        btn_JTo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_TT.setBackground(new java.awt.Color(0, 204, 51));
        btn_TT.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_TT.setText("TT");
        btn_TT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_T9s.setBackground(new java.awt.Color(153, 153, 0));
        btn_T9s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_T9s.setText("T9s");
        btn_T9s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_T8s.setBackground(new java.awt.Color(153, 153, 0));
        btn_T8s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_T8s.setText("T8s");
        btn_T8s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_T7s.setBackground(new java.awt.Color(153, 153, 0));
        btn_T7s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_T7s.setText("T7s");
        btn_T7s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_T6s.setBackground(new java.awt.Color(153, 153, 0));
        btn_T6s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_T6s.setText("T6s");
        btn_T6s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_T5s.setBackground(new java.awt.Color(153, 153, 0));
        btn_T5s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_T5s.setText("T5s");
        btn_T5s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_T4s.setBackground(new java.awt.Color(153, 153, 0));
        btn_T4s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_T4s.setText("T4s");
        btn_T4s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_T3s.setBackground(new java.awt.Color(153, 153, 0));
        btn_T3s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_T3s.setText("T3s");
        btn_T3s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_T2s.setBackground(new java.awt.Color(153, 153, 0));
        btn_T2s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_T2s.setText("T2s");
        btn_T2s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_A9o.setBackground(new java.awt.Color(204, 255, 255));
        btn_A9o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_A9o.setText("A9o");
        btn_A9o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_K9o.setBackground(new java.awt.Color(204, 255, 255));
        btn_K9o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_K9o.setText("K9o");
        btn_K9o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_Q9o.setBackground(new java.awt.Color(204, 255, 255));
        btn_Q9o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_Q9o.setText("Q9o");
        btn_Q9o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_J9o.setBackground(new java.awt.Color(204, 255, 255));
        btn_J9o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_J9o.setText("J9o");
        btn_J9o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_T9o.setBackground(new java.awt.Color(204, 255, 255));
        btn_T9o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_T9o.setText("T9o");
        btn_T9o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_99.setBackground(new java.awt.Color(0, 204, 51));
        btn_99.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_99.setText("99");
        btn_99.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_98s.setBackground(new java.awt.Color(153, 153, 0));
        btn_98s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_98s.setText("98s");
        btn_98s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_97s.setBackground(new java.awt.Color(153, 153, 0));
        btn_97s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_97s.setText("97s");
        btn_97s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_96s.setBackground(new java.awt.Color(153, 153, 0));
        btn_96s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_96s.setText("96s");
        btn_96s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_95s.setBackground(new java.awt.Color(153, 153, 0));
        btn_95s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_95s.setText("95s");
        btn_95s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_94s.setBackground(new java.awt.Color(153, 153, 0));
        btn_94s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_94s.setText("94s");
        btn_94s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_93s.setBackground(new java.awt.Color(153, 153, 0));
        btn_93s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_93s.setText("93s");
        btn_93s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_92s.setBackground(new java.awt.Color(153, 153, 0));
        btn_92s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_92s.setText("92s");
        btn_92s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_A8o.setBackground(new java.awt.Color(204, 255, 255));
        btn_A8o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_A8o.setText("A8o");
        btn_A8o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_K8o.setBackground(new java.awt.Color(204, 255, 255));
        btn_K8o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_K8o.setText("K8o");
        btn_K8o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_Q8o.setBackground(new java.awt.Color(204, 255, 255));
        btn_Q8o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_Q8o.setText("Q8o");
        btn_Q8o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_J8o.setBackground(new java.awt.Color(204, 255, 255));
        btn_J8o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_J8o.setText("J8o");
        btn_J8o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_T8o.setBackground(new java.awt.Color(204, 255, 255));
        btn_T8o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_T8o.setText("T8o");
        btn_T8o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_98o.setBackground(new java.awt.Color(204, 255, 255));
        btn_98o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_98o.setText("98o");
        btn_98o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_88.setBackground(new java.awt.Color(0, 204, 51));
        btn_88.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_88.setText("88");
        btn_88.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_87s.setBackground(new java.awt.Color(153, 153, 0));
        btn_87s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_87s.setText("87s");
        btn_87s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_86s.setBackground(new java.awt.Color(153, 153, 0));
        btn_86s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_86s.setText("86s");
        btn_86s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_85s.setBackground(new java.awt.Color(153, 153, 0));
        btn_85s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_85s.setText("85s");
        btn_85s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_84s.setBackground(new java.awt.Color(153, 153, 0));
        btn_84s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_84s.setText("84s");
        btn_84s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_83s.setBackground(new java.awt.Color(153, 153, 0));
        btn_83s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_83s.setText("83s");
        btn_83s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_82s.setBackground(new java.awt.Color(153, 153, 0));
        btn_82s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_82s.setText("82s");
        btn_82s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_A7o.setBackground(new java.awt.Color(204, 255, 255));
        btn_A7o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_A7o.setText("A7o");
        btn_A7o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_T7o.setBackground(new java.awt.Color(204, 255, 255));
        btn_T7o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_T7o.setText("T7o");
        btn_T7o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_72s.setBackground(new java.awt.Color(153, 153, 0));
        btn_72s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_72s.setText("72s");
        btn_72s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_74s.setBackground(new java.awt.Color(153, 153, 0));
        btn_74s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_74s.setText("74s");
        btn_74s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_J7o.setBackground(new java.awt.Color(204, 255, 255));
        btn_J7o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_J7o.setText("J7o");
        btn_J7o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_76s.setBackground(new java.awt.Color(153, 153, 0));
        btn_76s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_76s.setText("76s");
        btn_76s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_97o.setBackground(new java.awt.Color(204, 255, 255));
        btn_97o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_97o.setText("97o");
        btn_97o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_87o.setBackground(new java.awt.Color(204, 255, 255));
        btn_87o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_87o.setText("87o");
        btn_87o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_Q7o.setBackground(new java.awt.Color(204, 255, 255));
        btn_Q7o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_Q7o.setText("Q7o");
        btn_Q7o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_K7o.setBackground(new java.awt.Color(204, 255, 255));
        btn_K7o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_K7o.setText("K7o");
        btn_K7o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_75s.setBackground(new java.awt.Color(153, 153, 0));
        btn_75s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_75s.setText("75s");
        btn_75s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_77.setBackground(new java.awt.Color(0, 204, 51));
        btn_77.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_77.setText("77");
        btn_77.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_73s.setBackground(new java.awt.Color(153, 153, 0));
        btn_73s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_73s.setText("73s");
        btn_73s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_A6o.setBackground(new java.awt.Color(204, 255, 255));
        btn_A6o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_A6o.setText("A6o");
        btn_A6o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_T6o.setBackground(new java.awt.Color(204, 255, 255));
        btn_T6o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_T6o.setText("T6o");
        btn_T6o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_62s.setBackground(new java.awt.Color(153, 153, 0));
        btn_62s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_62s.setText("62s");
        btn_62s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_64s.setBackground(new java.awt.Color(153, 153, 0));
        btn_64s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_64s.setText("64s");
        btn_64s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_J6o.setBackground(new java.awt.Color(204, 255, 255));
        btn_J6o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_J6o.setText("J6o");
        btn_J6o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_66.setBackground(new java.awt.Color(0, 204, 51));
        btn_66.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_66.setText("66");
        btn_66.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_96o.setBackground(new java.awt.Color(204, 255, 255));
        btn_96o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_96o.setText("96o");
        btn_96o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_86o.setBackground(new java.awt.Color(204, 255, 255));
        btn_86o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_86o.setText("86o");
        btn_86o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_Q6o.setBackground(new java.awt.Color(204, 255, 255));
        btn_Q6o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_Q6o.setText("Q6o");
        btn_Q6o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_K6o.setBackground(new java.awt.Color(204, 255, 255));
        btn_K6o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_K6o.setText("K6o");
        btn_K6o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_65s.setBackground(new java.awt.Color(153, 153, 0));
        btn_65s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_65s.setText("65s");
        btn_65s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_76o.setBackground(new java.awt.Color(204, 255, 255));
        btn_76o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_76o.setText("76o");
        btn_76o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_63s.setBackground(new java.awt.Color(153, 153, 0));
        btn_63s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_63s.setText("63s");
        btn_63s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_A5o.setBackground(new java.awt.Color(204, 255, 255));
        btn_A5o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_A5o.setText("A5o");
        btn_A5o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_T5o.setBackground(new java.awt.Color(204, 255, 255));
        btn_T5o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_T5o.setText("T5o");
        btn_T5o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_52s.setBackground(new java.awt.Color(153, 153, 0));
        btn_52s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_52s.setText("52s");
        btn_52s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_54s.setBackground(new java.awt.Color(153, 153, 0));
        btn_54s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_54s.setText("54s");
        btn_54s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_J5o.setBackground(new java.awt.Color(204, 255, 255));
        btn_J5o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_J5o.setText("J5o");
        btn_J5o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_65o.setBackground(new java.awt.Color(204, 255, 255));
        btn_65o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_65o.setText("65o");
        btn_65o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_95o.setBackground(new java.awt.Color(204, 255, 255));
        btn_95o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_95o.setText("95o");
        btn_95o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_85o.setBackground(new java.awt.Color(204, 255, 255));
        btn_85o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_85o.setText("85o");
        btn_85o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_Q5o.setBackground(new java.awt.Color(204, 255, 255));
        btn_Q5o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_Q5o.setText("Q5o");
        btn_Q5o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_K5o.setBackground(new java.awt.Color(204, 255, 255));
        btn_K5o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_K5o.setText("K5o");
        btn_K5o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_55.setBackground(new java.awt.Color(0, 204, 51));
        btn_55.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_55.setText("55");
        btn_55.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_75o.setBackground(new java.awt.Color(204, 255, 255));
        btn_75o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_75o.setText("75o");
        btn_75o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_53s.setBackground(new java.awt.Color(153, 153, 0));
        btn_53s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_53s.setText("53s");
        btn_53s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_A4o.setBackground(new java.awt.Color(204, 255, 255));
        btn_A4o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_A4o.setText("A4o");
        btn_A4o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_T4o.setBackground(new java.awt.Color(204, 255, 255));
        btn_T4o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_T4o.setText("T4o");
        btn_T4o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_42s.setBackground(new java.awt.Color(153, 153, 0));
        btn_42s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_42s.setText("42s");
        btn_42s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_44.setBackground(new java.awt.Color(0, 204, 51));
        btn_44.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_44.setText("44");
        btn_44.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_J4o.setBackground(new java.awt.Color(204, 255, 255));
        btn_J4o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_J4o.setText("J4o");
        btn_J4o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_64o.setBackground(new java.awt.Color(204, 255, 255));
        btn_64o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_64o.setText("64o");
        btn_64o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_94o.setBackground(new java.awt.Color(204, 255, 255));
        btn_94o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_94o.setText("94o");
        btn_94o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_84o.setBackground(new java.awt.Color(204, 255, 255));
        btn_84o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_84o.setText("84o");
        btn_84o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_Q4o.setBackground(new java.awt.Color(204, 255, 255));
        btn_Q4o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_Q4o.setText("Q4o");
        btn_Q4o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_K4o.setBackground(new java.awt.Color(204, 255, 255));
        btn_K4o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_K4o.setText("K4o");
        btn_K4o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_54o.setBackground(new java.awt.Color(204, 255, 255));
        btn_54o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_54o.setText("54o");
        btn_54o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_74o.setBackground(new java.awt.Color(204, 255, 255));
        btn_74o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_74o.setText("74o");
        btn_74o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_43s.setBackground(new java.awt.Color(153, 153, 0));
        btn_43s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_43s.setText("43s");
        btn_43s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_A3o.setBackground(new java.awt.Color(204, 255, 255));
        btn_A3o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_A3o.setText("A3o");
        btn_A3o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_T3o.setBackground(new java.awt.Color(204, 255, 255));
        btn_T3o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_T3o.setText("T3o");
        btn_T3o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_32s.setBackground(new java.awt.Color(153, 153, 0));
        btn_32s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_32s.setText("32s");
        btn_32s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_43o.setBackground(new java.awt.Color(204, 255, 255));
        btn_43o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_43o.setText("43o");
        btn_43o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_J3o.setBackground(new java.awt.Color(204, 255, 255));
        btn_J3o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_J3o.setText("J3o");
        btn_J3o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_63o.setBackground(new java.awt.Color(204, 255, 255));
        btn_63o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_63o.setText("63o");
        btn_63o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_93o.setBackground(new java.awt.Color(204, 255, 255));
        btn_93o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_93o.setText("93o");
        btn_93o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_83o.setBackground(new java.awt.Color(204, 255, 255));
        btn_83o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_83o.setText("83o");
        btn_83o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_Q3o.setBackground(new java.awt.Color(204, 255, 255));
        btn_Q3o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_Q3o.setText("Q3o");
        btn_Q3o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_K3o.setBackground(new java.awt.Color(204, 255, 255));
        btn_K3o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_K3o.setText("K3o");
        btn_K3o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_53o.setBackground(new java.awt.Color(204, 255, 255));
        btn_53o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_53o.setText("53o");
        btn_53o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_73o.setBackground(new java.awt.Color(204, 255, 255));
        btn_73o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_73o.setText("73o");
        btn_73o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_33.setBackground(new java.awt.Color(0, 204, 51));
        btn_33.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_33.setText("33");
        btn_33.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_A2o.setBackground(new java.awt.Color(204, 255, 255));
        btn_A2o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_A2o.setText("A2o");
        btn_A2o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_T2o.setBackground(new java.awt.Color(204, 255, 255));
        btn_T2o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_T2o.setText("T2o");
        btn_T2o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_22.setBackground(new java.awt.Color(0, 204, 51));
        btn_22.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_22.setText("22");
        btn_22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_42o.setBackground(new java.awt.Color(204, 255, 255));
        btn_42o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_42o.setText("42o");
        btn_42o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_J2o.setBackground(new java.awt.Color(204, 255, 255));
        btn_J2o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_J2o.setText("J2o");
        btn_J2o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_62o.setBackground(new java.awt.Color(204, 255, 255));
        btn_62o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_62o.setText("62o");
        btn_62o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_92o.setBackground(new java.awt.Color(204, 255, 255));
        btn_92o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_92o.setText("92o");
        btn_92o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_82o.setBackground(new java.awt.Color(204, 255, 255));
        btn_82o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_82o.setText("82o");
        btn_82o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_Q2o.setBackground(new java.awt.Color(204, 255, 255));
        btn_Q2o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_Q2o.setText("Q2o");
        btn_Q2o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_K2o.setBackground(new java.awt.Color(204, 255, 255));
        btn_K2o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_K2o.setText("K2o");
        btn_K2o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_52o.setBackground(new java.awt.Color(204, 255, 255));
        btn_52o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_52o.setText("52o");
        btn_52o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_72o.setBackground(new java.awt.Color(204, 255, 255));
        btn_72o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_72o.setText("72o");
        btn_72o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_32o.setBackground(new java.awt.Color(204, 255, 255));
        btn_32o.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_32o.setText("32o");
        btn_32o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btn_A2o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_K2o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Q2o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_J2o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_T2o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_92o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_82o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_72o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_62o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_52o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_42o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_32o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_22, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_A7o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_K7o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Q7o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_J7o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_T7o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_97o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_87o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_77, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_76s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_75s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_74s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_73s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_72s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn_AA, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_AKs, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_AQs, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_AJs, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_ATs, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_A9s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_A8s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_A7s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_A6s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_A5s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_A4s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_A3s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_A2s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn_AKo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_KK, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_KQs, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_KJs, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_KTs, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_K9s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_K8s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_K7s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_K6s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_K5s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_K4s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_K3s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_K2s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn_AQo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_KQo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_QQ, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_QJs, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_QTs, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_Q9s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_Q8s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_Q7s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_Q6s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_Q5s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_Q4s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_Q3s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_Q2s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn_AJo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_KJo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_QJo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_JJ, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_JTs, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_J9s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_J8s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_J7s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_J6s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_J5s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_J4s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_J3s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_J2s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn_ATo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_KTo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_QTo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_JTo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_TT, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_T9s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_T8s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_T7s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_T6s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_T5s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_T4s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_T3s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_T2s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn_A9o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_K9o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_Q9o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_J9o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_T9o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_99, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_98s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_97s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_96s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_95s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_94s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_93s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_92s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn_A8o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_K8o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_Q8o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_J8o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_T8o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_98o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_88, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_87s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_86s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_85s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_84s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_83s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_82s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(btn_A6o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_K6o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_Q6o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_J6o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_T6o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_96o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_86o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_76o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_66, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_65s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_64s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_63s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_62s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(btn_A5o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_K5o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_Q5o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_J5o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_T5o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_95o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_85o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_75o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_65o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_55, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_54s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_53s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_52s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(btn_A4o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_K4o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_Q4o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_J4o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_T4o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_94o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_84o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_74o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_64o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_54o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_44, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_43s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_42s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(btn_A3o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_K3o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_Q3o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_J3o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_T3o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_93o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_83o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_73o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_63o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_53o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_43o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_33, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_32s, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_AA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_AKs, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_AQs, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_AJs, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ATs, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_A9s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_A8s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_A7s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_A6s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_A5s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_A4s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_A3s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_A2s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_AKo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_KK, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_KQs, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_KJs, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_KTs, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_K9s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_K8s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_K7s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_K6s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_K5s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_K4s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_K3s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_K2s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_AQo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_KQo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_QQ, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_QJs, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_QTs, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Q9s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Q8s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Q7s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Q6s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Q5s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Q4s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Q3s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Q2s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_AJo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_KJo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_QJo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_JJ, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_JTs, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_J9s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_J8s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_J7s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_J6s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_J5s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_J4s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_J3s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_J2s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ATo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_KTo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_QTo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_JTo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_TT, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_T9s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_T8s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_T7s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_T6s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_T5s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_T4s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_T3s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_T2s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_A9o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_K9o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Q9o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_J9o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_T9o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_99, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_98s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_97s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_96s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_95s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_94s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_93s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_92s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_A8o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_K8o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Q8o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_J8o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_T8o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_98o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_88, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_87s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_86s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_85s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_84s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_83s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_82s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_A7o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_K7o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Q7o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_J7o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_T7o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_97o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_87o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_77, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_76s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_75s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_74s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_73s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_72s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_A6o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_K6o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Q6o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_J6o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_T6o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_96o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_86o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_76o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_66, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_65s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_64s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_63s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_62s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_A5o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_K5o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Q5o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_J5o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_T5o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_95o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_85o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_75o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_65o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_55, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_54s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_53s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_52s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_A4o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_K4o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Q4o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_J4o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_T4o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_94o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_84o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_74o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_64o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_54o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_44, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_43s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_42s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_A3o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_K3o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Q3o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_J3o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_T3o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_93o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_83o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_73o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_63o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_53o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_43o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_33, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_32s, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_A2o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_K2o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Q2o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_J2o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_T2o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_92o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_82o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_72o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_62o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_52o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_42o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_32o, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_22, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btn_utg.setBackground(new java.awt.Color(153, 153, 153));
        btn_utg.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_utg.setText("UTG");
        btn_utg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionBtnClicked(evt);
            }
        });

        btn_utg1.setBackground(new java.awt.Color(153, 153, 153));
        btn_utg1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_utg1.setText("UTG+1");
        btn_utg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionBtnClicked(evt);
            }
        });

        btn_utg2.setBackground(new java.awt.Color(153, 153, 153));
        btn_utg2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_utg2.setText("UTG+2");
        btn_utg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionBtnClicked(evt);
            }
        });

        btn_mp.setBackground(new java.awt.Color(153, 153, 153));
        btn_mp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_mp.setText("MP");
        btn_mp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionBtnClicked(evt);
            }
        });

        btn_hj.setBackground(new java.awt.Color(153, 153, 153));
        btn_hj.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_hj.setText("HJ");
        btn_hj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionBtnClicked(evt);
            }
        });

        btn_co.setBackground(new java.awt.Color(153, 153, 153));
        btn_co.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_co.setText("CO");
        btn_co.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionBtnClicked(evt);
            }
        });

        btn_bu.setBackground(new java.awt.Color(153, 153, 153));
        btn_bu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_bu.setText("BU");
        btn_bu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionBtnClicked(evt);
            }
        });

        btn_sb.setBackground(new java.awt.Color(153, 153, 153));
        btn_sb.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_sb.setText("SB");
        btn_sb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionBtnClicked(evt);
            }
        });

        btn_bb.setBackground(new java.awt.Color(153, 153, 153));
        btn_bb.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_bb.setText("BB");
        btn_bb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionBtnClicked(evt);
            }
        });

        eStack.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        eStack.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eStack.setToolTipText("Your effective stack size");
        eStack.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eStack, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btn_utg, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_utg1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_utg2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_mp, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_hj, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_co, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_bu, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_sb, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_bb, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eStack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_utg, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_utg1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_utg2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mp, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hj, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_co, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_bu, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sb, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_bb, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void positionBtnClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionBtnClicked
        positions.forEach((btn) -> {
            if (!evt.getActionCommand().equals(btn.getActionCommand())) {
                btn.setSelected(false);
            }
        });
    }//GEN-LAST:event_positionBtnClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_22;
    private javax.swing.JButton btn_32o;
    private javax.swing.JButton btn_32s;
    private javax.swing.JButton btn_33;
    private javax.swing.JButton btn_42o;
    private javax.swing.JButton btn_42s;
    private javax.swing.JButton btn_43o;
    private javax.swing.JButton btn_43s;
    private javax.swing.JButton btn_44;
    private javax.swing.JButton btn_52o;
    private javax.swing.JButton btn_52s;
    private javax.swing.JButton btn_53o;
    private javax.swing.JButton btn_53s;
    private javax.swing.JButton btn_54o;
    private javax.swing.JButton btn_54s;
    private javax.swing.JButton btn_55;
    private javax.swing.JButton btn_62o;
    private javax.swing.JButton btn_62s;
    private javax.swing.JButton btn_63o;
    private javax.swing.JButton btn_63s;
    private javax.swing.JButton btn_64o;
    private javax.swing.JButton btn_64s;
    private javax.swing.JButton btn_65o;
    private javax.swing.JButton btn_65s;
    private javax.swing.JButton btn_66;
    private javax.swing.JButton btn_72o;
    private javax.swing.JButton btn_72s;
    private javax.swing.JButton btn_73o;
    private javax.swing.JButton btn_73s;
    private javax.swing.JButton btn_74o;
    private javax.swing.JButton btn_74s;
    private javax.swing.JButton btn_75o;
    private javax.swing.JButton btn_75s;
    private javax.swing.JButton btn_76o;
    private javax.swing.JButton btn_76s;
    private javax.swing.JButton btn_77;
    private javax.swing.JButton btn_82o;
    private javax.swing.JButton btn_82s;
    private javax.swing.JButton btn_83o;
    private javax.swing.JButton btn_83s;
    private javax.swing.JButton btn_84o;
    private javax.swing.JButton btn_84s;
    private javax.swing.JButton btn_85o;
    private javax.swing.JButton btn_85s;
    private javax.swing.JButton btn_86o;
    private javax.swing.JButton btn_86s;
    private javax.swing.JButton btn_87o;
    private javax.swing.JButton btn_87s;
    private javax.swing.JButton btn_88;
    private javax.swing.JButton btn_92o;
    private javax.swing.JButton btn_92s;
    private javax.swing.JButton btn_93o;
    private javax.swing.JButton btn_93s;
    private javax.swing.JButton btn_94o;
    private javax.swing.JButton btn_94s;
    private javax.swing.JButton btn_95o;
    private javax.swing.JButton btn_95s;
    private javax.swing.JButton btn_96o;
    private javax.swing.JButton btn_96s;
    private javax.swing.JButton btn_97o;
    private javax.swing.JButton btn_97s;
    private javax.swing.JButton btn_98o;
    private javax.swing.JButton btn_98s;
    private javax.swing.JButton btn_99;
    private javax.swing.JButton btn_A2o;
    private javax.swing.JButton btn_A2s;
    private javax.swing.JButton btn_A3o;
    private javax.swing.JButton btn_A3s;
    private javax.swing.JButton btn_A4o;
    private javax.swing.JButton btn_A4s;
    private javax.swing.JButton btn_A5o;
    private javax.swing.JButton btn_A5s;
    private javax.swing.JButton btn_A6o;
    private javax.swing.JButton btn_A6s;
    private javax.swing.JButton btn_A7o;
    private javax.swing.JButton btn_A7s;
    private javax.swing.JButton btn_A8o;
    private javax.swing.JButton btn_A8s;
    private javax.swing.JButton btn_A9o;
    private javax.swing.JButton btn_A9s;
    private javax.swing.JButton btn_AA;
    private javax.swing.JButton btn_AJo;
    private javax.swing.JButton btn_AJs;
    private javax.swing.JButton btn_AKo;
    private javax.swing.JButton btn_AKs;
    private javax.swing.JButton btn_AQo;
    private javax.swing.JButton btn_AQs;
    private javax.swing.JButton btn_ATo;
    private javax.swing.JButton btn_ATs;
    private javax.swing.JButton btn_J2o;
    private javax.swing.JButton btn_J2s;
    private javax.swing.JButton btn_J3o;
    private javax.swing.JButton btn_J3s;
    private javax.swing.JButton btn_J4o;
    private javax.swing.JButton btn_J4s;
    private javax.swing.JButton btn_J5o;
    private javax.swing.JButton btn_J5s;
    private javax.swing.JButton btn_J6o;
    private javax.swing.JButton btn_J6s;
    private javax.swing.JButton btn_J7o;
    private javax.swing.JButton btn_J7s;
    private javax.swing.JButton btn_J8o;
    private javax.swing.JButton btn_J8s;
    private javax.swing.JButton btn_J9o;
    private javax.swing.JButton btn_J9s;
    private javax.swing.JButton btn_JJ;
    private javax.swing.JButton btn_JTo;
    private javax.swing.JButton btn_JTs;
    private javax.swing.JButton btn_K2o;
    private javax.swing.JButton btn_K2s;
    private javax.swing.JButton btn_K3o;
    private javax.swing.JButton btn_K3s;
    private javax.swing.JButton btn_K4o;
    private javax.swing.JButton btn_K4s;
    private javax.swing.JButton btn_K5o;
    private javax.swing.JButton btn_K5s;
    private javax.swing.JButton btn_K6o;
    private javax.swing.JButton btn_K6s;
    private javax.swing.JButton btn_K7o;
    private javax.swing.JButton btn_K7s;
    private javax.swing.JButton btn_K8o;
    private javax.swing.JButton btn_K8s;
    private javax.swing.JButton btn_K9o;
    private javax.swing.JButton btn_K9s;
    private javax.swing.JButton btn_KJo;
    private javax.swing.JButton btn_KJs;
    private javax.swing.JButton btn_KK;
    private javax.swing.JButton btn_KQo;
    private javax.swing.JButton btn_KQs;
    private javax.swing.JButton btn_KTo;
    private javax.swing.JButton btn_KTs;
    private javax.swing.JButton btn_Q2o;
    private javax.swing.JButton btn_Q2s;
    private javax.swing.JButton btn_Q3o;
    private javax.swing.JButton btn_Q3s;
    private javax.swing.JButton btn_Q4o;
    private javax.swing.JButton btn_Q4s;
    private javax.swing.JButton btn_Q5o;
    private javax.swing.JButton btn_Q5s;
    private javax.swing.JButton btn_Q6o;
    private javax.swing.JButton btn_Q6s;
    private javax.swing.JButton btn_Q7o;
    private javax.swing.JButton btn_Q7s;
    private javax.swing.JButton btn_Q8o;
    private javax.swing.JButton btn_Q8s;
    private javax.swing.JButton btn_Q9o;
    private javax.swing.JButton btn_Q9s;
    private javax.swing.JButton btn_QJo;
    private javax.swing.JButton btn_QJs;
    private javax.swing.JButton btn_QQ;
    private javax.swing.JButton btn_QTo;
    private javax.swing.JButton btn_QTs;
    private javax.swing.JButton btn_T2o;
    private javax.swing.JButton btn_T2s;
    private javax.swing.JButton btn_T3o;
    private javax.swing.JButton btn_T3s;
    private javax.swing.JButton btn_T4o;
    private javax.swing.JButton btn_T4s;
    private javax.swing.JButton btn_T5o;
    private javax.swing.JButton btn_T5s;
    private javax.swing.JButton btn_T6o;
    private javax.swing.JButton btn_T6s;
    private javax.swing.JButton btn_T7o;
    private javax.swing.JButton btn_T7s;
    private javax.swing.JButton btn_T8o;
    private javax.swing.JButton btn_T8s;
    private javax.swing.JButton btn_T9o;
    private javax.swing.JButton btn_T9s;
    private javax.swing.JButton btn_TT;
    private javax.swing.JToggleButton btn_bb;
    private javax.swing.JToggleButton btn_bu;
    private javax.swing.JToggleButton btn_co;
    private javax.swing.JToggleButton btn_hj;
    private javax.swing.JToggleButton btn_mp;
    private javax.swing.JToggleButton btn_sb;
    private javax.swing.JToggleButton btn_utg;
    private javax.swing.JToggleButton btn_utg1;
    private javax.swing.JToggleButton btn_utg2;
    private javax.swing.JTextField eStack;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
