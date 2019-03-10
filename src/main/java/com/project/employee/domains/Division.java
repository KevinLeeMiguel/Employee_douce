package com.project.employee.domains;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Division {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "division")
    private Set<Position> positions = new HashSet<>();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "department_id")
    private Department department;


    

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
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return Set<Position> return the positions
     */
    public Set<Position> getPositions() {
        return positions;
    }

    /**
     * @param positions the positions to set
     */
    public void setPositions(Set<Position> positions) {
        this.positions = positions;
    }

    /**
     * @return Department return the department
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(Department department) {
        this.department = department;
    }

}
