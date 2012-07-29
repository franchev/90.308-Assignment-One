package com.origamisoftware.teach.effective.junit;

import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static junit.framework.Assert.assertEquals;

/**
 * @author Spencer A Marks
 */
public class SubscriptionPeriodTest {

    private Calendar now;
    private Calendar sixthMonthsFromNow;

    /**
     * This code is used to setup a known state or baseline
     * It is executed before every test
     */
    @Before
    public void setup() {
        // create a known state (also known as a baseline)
        now = Calendar.getInstance();
        sixthMonthsFromNow = Calendar.getInstance();
        sixthMonthsFromNow.add(Calendar.MONTH, 6);
    }

    @Test
    public void testConstruction() {

        // The basic anatomy of a test is this:

        // create a known state - this is done for us already in the setup method

        // change the state, in this case create a new object
        SubscriptionPeriod subscriptionPeriod = new SubscriptionPeriod(now.getTime(), sixthMonthsFromNow.getTime());

        // verify (assert) the change did what we expect
        assertEquals("start date", now.getTime(), subscriptionPeriod.getStartDate());
        assertEquals("end date", sixthMonthsFromNow.getTime(), subscriptionPeriod.getEndDate());
    }


    /**
     * Currently, this test fails, it is your job to make it pass.
     */
    @Test
    public void testTotalDays() {
        SubscriptionPeriod subscriptionPeriod = new SubscriptionPeriod(now.getTime(), sixthMonthsFromNow.getTime());
        int daysRemaining = subscriptionPeriod.getTotalDays();
        long diffInDays = (sixthMonthsFromNow.getTime().getTime() - now.getTime().getTime()) / (1000 * 60 * 60 * 24);
        assertEquals(daysRemaining, diffInDays);
     }


    /**
     * Currently, this test fails, it is your job to make it pass.
     */
    @Test
    public void testTotalDuration() {
        SubscriptionPeriod subscriptionPeriod = new SubscriptionPeriod(now.getTime(), sixthMonthsFromNow.getTime());
        int daysRemaining = subscriptionPeriod.getDaysRemaining(Calendar.getInstance().getTime());
        long diffInDays = (sixthMonthsFromNow.getTime().getTime() - now.getTime().getTime()) / (1000 * 60 * 60 * 24);
        assertEquals(daysRemaining, diffInDays);
    }





}
