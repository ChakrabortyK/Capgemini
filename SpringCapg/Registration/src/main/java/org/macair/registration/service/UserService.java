package org.macair.registration.service;

import org.macair.registration.model.User;
import org.macair.registration.model.dto.AuthLoginResponse;
import org.macair.registration.model.dto.AuthSignupResponse;
import org.macair.registration.model.dto.UserResponse;
import org.macair.registration.repo.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    boolean passIsMatched(Optional<User> user, String reqpassword){
        boolean isMatch = Objects.equals(user.get().getPassword(), reqpassword);
        return isMatch;
    }

    public List<UserResponse> getAllUsers() {
        List<User> users = repo.findAll();

        //GPT idea to remove password
        return users.stream()
                .map(user -> new UserResponse(user.getId(), user.getUsername()))
                .toList();
    }

    public AuthSignupResponse signup(User user) {
        Optional<User> userFound = repo.findByUsername(user.getUsername());

        if (userFound.isPresent()) {
            return new AuthSignupResponse(user.getUsername(), false);
        }

        repo.save(user);
        return new AuthSignupResponse(user.getUsername(), true);
    }



    public AuthLoginResponse login(String username, String password) {
        Optional<User> user = repo.findByUsername(username);

        if ((!user.isPresent()) || !passIsMatched(user,password))
            return new AuthLoginResponse(username,false);

        return new AuthLoginResponse(username,true);

    }

    public AuthLoginResponse deleteUser(String username, String password) {
        Optional<User> user = repo.findByUsername(username);

        if (user.isEmpty()) {
            return new AuthLoginResponse("Invalid credentials", false); //DEV purposes only
        }

        if (!passIsMatched(user, password)) {
            return new AuthLoginResponse("Invalid credentials", false);
        }

        repo.deleteById(user.get().getId());
        return new AuthLoginResponse(user.get().getUsername(), true);
    }
}
