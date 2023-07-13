package br.edu.unifei.ecot12.bear;

import java.util.Calendar;
import java.util.Date;

public class Hibernate implements BearState {
    private Date endDate;

    public Hibernate() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 6);
        Date futureDate = calendar.getTime();
        setEndDate(futureDate);
    }

    @Override
    public void invert(Bear b) {
        b.setState(new Awake());
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Hibernate [endDate=" + endDate + "]";
    }
}
