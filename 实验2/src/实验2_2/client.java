package 实验2_2;

public class client {

    public static void main(String[] args) {
        LoginForm lForm=new LoginForm();
        lForm.setType(XMLUtilButton.getButtonType());
        lForm.display();
    }

}
