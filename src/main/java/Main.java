import Gui.MainFrame;
import Models.FileOperation;
import Models.Json;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
    }
    FileOperation io;
    io=new Json;
    MainFrame frame=new MainFrame(600,500,io);
}