package mn.devinfologbackend.repositories;

import mn.devinfologbackend.domain.IssueLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IssueLogRepository extends CrudRepository<IssueLog, UUID> {
}
