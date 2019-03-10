package com.project.employee.domains;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Room {
    @Id
    @GeneratedValue
    private Long id;
    private String room_no;
    @OneToMany(mappedBy = "room")
    private Set<Employee> employees = new HashSet<>();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "level_id")
    private Level level;

    

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the room_no
     */
    public String getRoom_no() {
        return room_no;
    }

    /**
     * @param room_no the room_no to set
     */
    public void setRoom_no(String room_no) {
        this.room_no = room_no;
    }

    /**
     * @return Set<Employee> return the employees
     */
    public Set<Employee> getEmployees() {
        return employees;
    }

    /**
     * @param employees the employees to set
     */
    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    /**
     * @return Level return the level
     */
    public Level getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(Level level) {
        this.level = level;
    }

}
