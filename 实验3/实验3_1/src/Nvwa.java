public class Nvwa {
    public static Person MakePerson(String typeName){
        if(typeName==null){
            return null;
        }
        if(typeName.equalsIgnoreCase("man")){
            return new Man();
        }
        else if(typeName.equalsIgnoreCase("woman")){
            return new Woman();
        }
        else if(typeName.equalsIgnoreCase("robot")){
            return new Robot();
        }
        return null;

    }
}
