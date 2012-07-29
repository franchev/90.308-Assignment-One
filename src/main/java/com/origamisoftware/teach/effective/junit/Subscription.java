package com.origamisoftware.teach.effective.junit;

import java.math.BigDecimal;

/**
 * A simple class that models a subscription
 *
 * @author Spencer A Marks
 */

public class Subscription {

    private BigDecimal rate;
    private SubscriptionPeriod subscriptionPeriod;

    public Subscription(BigDecimal rate, SubscriptionPeriod subscriptionPeriod) {
        this.rate = rate;
        this.subscriptionPeriod = subscriptionPeriod;
    }


}