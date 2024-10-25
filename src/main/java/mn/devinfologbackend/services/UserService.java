package mn.devinfologbackend.services;

import mn.devinfologbackend.domain.AppUser;

import java.util.Optional;
import java.util.UUID;

public interface UserService {
    AppUser saveOrUpdate(AppUser user);

    void deleteById(UUID uuid);

    Optional<AppUser> findById(UUID uuid);

    Iterable<AppUser> findAll();
}
