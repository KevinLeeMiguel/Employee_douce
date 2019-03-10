package com.project.employee.domains;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    private String first_name;
    private String last_name;
    private String nationalID;
    private LocalDate start_date;
    private LocalDate birth_date;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "employee")
    private Position position;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Room room;

    

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
     * @return String return the first_name
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     * @param first_name the first_name to set
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    /**
     * @return String return the last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * @param last_name the last_name to set
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * @return String return the nationalID
     */
    public String getNationalID() {
        return nationalID;
    }

    /**
     * @param nationalID the nationalID to set
     */
    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    /**
     * @return LocalDate return the start_date
     */
    public LocalDate getStart_date() {
        return start_date;
    }

    /**
     * @param start_date the start_date to set
     */
    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    /**
     * @return LocalDate return the birth_date
     */
    public LocalDate getBirth_date() {
        return birth_date;
    }

    /**
     * @param birth_date the birth_date to set
     */
    public void setBirth_date(LocalDate birth_date) {
        this.birth_date = birth_date;
    }

    /**
     * @return Position return the position
     */
    public Position getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Position position) {
        this.position = position;
    }

    /**
     * @return Room return the room
     */
    public Room getRoom() {
        return room;
    }

    /**
     * @param room the room to set
     */
    public void setRoom(Room room) {
        this.room = room;
    }

}
