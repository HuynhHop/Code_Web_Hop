package murach.business;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String date;
    private String know;
    private String wantsUpdates;
    private String notice;
    
    public User() {
        firstName = "";
        lastName = "";
        email = "";
        date ="";
        know="";
        wantsUpdates="";
        notice="";
    }
    
    public User(String firstName, String lastName, String email,String date, String know,String wantsUpdates, String notice) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.date=date;
        this.know=know;
        this.wantsUpdates=wantsUpdates;
        this.notice=notice;
    }
     public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    
        public String getWantsUpdates() {
        return wantsUpdates;
    }

    public void setWantsUpdates(String wantsUpdates) {
        this.wantsUpdates = wantsUpdates;
    }
    
     public String getKnow() {
        return know;
    }

    public void setKnow(String know) {
        this.know = know;
    }
    
     public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }
public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}