package Models;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel {
    private ListZakazniku listZakazniku;
    public TableModel(ListZakazniku listZakazniku){this.listZakazniku=listZakazniku;}

    @Override public int getRowCount(){return listZakazniku.getItems().size();}

    @Override public int getColumnCount(){return 5;}

    @Override
    public Object getValueAt(int rowIndex,int columnIndex){
        if(columnIndex==0) return listZakazniku.getItems().get(rowIndex).getName();
       /* else if (columnIndex==1)return listZakazniku.getItems().get(rowIndex).getSurname();
        else if(columnIndex==2)return listZakazniku.getItems().get(rowIndex).getSize();*/
        String s=rowIndex+":"+columnIndex;
        return s;
    }

}
