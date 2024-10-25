package mn.devinfologbackend.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import mn.devinfologbackend.domain.enums.Tag;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Getter
@Setter
@ToString
@MappedSuperclass
public class LogItem extends EntityBase {
    private String description;
    @ManyToOne(optional = false)
    @JoinColumn(name = "appuser_id", nullable = false)
    private AppUser author;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationTimestamp;
    private boolean isPublicAvailable;
    private boolean isModifiable;
    private Tag tag;
}
