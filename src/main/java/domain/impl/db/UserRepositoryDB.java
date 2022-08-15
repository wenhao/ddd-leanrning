package domain.impl.db;

import com.google.common.collect.Lists;
import domain.models.User;
import domain.models.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

public class UserRepositoryDB implements UserRepository {

    @Override
    public User findById(long id) {
        User user = new User();
        return setMySubscriptions(user);
    }

    @Override
    public List<User> findBy() {
        List<User> users = Lists.newArrayList();
        return users.stream().map(this::setMySubscriptions).collect(Collectors.toList());
    }

    private User setMySubscriptions(User user) {
        user.setMySubscriptions(new MySubscriptionsDB(user));
        return user;
    }
}
