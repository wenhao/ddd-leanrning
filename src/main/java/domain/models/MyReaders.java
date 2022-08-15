package domain.models;

import domain.Subscription;

import java.util.List;

public interface MyReaders extends Iterable<Subscription> {
    List<Subscription> getSubscription(int from, int to);
}
