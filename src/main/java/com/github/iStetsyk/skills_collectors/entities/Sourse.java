package com.github.iStetsyk.skills_collectors.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@ManyToMany
@JoinTable(name = "skills")
public class Sourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sourse sourse = (Sourse) o;
        return Objects.equals(id, sourse.id) &&
                Objects.equals(name, sourse.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Sourse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}