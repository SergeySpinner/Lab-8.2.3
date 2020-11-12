package com.jetbrains;

import javax.swing.*;
import java.util.Date;
import java.lang.Math;

public class App extends JFrame{
    private JPanel mainPanel;
    private JFormattedTextField TextField1;
    private JLabel labelNumber;
    private JLabel labelDate;

    static public String Calculate(StringBuilder counter, int number) {
        if(number - 32 >= 0)
        {
            number -= 32;
            counter.setCharAt(0, '1');
            return Calculate(counter,number);

        }
        else if(number - 16 >= 0)
        {
            number -= 16;
            counter.setCharAt(1, '1');
            return Calculate(counter,number);
        }
        else if(number - 8 >= 0)
        {
            number -= 8;
            counter.setCharAt(2, '1');
            return Calculate(counter,number);
        }
        else if(number - 4 >= 0)
        {
            number -= 4;
            counter.setCharAt(3, '1');
            return Calculate(counter,number);
        }
        else if(number - 2 >= 0)
        {
            number -= 2;
            counter.setCharAt(4, '1');
            return Calculate(counter,number);
        }
        else if(number - 1 >= 0)
        {
            number -= 1;
            counter.setCharAt(5, '1');
            return Calculate(counter,number);
        }
        return counter.toString();
    }

    App()
    {
        StringBuilder temp_string = new StringBuilder("000000");
        int randNumber = (int) (Math.random() * 128);
        TextField1.setText("In binary system: " + Calculate(temp_string, randNumber));
        setTitle("Lab#8.2.3");
        setVisible(true);
        setSize(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        add(mainPanel);
        labelNumber.setText("Number is: " + randNumber);
        Date ls = new Date();
        labelDate.setText(ls.toString());
    }
}
