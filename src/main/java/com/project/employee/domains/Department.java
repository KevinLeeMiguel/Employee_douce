package com.project.employee.domains;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Department {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;

    @OneToMany(mappedBy = "division",fetch = FetchType.LAZY)
    private Set<Division> divisions = new HashSet<>();

    

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
     * @return Set<Division> return the divisions
     */
    public Set<Division> getDivisions() {
        return divisions;
    }

    /**
     * @param divisions the divisions to set
     */
    public void setDivisions(Set<Division> divisions) {
        this.divisions = divisions;
    }

}
