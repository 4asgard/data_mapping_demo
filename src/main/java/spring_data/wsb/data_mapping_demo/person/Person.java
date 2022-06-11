package spring_data.wsb.data_mapping_demo.person;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Person {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String username;

    private String password;

    private Boolean enabled;

    private Date dateCreated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Person() {
    }

    public Person(String username, String password, Boolean enabled) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.dateCreated = new Date();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
}