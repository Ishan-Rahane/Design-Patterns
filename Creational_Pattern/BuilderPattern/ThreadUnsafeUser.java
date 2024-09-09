package Creational_Pattern.BuilderPattern;

public class ThreadUnsafeUser {

    private String userId;
    private String userName;
    private String emailId;

    public ThreadUnsafeUser setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public ThreadUnsafeUser setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public ThreadUnsafeUser setEmailId(String emailId) {
        this.emailId = emailId;
        return this;
    }

    @Override
    public String toString() {
        return "ThreadUnsafeUser{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

}
