package view;

import Places.Capital;
import Places.City;
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
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0: return place.getPlace(rowIndex).getName()
            //data.getPerson(rowIndex).getFio()
            ;
            case 1: {
                Place p = place.getPlace(rowIndex);
                if (p instanceof City){
                    return "Город";
                }else if(p instanceof Capital){
                    return "Столица";
                }else{
                    return "Регион";
                }


            }
        }
        return null;
    }
}
