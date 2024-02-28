
import Controller.Handler;
import view.Menu;


public class Main {
    Handler handler;
    
    public Main(){
        handler = new Handler();
    }
    public void displayMainMenu() {
        Menu<String> mainMenu = new Menu<>("Collection Sort Program", new String[]{
            "Input Students",
            "Sort Students",
            "Display",
            "Exit"
        }) {
            @Override
            public void execute(int choice) {
                switch (choice) {
                    case 1 ->
                        handler.getInfo();
                    case 2 ->
                        handler.sortStudent();
                    case 3 ->
                        handler.display();
                    case 4 ->
                        System.exit(0);
                    default ->
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        };
        mainMenu.run();
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.displayMainMenu();
    }
}
