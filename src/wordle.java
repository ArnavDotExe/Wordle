import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class wordle extends JFrame {

    JPanel p1, main;
    JButton ch , cl;
    JLabel chn ;
    int chances = 5;
    Font f1 = new Font ("Tahoma",Font.BOLD,22);

    ArrayList<JTextField> tf  = new ArrayList<>();
    wordle()
    {
        setSize(500,500);

        main = new JPanel();
        setContentPane(main);
        main.setBackground(Color.black);


        p1 = new JPanel();
        p1.setBounds(100,80,300,60);
        // p1.setBackground(Color.BLACK);
        p1.setLayout(new BoxLayout(p1 , BoxLayout.X_AXIS));
        add(p1);

        generateTextfields();

        chn = new JLabel("Chances Remaining : "+chances);
        chn.setBounds(130,250,300,50);
        chn.setFont(new Font ("Tahoma",Font.BOLD,18));
        chn.setForeground(Color.white);
        add(chn);

        ch = new JButton("Check");
        ch.setBounds(80,350,150,50);
        ch.setBackground(Color.white);
        ch.setFont(f1);
        add(ch);


        cl = new JButton("Clear");
        cl.setBounds(300,350,150,50);
        cl.setBackground(Color.white);
        cl.setFont(f1);
        add(cl);



        setTitle("WOrdle Gaming");
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }
    void generateTextfields(){
        for(int i = 0 ; i<5 ;i++)
        {

            tf.add(new JTextField());
            tf.get(i).setFont(new Font ("Tahoma",Font.BOLD,32));
            tf.get(i).setBackground(Color.black);
            tf.get(i).setForeground(Color.WHITE);
            tf.get(i).setHorizontalAlignment(JTextField.CENTER);
        }
        for(int i=0 ; i<5 ; i++)
        {
            p1.add(tf.get(i));
        }
    }

    public static void main(String[] args) {
        new wordle();
    }
}