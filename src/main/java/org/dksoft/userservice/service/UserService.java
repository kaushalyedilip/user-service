package org.dksoft.userservice.service;

import org.dksoft.userservice.entity.User;

import java.util.List;

public interface UserService {

    List<User> getUsersWithPagination(Integer pageNumber, Integer pageSize);
}
