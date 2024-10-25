package mn.devinfologbackend.services.impl;

import mn.devinfologbackend.domain.AppUser;
import mn.devinfologbackend.repositories.UserRepository;
import mn.devinfologbackend.services.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public AppUser saveOrUpdate(AppUser user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteById(UUID uuid) {
        userRepository.deleteById(uuid);
    }

    @Override
    public Optional<AppUser> findById(UUID uuid) {
        return userRepository.findById(uuid);
    }

    @Override
    public Iterable<AppUser> findAll() {
        return userRepository.findAll();
    }
}
