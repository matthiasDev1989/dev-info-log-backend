package mn.devinfologbackend.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Getter
@Setter
@ToString
@MappedSuperclass
public class LogItem extends EntityBase {
    String description;
    @ManyToOne(optional = false)
    @JoinColumn(name = "author_id", nullable = false)
    User author;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    Date creationTimestamp;
    boolean isPublicAvailable;
    boolean isModifiable;
}
