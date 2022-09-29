    package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job()    {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }



    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString(){
        String sName = this.name;
        String sEmployer = this.employer.getValue();
        String sLocation = this.location.getValue();
        String sPositionType = this.positionType.getValue();
        String sCoreCompetency = this.coreCompetency.getValue();
        String str = "";
        if(sName.length() == 0 && sEmployer.length() == 0 && sLocation.length() == 0 && sPositionType.length() == 0 && sCoreCompetency.length() == 0) {
              str = "\n OOPS! This job does not seem to exist. \n";
              return str;
        }
        if(sName.length() == 0){
            sName = "Data not available";
           // return " \nID: " + this.id + "\nName: " + "Data not available" + "\nEmployer: " + this.employer + "\nLocation: "+ this.location +"\nPosition Type: "+ this.positionType +"\nCore Competency: " + this.coreCompetency + "\n";
        }
        if(sEmployer.length() == 0){
            sEmployer = "Data not available";
        }
        if(sLocation.length() == 0){
            sLocation = "Data not available" ;
        }
        if(sPositionType.length() == 0) {
            sPositionType = "Data not available";
        }
        if(sCoreCompetency.length()==0){
            sCoreCompetency = "Data not available";
        }
        str = "\nID: " + this.id + "\nName: " + sName + "\nEmployer: " + sEmployer + "\nLocation: "+ sLocation +"\nPosition Type: "+ sPositionType +"\nCore Competency: " + sCoreCompetency + "\n";
        return str;
        /* String sName = this.name;
        String sEmployer = this.employer.getValue();
        String sLocation = this.location.getValue();
        String sPositionType = this.positionType.getValue();
        String sCoreCompetency = this.coreCompetency.getValue();
        String str = "\n \nID: " + this.id + "\nName: " + sName + "\nEmployer: " + sEmployer + "\nLocation: "+ sLocation +"\nPosition Type: "+ sPositionType +"\nCore Competency: " + sCoreCompetency + "\n";
        if(this == null){
           //sName.length()== 0 && sEmployer.length()==0 && sLocation.length()==0 && sPositionType.length()==0 && sCoreCompetency.length()==0
            str = "OOPS! This job does not seem to exist.";
            System.out.println(str);
            return str;
        }else if(sName.length()== 0){
            sName = "Data not available";
            str = "\n \nID: " + this.id + "\nName: " + sName + "\nEmployer: " + sEmployer + "\nLocation: "+ sLocation +"\nPosition Type: "+ sPositionType +"\nCore Competency: " + sCoreCompetency + "\n";
            return str;
        }else if(sEmployer.length()==0){
            sEmployer = "Data not available";
            str = "\n \nID: " + this.id + "\nName: " + sName + "\nEmployer: " + sEmployer + "\nLocation: "+ sLocation +"\nPosition Type: "+ sPositionType +"\nCore Competency: " + sCoreCompetency + "\n";
            return str;
        }else if(sLocation.length()==0){
            sLocation = "Data not available";
            str = "\n \nID: " + this.id + "\nName: " + sName + "\nEmployer: " + sEmployer + "\nLocation: "+ sLocation +"\nPosition Type: "+ sPositionType +"\nCore Competency: " + sCoreCompetency + "\n";
            return str;
        }else if(sPositionType.length()==0){
            sPositionType = "Data not available";
            str = "\n \nID: " + this.id + "\nName: " + sName + "\nEmployer: " + sEmployer + "\nLocation: "+ sLocation +"\nPosition Type: "+ sPositionType +"\nCore Competency: " + sCoreCompetency + "\n";
            return str;
        }else if(sCoreCompetency.length()==0){
            sCoreCompetency = "Data not available";
            str = "\n \nID: " + this.id + "\nName: " + sName + "\nEmployer: " + sEmployer + "\nLocation: "+ sLocation +"\nPosition Type: "+ sPositionType +"\nCore Competency: " + sCoreCompetency + "\n";
            return str;
        }else{
            return str;
        }*/
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
