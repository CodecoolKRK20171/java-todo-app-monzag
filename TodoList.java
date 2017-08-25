import java.util.ArrayList;

/**
 * Class representing a todo list.
 * TodoList object should aggregate TodoItem objects.
 */
public class TodoList{

    private ArrayList<TodoItem> listOfItems;

    public TodoList() {
        listOfItems = new ArrayList<>();
        this.listOfItems = listOfItems;
    }

    public void addItem(TodoItem item) {
        listOfItems.add(item);
    }

    public void markItem(Integer index) {
        TodoItem item = listOfItems.get(index);
         item.setIsDone();
     }

    public void archive() {
        for (TodoItem item : listOfItems) {
            if (item.getIsDone() == true) {
                listOfItems.remove(item);
            }
        }
    }


}
