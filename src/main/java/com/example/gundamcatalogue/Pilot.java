package com.example.gundamcatalogue;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name="PILOT")
public class Pilot {

    public Pilot() {
    }

    public Pilot(long id, String fname, String lname, String rank, String image, String universe, String conflicts, int skillLvl, List<MobileSuit> msList) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.rank = rank;
        this.image = image;
        this.universe = universe;
        this.conflicts = conflicts;
        this.skillLvl = skillLvl;
        this.msList = msList;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Pilot){
            return id == ((Pilot)o).id;
        }
        else return false;
    }

    @Override
    public int hashCode() {
        return (int)id ;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id = -1;
    private String fname;
    private String lname;
    private String rank;
    private String image;
    private String universe;
    private String conflicts;
    private int skillLvl;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "MS_ID")
    private List<MobileSuit> msList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public String getConflicts() {
        return conflicts;
    }

    public void setConflicts(String conflicts) {
        this.conflicts = conflicts;
    }

    public int getSkillLvl() {
        return skillLvl;
    }

    public void setSkillLvl(int skillLvl) {
        this.skillLvl = skillLvl;
    }

    public List<MobileSuit> getMsList() {
        return msList;
    }

    public void setMsList(List<MobileSuit> msList) {
        this.msList = msList;
    }
}
