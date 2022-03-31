package edutech.service;

import edutech.entity.User;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserService {
    public User saveUser(User user);

    public List<User> getAllUsers();

    public User findUserByLogs(String email, String password);

}
