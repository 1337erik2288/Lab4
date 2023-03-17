package view;

import Places.Utilits.Place;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class MyTableModel extends AbstractTableModel {
    private Place place;
    public MyTableModel(Place place){
        this.place = place;
    }

    @Override
    public int getRowCount() {
        return place.getCount();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0: return place.getName(rowIndex).
            //data.getPerson(rowIndex).getFio()
            ;
            case 1: {
                Person p = data.getPerson(rowIndex);
                if (p instanceof Student){
                    return ((Student) p).getGroup();
                }else{
                    return ((Teacher) p).getSubject();
                }


            }
        }
        return "AAAAAAAAAAAA";
    }
}
