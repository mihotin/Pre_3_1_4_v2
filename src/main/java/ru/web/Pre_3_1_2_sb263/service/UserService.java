package ru.web.Pre_3_1_2_sb263.service;
import org.springframework.security.crypto.password.PasswordEncoder;
import ru.web.Pre_3_1_2_sb263.model.User;

import java.util.List;

public interface UserService {

    void save(User user);

    void delete(Long id);

    void update(Long id, User updateUser);

    User findUserByName(String username);
    User getOne(Long id);
    List<User> getAll();
    PasswordEncoder getPasswordEncoder();
}
