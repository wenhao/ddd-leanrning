package domain.models;

public class User {

    private String name;
    private MySubscriptions mySubscriptions;

    public MySubscriptions getMySubscriptions() {
        return mySubscriptions;
    }

    public void setMySubscriptions(MySubscriptions mySubscriptions) {
        this.mySubscriptions = mySubscriptions;
    }
}
