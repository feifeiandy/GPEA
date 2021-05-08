package com.example.demo.OtherEntity;

import java.util.List;

public class HuiyiEvent {
    private int month;
    private List<HuiyiEventContent> event;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public List<HuiyiEventContent> getEvent() {
        return event;
    }

    public void setEvent(List<HuiyiEventContent> event) {
        this.event = event;
    }
}
