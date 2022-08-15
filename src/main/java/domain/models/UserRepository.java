package domain.models;

import java.util.List;

public interface UserRepository {

    User findById(long id);

    List<User> findBy();
}
