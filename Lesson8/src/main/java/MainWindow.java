import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class MainWindow extends JFrame {

  public static void main(String[] args) {
    MainWindow mainWindow = new MainWindow();
  }

  public MainWindow() {
    setTitle("Простой чат");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setBounds(200, 200, 480, 640);
    setResizable(false);
    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

    // Подготовка элементов формы
    JTextArea historyText = new JTextArea(32, 1);
    historyText.setEditable(false);
    JScrollPane historyScroll = new JScrollPane(historyText);

    JTextArea sendText = new JTextArea(2,1);
    JScrollPane sendScroll = new JScrollPane(sendText);

    JButton sendButton = new JButton("Отправить");
    sendButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        historyText.append(sendText.getText());
        historyText.append("\n");
        sendText.setText("");
      }
    });

    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new BorderLayout());
    buttonPanel.add(sendButton);

    // Вывод на форму
    add(historyScroll);
    add(sendScroll);
    add(buttonPanel);
    setVisible(true);
  }
}


