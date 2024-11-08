package demo.service;

import demo.domain.modelo.User;
public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}