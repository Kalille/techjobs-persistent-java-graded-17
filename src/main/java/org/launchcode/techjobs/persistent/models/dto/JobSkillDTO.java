package org.launchcode.techjobs.persistent.models.dto;

import jakarta.validation.constraints.NotNull;
import org.launchcode.techjobs.persistent.models.Job;
import org.launchcode.techjobs.persistent.models.Skill;

import java.util.List;

public class JobSkillDTO {

    @NotNull
    private Job job;

    @NotNull
    private List<Skill> skill;


    public JobSkillDTO() {
    }

    public Job getJob() {
        return job;
    }

    public void addSkill(Skill skill){
        this.skill.add(skill);
    }
    public void setJob(Job job) {
        this.job = job;
    }

    public List<Skill> getSkill() {
        return skill;
    }

    public void setSkill(List<Skill> skill) {
        this.skill = skill;
    }
}
