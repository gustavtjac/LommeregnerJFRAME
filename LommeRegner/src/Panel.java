import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    JButton[] buttons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JTextField textField;
    JButton addButton,subButton,mulButton,divButton;
    JButton decButtom, equButton,delButton,clrButton;
    Font myFont = new Font("Serif", Font.BOLD, 20);
    double num1=0,num2=0,result=0;
    char operator;
    Panel(){;
startCalc();
        this.setBounds(0, 0, 800, 600);
        this.setVisible(true);
        this.setBackground(Color.gray);
        this.add(textField);
    }

    public void paint(Graphics g){
        super.paint(g);
    }

public void startCalc(){
    textField = new JTextField();
    textField.setBounds(22,22,33,44);
    textField.setFont(myFont);
    textField.setForeground(Color.green);



}








}
