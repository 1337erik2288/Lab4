package view;

import javax.swing.*;

public class CreateWindow extends JFrame {
    private JComboBox<String> jComboBox;
    public CreateWindow(){
        super("Create");
        String places[] = {"City", "Region", "Capital"};
        jComboBox = new JComboBox<>(places);

    }
}
