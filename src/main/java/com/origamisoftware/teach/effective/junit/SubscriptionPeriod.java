package com.origamisoftware.teach.effective.junit;

import java.util.Date;

/**
 * A simple Date Range Class
 *
 * @author Spencer A Marks
 */
public class SubscriptionPeriod {

    private Date startDate;
    private Date endDate;


    public SubscriptionPeriod(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getDaysRemaining(Date currentDate) {
        return 0;
    }

    public int getMonthsRemaining(Date currentDate) {
        return 0;
    }

    public int getTotalDays() {
        return 0;
    }

}
