package Gui;

import Models.FileOperation;
import Models.ListZakazniku;
import Models.TableModel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private ListZakazniku listZakazniku;
    private TableModel tableModel;
    private FileOperation fileOperation;
   public MainFrame(int width, int leigth, FileOperation fileOperation){
       super("Tabulka");
       this.fileOperation=fileOperation;
       setSize(width,leigth);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       initGUI();
   }
  private void initGUI(){
     JPanel panel =new JPanel(new BorderLayout());
     panel.add(initTabulka(),BorderLayout.CENTER);
  }
  private JPanel initTabulka(){
       JPanel tabulka=new JPanel();
       tableModel=new TableModel(listZakazniku);
       listZakazniku.addA
       JTable table=new JTable();
      return tabulka;
  }

}
