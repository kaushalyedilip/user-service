package org.dksoft.userservice.service;

import org.dksoft.userservice.entity.User;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {

    List<User> getUsersWithPagination(Pageable pageable);
}
