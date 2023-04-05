package view;

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

    private JButton newPlace;

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
        newPlace = new JButton("Добавить новое место");
        delitePlace = new JButton("Удалить");
        delitePlace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    myTableModel.delite(jtable.getSelectedRow());
                    jtable.repaint();//ArrayIndexOutOfBoundsException
                } catch ( IndexOutOfBoundsException ex){
                    JDialog jDialog = new JDialog(MainWindow.this, "Warning!!!", true);
                    jDialog.setLocationRelativeTo(null);
                    JLabel jLabel = new JLabel("Select place, please!");
                    jDialog.add(jLabel);
                    jDialog.pack();
                    jDialog.setVisible(true);
                }

            }
        });
        newPlace.addActionListener(new ActionListener() {
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
        add(jTextField);
        add(jComboBox);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2, 1));
        jPanel.add(jComboBox);
        jPanel.add(jTextField);
        add(jPanel, BorderLayout.WEST);
        add(jtable, BorderLayout.CENTER);
        add(newPlace, BorderLayout.NORTH);
        add(delitePlace, BorderLayout.SOUTH);



        this.pack();
        this.setLocationRelativeTo(null);

        setVisible(true);

    }


}
