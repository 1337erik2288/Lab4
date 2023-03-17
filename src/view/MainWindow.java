package view;

import Places.Utilits.Place;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;


public class MainWindow extends JFrame{
    private final JTable jtable;
    private Place place;
    public MainWindow(){
        super("Place");
        jtable = new JTable();
        place = new Place() {
            @Override
            public void whatIAm() {

            }
        };

        jtable.setModel(new MyTableModel(place));
        add(jtable);

        this.pack();
        this.setLocationRelativeTo(null);

        setVisible(true);

    }
}
