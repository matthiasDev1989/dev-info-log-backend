package mn.devinfologbackend.repositories;

import mn.devinfologbackend.domain.InfoLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface InfoLogRepository extends CrudRepository<InfoLog, UUID> {
}
