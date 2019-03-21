package 实验2_2;

public class LoginForm {
    private AbstractButton ab;
    public void display(){
        if(ab!=null){
            ab.view();
        }
    }
    public void setType(String typeName){
        ab=ButtonFactory.CreateButton(typeName);
    }
}
