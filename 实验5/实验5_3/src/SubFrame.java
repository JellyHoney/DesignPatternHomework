import javax.swing.*;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

//子窗口：单例类
class SubFrame extends JInternalFrame {
    private static SubFrame frame;//静态实例

    //私有构造函数
    private SubFrame() {
        super("子窗体", true, true, true, false);
        this.setLocation(20, 20); //设置内部窗体位置
        this.setSize(200, 200); //设置内部窗体大小
        this.addInternalFrameListener(new MyIFListener());
//监听窗体事件
        this.setVisible(true);
    }

    //工厂方法，返回窗体实例
    public static SubFrame getFrame() {
        if (frame == null) //如果窗体对象为空
        {
            frame = new SubFrame();
        }//创建该窗体
        return frame;//返回窗体
    }

    //事件监听器
    class MyIFListener extends InternalFrameAdapter { //子窗体关闭时，将窗体对象设为null
        public void internalFrameClosing(InternalFrameEvent e) {
            if (frame != null) {
                frame = null;
            }
        }
    }
}