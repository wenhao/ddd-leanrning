package domain.impl.db;

import com.google.common.collect.Lists;
import domain.Subscription;
import domain.models.MyReaders;

import java.util.Iterator;
import java.util.List;

public class MyReadersDB implements MyReaders {
    @Override
    public List<Subscription> getSubscription(int from, int to) {
        return Lists.newArrayList();
    }

    @Override
    public Iterator<Subscription> iterator() {
        return null;
    }
}
