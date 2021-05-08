package com.example.demo;

import sun.applet.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.CheckedOutputStream;

public class MyTest {
    public static void main(String[] args) {
        List<Man> man = new ArrayList<>();
        Man man1 = new Man();
        man1.setId(1);
        man1.setName("zhangsan");
        Man man2= new Man();
        man2.setId(2);
        man2.setName("lisi");
        man.add(man1);
        man.add(man2);

        man.forEach(c->{
            if (c.getId()==2)
            {
                System.out.println(c.getName());
            }
        });
    }
}


class Man
{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
