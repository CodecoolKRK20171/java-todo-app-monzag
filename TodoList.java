import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class representing a todo list.
 * TodoList object should aggregate TodoItem objects.
 */
public class TodoList{

    private ArrayList<TodoItem> listOfItems;

    public TodoList() {
        this.listOfItems = new ArrayList<TodoItem>();
    }

    public void addItem(TodoItem item) {
        listOfItems.add(item);
    }

    public void markItem(Integer index) {
        TodoItem item = listOfItems.get(index);
        item.setIsDone();
        System.out.println(item.getIsDone());
     }

    public void archive() {
        for (Iterator<TodoItem> iter = listOfItems.iterator(); iter.hasNext(); ) {
            TodoItem item = iter.next();
            if (item.getIsDone() == true) {
                iter.remove();
            }
        }
    }

    public ArrayList<TodoItem> getItemList() {
        return listOfItems;
    }

}
