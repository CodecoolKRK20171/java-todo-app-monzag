import java.util.Scanner;

/**
 * Class representing the TodoApp application.
 * It is the main entry point for this program.
 */
public class App{
  public static void main(String[] args) {
    TodoList todoList = new TodoList();

    Boolean work = true;

    while (work) {
      displayOptions();
      String userChoice = getUserInput();

      if (userChoice.equals("1")) {
        addItem(todoList);

      } else if (userChoice.equals("2")) {
          showAllItems(todoList);

      } else if (userChoice.equals("3")) {
          todoList.archive();
      
      } else if (userChoice.equals("4")) {
          mark(todoList);

      } else if (userChoice.equals("0")) {
          System.out.println("Good bye");
          work = false;

      } else {
          System.out.println("Bad choice");
      }
    }
  }

  public static String getUserInput() {
    Scanner input = new Scanner(System.in);
    System.out.println("Your choice: ");
    String userChoice = input.nextLine();

    return userChoice;
  }

  public static void displayOptions() {
    String options = "\n1. Add new item\n2. Show all items\n3. Archive\n4. Mark item\n0. Exit\n";

    System.out.println(options);
  }

  public static void showAllItems(TodoList todoList) {
    Integer number = 1;
    System.out.println("List of tasks: ");
    for (TodoItem item : todoList.getItemList()) {
      System.out.println(number + ". " + item.displayTodoItem());
      number++;
    }
  }

  public static void addItem(TodoList todoList) {
    String name = getUserInput();
    TodoItem item = new TodoItem(name);
    todoList.addItem(item);
  }

  public static void mark(TodoList todoList) {
    showAllItems(todoList);
    Integer index = getNumber();
    todoList.markItem(index-1);
  }

  public static Integer getNumber() {
    Scanner input = new Scanner(System.in);
    System.out.println("Number of taks: ");
    Integer userChoice = input.nextInt();

    return userChoice;
  }

}
