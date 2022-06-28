import javax.swing.*;
import java.awt.event.*;

public class Game {
    public static void main(String[] args) {
        JFrame jframe = new JFrame(); //new jframe instance
        JButton button = new JButton("!"); //new jbutton instance
        final JTextField textfield = new JTextField(); // new textfield instance
        button.setBounds(90, 90, 50, 50);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                textfield.setText("Welcome!");
            }
        });
        jframe.add(button); //add button to jframe
        jframe.add(textfield); //add textfield to jframe
        jframe.setSize(500, 700);


        jframe.setLayout(null); //no layout manager
        jframe.setVisible(true); //make the frame visible

    }
}
