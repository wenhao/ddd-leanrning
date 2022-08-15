package domain.models;

import domain.Subscription;

import java.util.List;

public interface MySubscriptions extends Iterable<Subscription> {
    // 分页
    List<Subscription> subList(int from, int to);

    // 获取总花费
    double getTotalSubscriptionFee();

    // 获取总订阅数
    int count();

    //  排序
    Iterable<Subscription> sort();
}
