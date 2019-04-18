package com.rabbitmq.pojo;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.io.Serializable;

/**
 * Created by user on 2019/4/18.
 */
public class User implements Serializable {

    public String id;
    public String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "User{" +
                "        id='" + id + "'" +
                "        ,name='" + name + "'" +
                "}";
    }
}
