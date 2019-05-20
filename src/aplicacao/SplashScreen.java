package aplicacao;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;

public class SplashScreen extends JWindow {

        private int duration;

        public SplashScreen(int d) {
            duration = d;
        }

        public void showSplash() {
            JPanel content = (JPanel) getContentPane();
            content.setBackground(Color.white);

            // Configura a posição e o tamanho da janela
            int width = 450;
            int height = 115;
            Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
            int x = (screen.width - width) / 2;
            int y = (screen.height - height) / 2;
            setBounds(x, y, width, height);

            // Constrói o splash screen
            JLabel label = new JLabel(new ImageIcon("devmedia.gif"));
            JLabel copyrt = new JLabel
                    ("Copyright 2006, DevMedia", JLabel.CENTER);
            copyrt.setFont(new Font("Sans-Serif", Font.BOLD, 12));
            content.add(label, BorderLayout.CENTER);
            content.add(copyrt, BorderLayout.SOUTH);
            Color oraRed = new Color(156, 20, 20, 255);
            content.setBorder(BorderFactory.createLineBorder(oraRed, 10));
            // Torna visível
            setVisible(true);

            // Espera ate que os recursos estejam carregados
            try {
                Thread.sleep(duration);
            } catch (Exception e) {
                e.printStackTrace();
            }
            dispose();
        }
    }