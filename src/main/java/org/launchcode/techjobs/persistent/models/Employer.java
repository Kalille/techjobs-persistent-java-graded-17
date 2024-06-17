package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

@NotBlank(message = "Location cannot be left blank")
@Size(min = 2, max = 150)
    private String location;

@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name="employer_id")
private List<Job> jobs = new ArrayList<>();
    public Employer() {

    }

    public List<Job> getJobs() {
        return jobs;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
