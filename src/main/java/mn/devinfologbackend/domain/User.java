package mn.devinfologbackend.domain;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User extends EntityBase {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
}
