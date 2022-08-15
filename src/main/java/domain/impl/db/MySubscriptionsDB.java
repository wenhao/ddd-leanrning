package domain.impl.db;

import domain.Subscription;
import domain.models.MySubscriptions;
import domain.models.User;

import java.util.Iterator;
import java.util.List;

public class MySubscriptionsDB implements MySubscriptions {

    private User user;

    public MySubscriptionsDB(User user) {
        this.user = user;
    }

    @Override
    public List<Subscription> subList(int from, int to) {
        return null;
    }

    @Override
    public double getTotalSubscriptionFee() {
        return 0;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Iterable<Subscription> sort() {
        return null;
    }

    @Override
    public Iterator<Subscription> iterator() {
        return null;
    }
}
