package entities;

import java.util.Date;

public class Client {
    public String name;
    public String email;
    public Date brithdate;

    public Client() {
    }

    public Client(String name, String email, Date brithdate) {
        this.name = name;
        this.email = email;
        this.brithdate = brithdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return brithdate;
    }

    public void setDate(Date date) {
        this.brithdate = brithdate;
    }
}
