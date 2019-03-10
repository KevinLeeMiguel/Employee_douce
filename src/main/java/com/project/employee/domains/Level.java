package com.project.employee.domains;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Level {
    @Id
    @GeneratedValue
    private Long id;
    private String level_name;

    @OneToMany(mappedBy = "level",fetch = FetchType.LAZY)
    private Set<Room> rooms = new HashSet<>();

    

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
     * @return String return the level_name
     */
    public String getLevel_name() {
        return level_name;
    }

    /**
     * @param level_name the level_name to set
     */
    public void setLevel_name(String level_name) {
        this.level_name = level_name;
    }

    /**
     * @return Set<Room> return the rooms
     */
    public Set<Room> getRooms() {
        return rooms;
    }

    /**
     * @param rooms the rooms to set
     */
    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }

}
