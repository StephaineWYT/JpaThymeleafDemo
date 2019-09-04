package wen.JpaThymeleafDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wen.JpaThymeleafDemo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findById(long id);

    void deleteById(Long id);
}
