package model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User implements Serializable {

    @Id
    @Column(unique = true)
    private String username;
    private String firstName;
    private Date birthdate;
    private String password;
    private String role;

}
