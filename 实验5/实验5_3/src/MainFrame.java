import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MainFrame extends JFrame {
    private JButton button;
    private JDesktopPane desktopPane;
    private SubFrame iFrame = null;

    public MainFrame() {
        super("主窗体");
        Container c = this.getContentPane(); //初始化一个容器
        c.setLayout(new BorderLayout());//设置容器C的布局管理
        button = new JButton("点击创建一个内部窗体");
//为按钮添加指定的动作侦听器，发生动作事件
        button.addActionListener(new BtListener());
        c.add(button, BorderLayout.SOUTH);
        desktopPane = new JDesktopPane(); //创建DesktopPane
        c.add(desktopPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(400, 400);
        this.setVisible(true);
    }
    class BtListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (iFrame != null) {
                desktopPane.remove(iFrame);
            }
            iFrame = SubFrame.getFrame();
            desktopPane.add(iFrame);
        }
    }
}