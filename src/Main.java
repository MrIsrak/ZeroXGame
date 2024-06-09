import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        System.out.println("Start");
        Start start = Start.startGame(window);
        System.out.println("Finish");
    }
}