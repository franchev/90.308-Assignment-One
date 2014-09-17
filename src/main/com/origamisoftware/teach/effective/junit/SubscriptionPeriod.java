package com.origamisoftware.teach.effective.junit;

import org.junit.Before;

import java.util.Date;

import static java.lang.System.out;
/**
 * A simple Date Range Class
 *
 * @author Spencer A Marks
 */
public class SubscriptionPeriod {

    private Date startDate;
    private Date endDate;

    /**
     * Creates a  SubscriptionPeriod instance
     *
     * @param startDate
     * @param endDate
     */
    public SubscriptionPeriod(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * Returns the the start date of the subscription
     *
     * @return
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Returns the the end date of the subscription
     *
     * @return
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Returns the total Days in the subscription
     *
     * @return
     */
    public int getTotalDays() {
        return 0;
    }

    /**
     * Returns the total months on the subscription.
     *
     * @return
     */
    public int getTotalMonths() {
        return 0;
    }


    /*  TODO add new functionality to the SubscriptionPeriod class here and write a test for it in the test class.
     *  This functionality can be as simple as you want. The goal is to give you practice writing a test and some functionality
     */

    //This is a test comment




}
