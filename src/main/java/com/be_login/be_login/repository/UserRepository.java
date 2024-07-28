package com.be_login.be_login.repository;

import com.be_login.be_login.dto.reponse.UserResponse;
import com.be_login.be_login.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
//    @Query("SELECT new com.TestLogin.TestLogin.dto.response.UserResponse(u.id, u.name, u.email) " +
//            "FROM User u " +
//            "WHERE u.email = :email " +
//            "AND u.password = :password")
//    UserResponse getUserInfo(@Param("email") String email, @Param("password") String password);

    Optional<UserResponse> findByEmailAndPassword(String email, String password);
}
