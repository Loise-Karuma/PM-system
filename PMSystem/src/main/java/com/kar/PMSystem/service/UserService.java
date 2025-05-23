package com.kar.PMSystem.service;

import com.kar.PMSystem.model.User;

public interface UserService {

    User findUserProfileByJwt(String jwt) throws Exception;

    User findUserByEmail(String email) throws Exception;

    User findUserById(Long userId) throws Exception;

// when a user adds a new project, it increases the project size
    User updateUsersProjectSize(User user, int number) throws Exception;

}
