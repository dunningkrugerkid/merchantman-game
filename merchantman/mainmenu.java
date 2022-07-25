import javax.swing.*;
import java.awt.*;
public class mainmenu {
    private static void createmenu() {
        // setup
        JFrame mainmenu = new JFrame("Merchantman");
        mainmenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel titleText = new JLabel("Merchantman: A Naval Adventure", SwingConstants.CENTER);
        JLabel Ship = new JLabel("<pre> |    |    |            \n    )_)  )_)  )_)        \n   )___))___))___)      \n  )____)____)_____)\n_____|____|____|_____\n---------\\                   /---------\n^^^^^ ^^^^^^^^^^^^^^^^^^^^^\n^^^^      ^^^^     ^^^    ^^\n </pre>");
        Ship.setFont(new Font("Courier New", Font.PLAIN, 12));
        titleText.setPreferredSize(new Dimension(500, 300));
        mainmenu.getContentPane().add(titleText, BorderLayout.NORTH);

        JButton startButton = new JButton("Weigh anchor!");
        startButton.setEnabled(true);
        mainmenu.getContentPane().add(startButton, BorderLayout.SOUTH);
        mainmenu.getContentPane().add(Ship, SwingConstants.CENTER);


        // display
        mainmenu.setLocationRelativeTo(null);
        mainmenu.pack();
        mainmenu.setVisible(true);

    
    
    }
    public static void main (String[] args){

    createmenu();
    }


}


