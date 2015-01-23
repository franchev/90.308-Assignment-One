package com.origamisoftware.teach.agile.junit;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

/**
 * A simple class that models a subscription
 *
 * @author Spencer A Marks
 */

public class Subscription {

    private BigDecimal rate;
    private SubscriptionPeriod subscriptionPeriod;

    /**
     * Creates a new  Subscription instance.
     *
     * @param rate               the cost of the subscription as a <CODE> </CODE>BigDecimal </CODE>
     * @param subscriptionPeriod the start and stop date of the subscription
     */
    public Subscription(BigDecimal rate, SubscriptionPeriod subscriptionPeriod) {
        this.rate = rate;
        this.subscriptionPeriod = subscriptionPeriod;
    }

    /**
     * @return the cost of the subscription
     */
    public BigDecimal getRate() {
        return rate;
    }


    /**
     * Returns the period the subscription is valid for.
     */
    public SubscriptionPeriod getSubscriptionPeriod() {
        return subscriptionPeriod;
    }

    /**
     * @param calendar is the subscription active at this time?
     * @return true if the subscription is active at the time provided.
     */
    public boolean isActive(Calendar calendar) {
        Date endDate = subscriptionPeriod.getEndDate();
        Date startDate = subscriptionPeriod.getStartDate();

        Date time = calendar.getTime();
        boolean notBefore = time.before(startDate);
        boolean notAfter = time.after(endDate);

        return (notAfter == false && notBefore == false);

    }

}