import javax.swing.*;

public class Frame extends JFrame {

    Frame(){
        this.setTitle("Calculator");
        this.setResizable(false);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 800);
        this.add(new Panel());
        this.setLocationRelativeTo(null);



        this.setVisible(true);
    }

}
