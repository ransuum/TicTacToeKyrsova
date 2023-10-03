package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class MainForm extends JFrame{
    public MainForm() {
        Scanner scanner = new Scanner(System.in);
        int W = input1(scanner);
        int H = input2(scanner);
        setTitle("Tic-Tac-Toe KYRSOVAYA");
        setBounds(W/2, H/2, W/3, H/3);
        setResizable(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MainGameField gameField = MainGameField.getInstance();
        // Создаём панель для кнопок
        JPanel buttonPanel = new JPanel(new GridLayout());
        add(gameField, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        JButton btnStart = new JButton("Начать новую игру");
        JButton btnEnd = new JButton("Закончить игру");
        buttonPanel.add(btnStart);
        buttonPanel.add(btnEnd);
        btnEnd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(btnStart.getText());
                GameSettings gameSettingsForm = new GameSettings();
            }
        });
        setVisible(true);
    }
    public int input1(Scanner scanner){
        System.out.println("on what Width u wanna play? ");
        while (true){
            if (scanner.hasNextInt()){
                return scanner.nextInt();
            } else {
                System.out.println("Wrong data");
                scanner.nextLine();
            }
        }
    }
    public int input2(Scanner scanner){
        System.out.println("on what Height u wanna play? ");
        while (true){
            if (scanner.hasNextInt()){
                return scanner.nextInt();
            } else {
                System.out.println("Wrong data");
                scanner.nextLine();
            }
        }
    }
}
