package com.mitrais.bootcamp.rms.data.entity;

import com.mitrais.bootcamp.rms.data.constanta.Gender;
import com.mitrais.bootcamp.rms.data.constanta.Relation;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="family_members")
public class FamilyMember {
    @Id
    @Column(name = "fam_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long famId;
    @Column(name = "name")
    private String name;
    @Column(name = "gender")
    private Gender gender;
    @Column(name = "dob")
    private Date dob;
    @Column(name = "relation")
    private Relation relation;
    @Column(name = "is_active")
    private boolean isActive;

    public FamilyMember() {

    }

    public long getFamId() {
        return famId;
    }

    public void setFamId(long famId) {
        this.famId = famId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Relation getRelation() {
        return relation;
    }

    public void setRelation(Relation relation) {
        this.relation = relation;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

}