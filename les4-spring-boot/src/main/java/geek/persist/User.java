package geek.persist;

import geek.service.UserRepr;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false, length = 512)
    private String password;

    @Column
    private String email;

    public User() {
    }

    public User(String username){
        this.username = username;
    }

    public User(UserRepr user){
        this.id = user.getId();
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.email = user.getEmail();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) { this.password = password; }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
