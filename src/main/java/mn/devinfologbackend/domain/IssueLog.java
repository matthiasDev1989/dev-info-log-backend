package mn.devinfologbackend.domain;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class IssueLog extends LogItem {
    private String solutionApproach;
}
