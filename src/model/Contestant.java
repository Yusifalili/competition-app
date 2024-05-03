package model;

import java.io.Serializable;

public class Contestant implements Serializable {

    private String name;
    private String surname;
    private String username;
    private long id;

    public Contestant(String name, String surname, String username, long id){
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }

    public String toString(){
        return "USERNAME: " + username + " | " + "ID: " +  id;
    }

}
