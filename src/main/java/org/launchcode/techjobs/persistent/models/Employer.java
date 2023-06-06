package org.launchcode.techjobs.persistent.models;

import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
//    changed
    @OneToMany
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

    @Size(min = 3, max = 100)
    @NotNull(message = "Location is required")
    private String location;

    public Employer(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public Employer(){

    }
}