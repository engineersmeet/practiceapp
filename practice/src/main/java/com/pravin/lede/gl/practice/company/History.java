package com.pravin.lede.gl.practice.company;

public class History {
    String organisation;
    double experience;
    String projects;
    boolean isPreviouslyWorked;

    public History(String organisation, double experience, String projects, boolean isPreviouslyWorked) {
        this.organisation = organisation;
        this.experience = experience;
        this.projects = projects;
        this.isPreviouslyWorked = isPreviouslyWorked;
    }

    public String getOrganisation() {
        return organisation;
    }

    public double getExperience() {
        return experience;
    }

    public String getProjects() {
        return projects;
    }

    public boolean isPreviouslyWorked() {
        return isPreviouslyWorked;
    }
}
