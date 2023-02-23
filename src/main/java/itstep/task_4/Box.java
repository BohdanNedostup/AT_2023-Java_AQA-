package itstep.task_4;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

    private List<T> items = new ArrayList<>();

    public void add(List<T> items){
        this.items.addAll(items);
    }

    public List<T> getItems() {
        return items;
    }
}
