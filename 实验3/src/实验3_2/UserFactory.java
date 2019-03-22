package 实验3_2;

public class UserFactory {
    public static User CreateUser(int level){
        if(level==0){
            return new Employee();
        }
        else if(level==1){
            return new Manager();
        } else if (level == 2){
            return new Administrator();
        }
        return null;
    }
}
