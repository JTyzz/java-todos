package com.jasontyzzer.javatodos.models;

import javax.persistence.*;

@Entity
@Table(name="todo")
public class Todo
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int todoid;

    @Column(nullable = false)
    private String description;

    private String datestarted;

    private int completed;

    @ManyToOne
    @JoinColumn(name = "userid", nullable = false)
    private Users userid;


    public Todo()
    {
    }


    public int getTodoid()
    {
        return todoid;
    }

    public void setTodoid(int todoid)
    {
        this.todoid = todoid;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDatestarted()
    {
        return datestarted;
    }

    public void setDatestarted(String datestarted)
    {
        this.datestarted = datestarted;
    }

    public int getCompleted()
    {
        return completed;
    }

    public void setCompleted(int completed)
    {
        this.completed = completed;
    }

    public Users getUserid() {
        return userid;
    }

    public void setUserid(Users userid) {
        this.userid = userid;
    }
}