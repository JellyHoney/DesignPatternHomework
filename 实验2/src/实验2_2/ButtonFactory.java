package 实验2_2;

public class ButtonFactory {
    public static AbstractButton CreateButton(String type){
        if(type.equalsIgnoreCase("circlebutton")){
            return new CircleButton();
        }
        else if(type.equalsIgnoreCase("rectanglebutton")){
            return new RectangleButton();
        }
        return null;
    }
}
