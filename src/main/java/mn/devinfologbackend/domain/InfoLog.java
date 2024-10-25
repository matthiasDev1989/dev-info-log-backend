package mn.devinfologbackend.domain;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InfoLog extends LogItem {
    private Set<String> referenceLinks;
}
