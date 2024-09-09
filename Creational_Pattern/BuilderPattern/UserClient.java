package Creational_Pattern.BuilderPattern;

public class UserClient {
    public static void main(String[] args) {

//        User user = new User.UserBuilder()
//                .setUserId("101ABC")
//                .setUserName("Ishan")
//                .setEmailId("ishan@dev.in")
//                .build();
//
//        System.out.println(user);

        ThreadUnsafeUser threadUnsafeUser = new ThreadUnsafeUser();
        threadUnsafeUser.setEmailId("ishan@dev.in").setUserId("100").setUserName("Ishan");
        System.out.println(threadUnsafeUser);
    }
}
