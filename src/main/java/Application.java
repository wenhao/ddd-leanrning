import domain.impl.db.UserRepositoryDB;

public class Application {
    public static void main(String[] args) {
        new UserRepositoryDB().findById(1).getMySubscriptions().subList(0, 10);
    }
}
