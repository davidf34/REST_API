package com.api.crud.Model;

import javax.persistence.*;

@Entity
@Table(schema =  "TasksCrud")
public class Task {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY) //Esta etiqueta significa que el id es unico y se autoincrementa
    private int id;
    @Column
    private String name;
    @Column
    private int age;
    @Column
    private String position;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
