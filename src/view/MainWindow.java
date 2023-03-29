package view;

import Places.City;
import Places.Utilits.Place;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainWindow extends JFrame{
    private final JTable jtable;
    private Place place;

    private JComboBox<String> jComboBox;

    private MyTableModel myTableModel;

    private JButton newCity;

    private JTextField jTextField;




    private JButton delitePlace;
    public MainWindow(){
        super("Place");
        myTableModel = new MyTableModel(new Place() {
            @Override
            public void whatIAm() {

            }
        });
        String places[] = {"City", "Region", "Capital"};
        jComboBox = new JComboBox<>(places);
        setLayout(new BorderLayout());
        jtable = new JTable();
        jtable.setModel(myTableModel);
        jTextField = new JTextField("Place name");
        place = new Place() {
            @Override
            public void whatIAm() {

            }
        };
        newCity = new JButton("Добавить новый город");
        delitePlace = new JButton("Удалить");
        delitePlace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    myTableModel.delite(jtable.getSelectedRow());
                } catch (ArrayIndexOutOfBoundsException ex){
                    JDialog jDialog = new JDialog(MainWindow.this, "Select place", true);
                    jDialog.setVisible(true);
                }
                jtable.repaint();
            }
        });
        newCity.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jComboBox.getSelectedItem().toString() == "City"){
                    place.create(jTextField.getText(), "City");
                } else if (jComboBox.getSelectedItem().toString() == "Capital") {
                    place.create(jTextField.getText(), "Capital");
                }else{
                    place.create(jTextField.getText(), "Region");
                }
                jtable.repaint();
            }
        });
        add(jtable, BorderLayout.CENTER);
        add(newCity, BorderLayout.NORTH);
        add(delitePlace, BorderLayout.SOUTH);
        add(jComboBox, BorderLayout.WEST);
        add(jTextField, BorderLayout.EAST);


        this.pack();
        this.setLocationRelativeTo(null);

        setVisible(true);

    }


}
