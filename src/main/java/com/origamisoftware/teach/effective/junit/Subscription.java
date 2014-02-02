package com.origamisoftware.teach.effective.junit;

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
    private String emailAddress;
    private Boolean isPaid;

    /**
     * Creates a new  Subscription instance.
     *
     * @param rate               the cost of the subscription as a <CODE> </CODE>BigDecimal </CODE>
     * @param subscriptionPeriod the start and stop date of the subscription
     */
    public Subscription(BigDecimal rate, SubscriptionPeriod subscriptionPeriod, String emailAddress) {
        this.rate = rate;
        this.subscriptionPeriod = subscriptionPeriod;
        this.emailAddress = emailAddress;
    }

    /**
     * Returns the email address of the subscription
     *
     * @return
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Returns the cost of the subscription
     *
     * @return
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
     * Returns true if the subscription is active at the time provided.
     *
     * @param calendar is the subscription active at this time?
     * @return
     */
    public boolean isActive(Calendar calendar) {
        Date endDate = subscriptionPeriod.getEndDate();
        Date startDate = subscriptionPeriod.getStartDate();

        Date time = calendar.getTime();
        boolean notBefore = time.before(startDate);
        boolean notAfter = time.after(endDate);

        return (notAfter == false && notBefore == false);

    }
    
    //added by Andrew Conniff
    public boolean isPaidFor(BigDecimal rate2)
    {
    	// add math to determine if subscription is paid for or not.
    	BigDecimal subPrice = rate2;
    	BigDecimal curBalance = rate2;
    	 if (subPrice.intValue() - curBalance.intValue() <= 0){
    		 isPaid = true;
    	 }
    	 else{
    		 isPaid = false;
    	 }
    	 return isPaid;
    }

}