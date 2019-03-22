package 实验3_2;

public class Client {
    public static void main(String[] args){
        User user=UserFactory.CreateUser(1);
        user.ModifyUserInformation();
        user.LeavePermissionSetting();
    }
}
