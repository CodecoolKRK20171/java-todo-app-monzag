/**
 * Class representing a single todo item.
 * 
 */
public class TodoItem{

    private String name;
    private Boolean isDone;

    public TodoItem(String name) {
        this.name = name;
        this.isDone = false;
    }

    public void setIsDone() {
        this.isDone = true;
    }

    public String displayTodoItem() {
        String unmark = "[ ] ";
        String mark = "[X] ";
        String info;

        if (isDone == true) {
            info = mark + name;
        } else {
            info = unmark + name;
        }

        return info;
    }

    // equal method??
    
    
}
