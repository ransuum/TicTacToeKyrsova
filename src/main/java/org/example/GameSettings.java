package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameSettings extends JFrame {
    GameSettings gameSettingsForm = this;
    public GameSettings() {
        setTitle("Settings");
        setBounds(810,450 , 440, 390);
        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        JButton jButtonSetSettings = new JButton("Start the game!");
        add(jButtonSetSettings);
        setVisible(true);


        jButtonSetSettings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainGameField gameField = MainGameField.getInstance();
                //размер поля
                gameField.linesCount = 3;
                gameField.startNewGame();
                gameSettingsForm.setVisible(false);
            }
        });
    }
}
