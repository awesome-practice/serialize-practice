package com.practice.serialize.domain;

import java.io.Serializable;

/**
 * @author Luo Bao Ding
 * @since 2018/9/5
 */
public class Car implements Serializable {

    private static final long serialVersionUID = -7183265023543392686L;

    private String color;

    private String id;

    public Car(String color, String id) {
        this.color = color;
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
