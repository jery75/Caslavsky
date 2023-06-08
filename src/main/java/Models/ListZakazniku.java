package Models;

import com.google.gson.annotations.Expose;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ListZakazniku {
    @Expose(serialize = true,deserialize = true)
    private String name;
    @Expose(serialize = true,deserialize = true)
    private List<ListZakazniku> items;

    @Expose(serialize = false,deserialize = false)
    private List<ActionListener> listeners=new ArrayList<>();

    public ListZakazniku() {
        name = "Seznam";
        items = new ArrayList<>();
    }

    public List<ListZakazniku> getItems() {
        return items;
    }
    public void setItems(List<ListZakazniku> items) {
        this.items=items;
    }
    public String getName(){ return name;}
public void setName(String name){ this.name=name;}

public void addActionListener(ActionListener add){ listeners.add(add);
    }
}

