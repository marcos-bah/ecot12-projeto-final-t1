package br.edu.unifei.ecot12.bear;

import java.util.Date;

public class Awake implements BearState {
    private Date startDate;

    public Awake() {
        setStartDate(new Date());
    }

    @Override
    public void invert(Bear b) {
        b.setState(new Hibernate());
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Awake [startDate=" + startDate + "]";
    }
}
