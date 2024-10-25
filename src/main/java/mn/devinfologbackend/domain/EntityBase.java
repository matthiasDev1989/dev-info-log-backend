package mn.devinfologbackend.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

/**
 * Simple JavaBean domain object with an id property. Used as a base class for objects needing this property.
 *
 * @author Matthias Niemann
 */

@Getter
@Setter
@ToString
@MappedSuperclass
public class EntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected UUID uuid;

    public boolean isNew() {
        return uuid == null;
    }
}
