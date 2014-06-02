package com.origamisoftware.teach.effective.junit;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
        long differenceInDays = (endDate.getTime() - startDate.getTime()) / (1000 * 60 * 60 * 24);
        int diff = (int )differenceInDays;
        return diff;
    }

    /**
     * Returns the total months on the subscription.
     *
     * @return
     */
    public int getTotalMonths() {
        Calendar stop = new GregorianCalendar();
        Calendar start = new GregorianCalendar();
        stop.setTime(endDate);
        start.setTime(startDate);
        int stopYear = stop.get(Calendar.YEAR);
        int startYear = start.get(Calendar.YEAR);
        int stopMonth = stop.get(Calendar.MONTH);
        int startMonth = start.get(Calendar.MONTH);
        return (stopYear - startYear) * 12 + (stopMonth - startMonth);
    }

    /*  TODO add new functionality to the SubscriptionPeriod class here and write a test for it in the test class.
     *  This functionality can be as simple as you want. The goal is to give you practice writing a test and some functionality
     */

    /**
     * Returns true/false on whether subscription ends before the new year.
     * @return
     */
    public boolean endBeforeNewYear() {
        Calendar stop = new GregorianCalendar();
        Calendar today = Calendar.getInstance();
        stop.setTime(endDate);
        int stopYear = stop.get(Calendar.YEAR);
        int thisYear = today.get(Calendar.YEAR);
        if (stopYear > thisYear){
            return false;
        }
        else {
            return true;
        }
    }

    /**
     * Returns when the subscription renewal request should be sent.
     * Notices are sent 30 days before the subscription ends.
     * J Strong
     * @return
     */
    public Date getRenewalRequestDate() {
        Calendar stop = new GregorianCalendar();
        stop.setTime(endDate);
        long thirtyDaysInMS = 30 * 1000 * 60 * 60 * 24;
        long renewalNoticeDateLong = stop.getTimeInMillis() - thirtyDaysInMS;
        Date renewalNoticeDate = new Date(renewalNoticeDateLong);
        return renewalNoticeDate;
    }

    /**
     * Returns True/False on whether the start date is before the stop date.
     */
    public boolean getStartBeforeStop() {

        return startDate.before(endDate);
    }


}
