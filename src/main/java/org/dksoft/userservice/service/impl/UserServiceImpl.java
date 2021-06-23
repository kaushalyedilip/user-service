package org.dksoft.userservice.service.impl;

import org.dksoft.userservice.entity.User;
import org.dksoft.userservice.repository.UserRepository;
import org.dksoft.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsersWithPagination(Integer pageNumber, Integer pageSize) {

        Pageable pageable = PageRequest.of(pageNumber, pageSize);

        Page<User> page = userRepository.findAll(pageable);

        return page.getContent();
    }
}
