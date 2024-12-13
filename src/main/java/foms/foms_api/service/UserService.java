package foms.foms_api.service;

import foms.foms_api.entity.User;
import foms.foms_api.model.payload.RegisterUserPayload;
import foms.foms_api.repository.UserRepository;
import foms.foms_api.utils.BCrypt;
import jakarta.transaction.Transactional;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Validator validator;

    @Transactional
    public void register(RegisterUserPayload payload) {
        Set<ConstraintViolation<RegisterUserPayload>> constraintViolations = validator.validate(payload);

        if (constraintViolations.size() != 0) {
            throw new ConstraintViolationException(constraintViolations);
        }

        if (userRepository.existsById(payload.getEmail())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Email already registered");
        }

        User user = new User();
        user.setEmail(payload.getEmail());
        user.setPassword(BCrypt.hashpw(payload.getPassword(), BCrypt.gensalt()));
        user.setRole(payload.getRole());

        userRepository.save(user);
    }
}
