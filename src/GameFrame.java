import javax.swing.JFrame;

public class GameFrame extends JFrame {

    GameFrame(){

        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); // ако добавя компоненти към JFrame, този метод ще вземе JFrame и ще попълни плътно всички компоненти
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
